package com.orange.barrage.manager.user;

import com.mongodb.DBCursor;
import com.orange.barrage.common.CommonModelManager;
import com.orange.game.constants.DBConstants;
import com.orange.protocol.message.UserProtos;

/**
 * Created by pipi on 14/12/2.
 */
public class ShareUserManager extends CommonModelManager {
    private static ShareUserManager ourInstance = new ShareUserManager();

    public static ShareUserManager getInstance() {
        return ourInstance;
    }

    private ShareUserManager() {
    }


    public static UserProtos.PBUser findUser(String fieldName, String value) {
        DBCursor cursor = mongoDBClient.find(DBConstants.T_USER, fieldName, value);
        return null;
    }
}
