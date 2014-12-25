package com.orange.barrage.model.user;

import com.mongodb.DBCursor;
import com.mongodb.DBObject;
import com.orange.barrage.common.CommonModelManager;
import com.orange.barrage.constant.BarrageConstants;
import com.orange.game.constants.DBConstants;
import com.orange.protocol.message.UserProtos;

/**
 * Created by pipi on 14/12/2.
 */
public class UserManager extends CommonModelManager<User> {
    private static UserManager ourInstance = new UserManager();

    public static UserManager getInstance() {
        return ourInstance;
    }

    private UserManager() {
    }


    public static UserProtos.PBUser findUser(String fieldName, String value) {
        DBCursor cursor = mongoDBClient.find(BarrageConstants.T_USER, fieldName, value);
        return null;
    }

    public User findUserById(String friendId) {
        return findObjectById(friendId);
    }

    @Override
    public String getTableName() {
        return BarrageConstants.T_USER;
    }

    @Override
    public Class getClazz() {
        return User.class;
    }
}
