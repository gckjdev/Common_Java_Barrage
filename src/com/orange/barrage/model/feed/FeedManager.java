package com.orange.barrage.model.feed;

import com.googlecode.protobuf.format.JsonFormat;
import com.mongodb.BasicDBObject;
import com.mongodb.DBObject;
import com.mongodb.util.JSON;
import com.orange.barrage.common.CommonModelManager;
import com.orange.barrage.constant.BarrageConstants;
import com.orange.game.constants.DBConstants;
import com.orange.protocol.message.BarrageProtos;
import com.orange.protocol.message.ErrorProtos;
import com.orange.protocol.message.MessageProtos;
import org.bson.types.ObjectId;

/**
 * Created by pipi on 14/12/8.
 */
public class FeedManager extends CommonModelManager {
    private static FeedManager ourInstance = new FeedManager();

    public static FeedManager getInstance() {
        return ourInstance;
    }

    private FeedManager() {
    }

    public int replyFeed(BarrageProtos.PBFeedAction action, MessageProtos.PBReplyFeedResponse.Builder rspBuilder) {

        String feedId = action.getFeedId();

        BasicDBObject query = new BasicDBObject();
        query.put("_id", new ObjectId(feedId));

        String jsonString = JsonFormat.printToString(action);
        DBObject obj = (DBObject) JSON.parse(jsonString);
        if (obj == null || obj.keySet().size() == 0){
            return ErrorProtos.PBError.ERROR_FEED_ACTION_INVALID_VALUE;
        }

        // set acitonId
        ObjectId actionId = new ObjectId();
        obj.put(BarrageConstants.F_ACTION_ID, actionId.toString());

        DBObject pushUpdate = new BasicDBObject();
        pushUpdate.put(BarrageConstants.F_ACTIONS, obj);

        BasicDBObject update = new BasicDBObject();
        update.put("$push", pushUpdate);

        mongoDBClient.updateAll(BarrageConstants.T_FEED, query, update);

        // insert into related index tables

        return 0;
    }
}
