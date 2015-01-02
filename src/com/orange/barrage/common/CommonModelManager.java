package com.orange.barrage.common;

import com.google.protobuf.GeneratedMessage;
import com.mongodb.DBCursor;
import com.mongodb.DBObject;
import com.orange.barrage.model.user.User;
import com.orange.common.cassandra.CassandraClient;
import com.orange.common.mongodb.MongoDBClient;
import com.orange.common.redis.RedisClient;
import com.orange.common.utils.StringUtil;
import com.orange.game.constants.DBConstants;
import com.orange.game.model.dao.CommonData;
import com.orange.game.model.service.DBService;
import com.orange.protocol.message.BarrageProtos;
import org.apache.log4j.Logger;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

/**
 * Created by pipi on 14/12/2.
 */
public abstract class CommonModelManager<T extends CommonData> {

    public static MongoDBClient mongoDBClient = DBService.getInstance().getMongoDBClient();
    public static RedisClient redisClient = RedisClient.getInstance();
    public static CassandraClient cassandraClient = CassandraClient.getInstance();
    public static final Logger log = Logger.getLogger(CommonModelManager.class.getName());

    public abstract String getTableName();
    public abstract Class<T> getClazz();

    protected T newClassInstance(Class<T> clazz) {
        try {
            return clazz.newInstance();
        } catch (InstantiationException e) {
            log.error("<newClassInstance> catch exception " + e.toString(), e);
            return null;
        } catch (IllegalAccessException e) {
            log.error("<newClassInstance> catch exception" + e.toString(), e);
            return null;
        }
    }

    public T findObjectById(String keyId) {

        DBObject dbObject = mongoDBClient.findOneByObjectId(getTableName(), keyId);
        if (dbObject == null){
            return null;
        }

        T t = newClassInstance(getClazz());
        t.setDbObject(dbObject);
        return t;
    }

    public T findObjectByField(String field, String value) {

        if (StringUtil.isEmpty(field) || StringUtil.isEmpty(value)){
            return null;
        }

        DBCursor cursor = mongoDBClient.find(getTableName(), field, value, 1);
        if (cursor == null || cursor.hasNext()){
            return null;
        }

        DBObject dbObject = cursor.next();
        if (dbObject == null){
            return null;
        }

        T t = newClassInstance(getClazz());
        t.setDbObject(dbObject);
        return t;
    }

}
