package com.orange.barrage.service.feed;

import com.googlecode.protobuf.format.JsonFormat;
import com.mongodb.BasicDBObject;
import com.mongodb.DBObject;
import com.mongodb.util.JSON;
import com.orange.barrage.common.CommonModelService;
import com.orange.barrage.constant.BarrageConstants;
import com.orange.barrage.model.feed.Feed;
import com.orange.barrage.model.feed.UserTimelineFeedManager;
import com.orange.common.utils.StringUtil;
import com.orange.protocol.message.BarrageProtos;
import com.orange.protocol.message.ErrorProtos;
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

        DBObject obj = Feed.pbToDBObject(feed, true, BarrageConstants.F_FEED_ID);
        String feedId = obj.get("_id").toString();

        mongoDBClient.insert(BarrageConstants.T_FEED, obj);

        insertUserTimelines(userId, toUserList, feedId.toString());

        // TODO insert into user create list

        rspBuilder.setFeedId(feedId.toString());
        return 0;
    }

    public int deleteFeedAction(String feedId, String actionId, MessageProtos.PBDeleteFeedActionResponse.Builder rspBuilder) {

        if (StringUtil.isEmpty(feedId)){
            return ErrorProtos.PBError.ERROR_FEED_ID_NULL_VALUE;
        }

        if (StringUtil.isEmpty(actionId)){
            return ErrorProtos.PBError.ERROR_FEED_ACTION_ID_NULL_VALUE;
        }

        BasicDBObject query = new BasicDBObject();
        query.put("_id", new ObjectId(feedId));

        BasicDBObject pullValue = new BasicDBObject();
        pullValue.put(BarrageConstants.F_ACTIONS+"."+BarrageConstants.F_ACTION_ID, actionId);

        BasicDBObject pull = new BasicDBObject("$pull", pullValue);

        log.info("<deleteFeedAction> query="+query.toString()+", pull="+pull.toString());
        mongoDBClient.updateAll(BarrageConstants.T_FEED, query, pull);

        return 0;
    }

    public int deleteFeed(String feedId, MessageProtos.PBDeleteFeedResponse.Builder rspBuilder) {
        if (StringUtil.isEmpty(feedId)){
            return ErrorProtos.PBError.ERROR_FEED_ID_NULL_VALUE;
        }

        BasicDBObject query = new BasicDBObject();
        query.put("_id", new ObjectId(feedId));

        log.info("<deleteFeed> query="+query.toString());
        mongoDBClient.remove(BarrageConstants.T_FEED, query);
        return 0;
    }
}
