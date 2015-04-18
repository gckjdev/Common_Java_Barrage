package com.orange.barrage.model.chat;

import com.orange.common.redis.RedisClient;
import com.orange.common.utils.PropertyUtil;

/**
 * Created by pipi on 15/4/18.
 */

// 记录用户和客服新消息的对象
public class UserChatCounterManager {

    private static final String REDIS_SERVER = PropertyUtil.getStringProperty("redis_userchat.address", "localhost");
    private static final int REDIS_PORT = PropertyUtil.getIntProperty("redis_userchat.port", 6379);
    private static final String REDIS_PASSWORD = PropertyUtil.getStringProperty("redis_userchat.password", null);

    private static UserChatCounterManager ourInstance = new UserChatCounterManager();

    public static UserChatCounterManager getInstance() {
        return ourInstance;
    }

    RedisClient redisClient = RedisClient.getInstance(REDIS_SERVER, REDIS_PORT, REDIS_PASSWORD);

    private UserChatCounterManager() {
    }

    public int incUserChatCounter(String userId){
        return 0;
    }

    public int incAgentChatCounter(String userId){
        return 0;
    }

    public void clearUserChatCounter(String userId){
    }

    public void clearAgentChatCounter(String userId){
    }

}
