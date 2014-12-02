package com.orange.barrage.common;

import com.orange.common.cassandra.CassandraClient;
import com.orange.common.mongodb.MongoDBClient;
import com.orange.common.redis.RedisClient;
import com.orange.game.model.service.DBService;

/**
 * Created by pipi on 14/12/2.
 */
public class CommonModelService {

    public MongoDBClient mongoDBClient = DBService.getInstance().getMongoDBClient();
    public RedisClient redisClient = RedisClient.getInstance();
    public CassandraClient cassandraClient = CassandraClient.getInstance();

}
