package com.orange.barrage.model.user;

import com.mongodb.DBObject;
import com.orange.game.model.dao.CommonData;

/**
 * Created by pipi on 14/12/8.
 */
public class User extends CommonData {

    public User(DBObject dbObject) {
        super(dbObject);
    }

    public User() {
        super();
    }

}
