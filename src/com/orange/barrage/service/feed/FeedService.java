package com.orange.barrage.service.feed;

import com.googlecode.protobuf.format.JsonFormat;
import com.mongodb.DBObject;
import com.mongodb.util.JSON;
import com.orange.barrage.common.CommonModelService;
import com.orange.barrage.constant.BarrageConstants;
import com.orange.barrage.model.feed.Feed;
import com.orange.barrage.model.feed.UserTimelineFeedManager;
import com.orange.protocol.message.BarrageProtos;
import com.orange.protocol.message.MessageProtos;
import com.orange.protocol.message.UserProtos;
import org.bson.types.ObjectId;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * Created by pipi on 14/12/8.
 */
public class FeedService extends CommonModelService {
    private static FeedService ourInstance = new FeedService();

    public static FeedService getInstance() {
        return ourInstance;
    }

    private FeedService() {
    }

    public void insertUserTimelines(String userId, List<UserProtos.PBUser> toUserList, String feedId){
        // add index tables
        Set<String> insertUserList = new HashSet<String>();
        insertUserList.add(userId);
        if (toUserList != null) {
            for (UserProtos.PBUser toUser : toUserList) {
                String toUserId = toUser.getUserId();
                insertUserList.add(toUserId);
            }
        }

        for (String toUserId : insertUserList) {
            UserTimelineFeedManager.getInstance().insertUserFeed(toUserId, feedId.toString(), "");
        }

    }

    public int createFeed(BarrageProtos.PBFeed feed, MessageProtos.PBCreateFeedResponse.Builder rspBuilder) {

        String userId = feed.getCreateUser().getUserId();
        List<UserProtos.PBUser> toUserList = feed.getToUsersList();

//        String jsonString = JsonFormat.printToString(feed);
        DBObject obj = Feed.pbToDBObject(feed, true); // JSON.parse(jsonString);

        // set feed ID
        String feedId = obj.get("_id").toString(); //Feed.generateObjectId(obj);
//        ObjectId feedId = new ObjectId();
//        obj.put("_id", feedId);
//        obj.put(BarrageConstants.F_FEED_ID, feedId.toString());

        mongoDBClient.insert(BarrageConstants.T_FEED, obj);

        insertUserTimelines(userId, toUserList, feedId.toString());

        // TODO insert into user create list

        rspBuilder.setFeedId(feedId.toString());
        return 0;
    }
}
