package com.orange.barrage.model.user;

import com.orange.barrage.common.CommonModelManager;
import com.orange.common.redis.RedisCallable;
import com.orange.common.redis.RedisClient;
import com.orange.common.utils.RandomUtil;
import com.orange.common.utils.StringUtil;
import com.orange.game.model.dao.CommonData;
import com.orange.protocol.message.ErrorProtos;
import redis.clients.jedis.Jedis;
import redis.clients.jedis.Pipeline;

import java.util.*;

/**
 * Created by pipi on 14/12/27.
 */
public class InviteCodeManager extends CommonModelManager<CommonData> {
    private static final String INVITE_CODE_REDIS_KEY = "invite_code";
    private static final String CANDIDATE_CODE_REDIS_KEY = "invite_code_candidate";
    private static final String USED_CODE_REDIS_KEY = "invite_code_used";
    private static InviteCodeManager ourInstance = new InviteCodeManager();

    public static InviteCodeManager getInstance() {
        return ourInstance;
    }

    private InviteCodeManager() {
    }

    public int checkInviteCode(String code){

        return 0;
    }

    public Set<String> generateAllCandidateCode(boolean cleanExist){


        if (cleanExist){
            RedisClient.getInstance().del(CANDIDATE_CODE_REDIS_KEY);
        }

        final HashSet<String> codes = new HashSet<String>();
        RedisClient.getInstance().execute(new RedisCallable() {
            public Object call(Jedis jedis) {

                int MIN_CODE = 100000;
                int MAX_CODE = 999999;

                Pipeline p = jedis.pipelined();
                p.multi();

                for (int i=MIN_CODE; i<=MAX_CODE; i++){
                    String strCode = Integer.toString(i);
                    p.sadd(CANDIDATE_CODE_REDIS_KEY, strCode);
                    codes.add(strCode);
                }

                p.exec();
                p.sync();
                return null;
            }
        });

        log.info("<generateAllCandidateCode> done, total "+codes.size()+" inserted");
        return codes;
    }

    public int useInviteCode(final String code, final String userId){

        boolean valid = RedisClient.getInstance().zismember(INVITE_CODE_REDIS_KEY, code);
        if (!valid){
            if (RedisClient.getInstance().hget(USED_CODE_REDIS_KEY, code) != null){
                log.warn("<useInviteCode> but code "+code+" used");
                return ErrorProtos.PBError.ERROR_INVITE_CODE_USED_VALUE;
            }
            else {
                log.warn("<useInviteCode> but code "+code+" not exist");
                return ErrorProtos.PBError.ERROR_INVITE_CODE_NOT_EXIST_VALUE;
            }
        }

        boolean result = (Boolean)RedisClient.getInstance().execute(new RedisCallable() {
            public Object call(Jedis jedis) {

                Pipeline p = jedis.pipelined();
                p.multi();

                p.zrem(INVITE_CODE_REDIS_KEY, code);
                p.hset(USED_CODE_REDIS_KEY, code, userId);

                p.exec();
                List result = p.syncAndReturnAll();

                if (result == null){
                    log.warn("<useInviteCode> code "+code+" but execution failure");
                    return Boolean.FALSE;
                }

                log.warn("<useInviteCode> code "+code+" used successfully by "+userId);
                return Boolean.TRUE;
            }
        });

        return result ? 0 : ErrorProtos.PBError.ERROR_UNKNOWN_VALUE;
    }

    public Set<String> generateInviteCode(final int count){

        HashSet<String> codes = new HashSet<String>();
        List<String> retList = (List<String>)RedisClient.getInstance().execute(new RedisCallable() {
            public Object call(Jedis jedis) {

                // random get
                List<String> list = jedis.srandmember(CANDIDATE_CODE_REDIS_KEY, count);
                if (list == null || list.size() == 0){
                    log.warn("<generateInviteCode> but "+CANDIDATE_CODE_REDIS_KEY+" no members");
                    return Collections.emptyList();
                }

                // random add
                Map<String, Double> map = new HashMap<String, Double>();
                for (String code : list){
                    map.put(code, Double.valueOf(System.currentTimeMillis()));
                }
                jedis.zadd(INVITE_CODE_REDIS_KEY, map);
                log.info("<generateInviteCode> add list into "+INVITE_CODE_REDIS_KEY+" "+list.toString()+" done");

                // remove
                String[] arrList = (String[])list.toArray(new String[list.size()]);
                jedis.srem(CANDIDATE_CODE_REDIS_KEY, arrList);
                log.info("<generateInviteCode> remove list from " + CANDIDATE_CODE_REDIS_KEY);

                return list;
            }
        });

        codes.addAll(retList);
        return codes;
    }


    public String generateOneInviteCode(final String userId){

        final String code = (String)RedisClient.getInstance().execute(new RedisCallable() {
            public Object call(Jedis jedis) {

                // random get and pop
                String retCode = jedis.spop(CANDIDATE_CODE_REDIS_KEY);
                if (StringUtil.isEmpty(retCode)){
                    log.warn("<generateOneInviteCode> but "+CANDIDATE_CODE_REDIS_KEY+" no members");
                    return null;
                }

                // add into code pool
                jedis.zadd(INVITE_CODE_REDIS_KEY, System.currentTimeMillis(), retCode);
                log.info("<generateOneInviteCode> add into " + INVITE_CODE_REDIS_KEY + " " + retCode + " done");

                return retCode;
            }
        });

        return code;
    }

    public void testMe(){
        generateAllCandidateCode(true);
        generateInviteCode(50);
        String code = generateOneInviteCode("pipipeng");
        useInviteCode(code, "pipipeng");
        useInviteCode(code, "pipipeng");
        useInviteCode("123456", "pipipeng");

    }

    @Override
    public String getTableName() {
        return null;
    }

    @Override
    public Class<CommonData> getClazz() {
        return null;
    }
}
