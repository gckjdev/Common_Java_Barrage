package com.orange.barrage.model.feed;

import com.mongodb.DBObject;
import com.orange.game.model.dao.CommonData;

/**
 * Created by pipi on 14/12/8.
 */
public class Feed extends CommonData {

    public Feed(DBObject dbObject) {
        super(dbObject);
    }

    public Feed() {
        super();
    }

}
