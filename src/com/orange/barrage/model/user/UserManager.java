package com.orange.barrage.model.user;

import com.mongodb.BasicDBObject;
import com.mongodb.DBCursor;
import com.mongodb.DBObject;
import com.orange.barrage.common.CommonModelManager;
import com.orange.barrage.constant.BarrageConstants;
import com.orange.game.constants.DBConstants;
import com.orange.protocol.message.MessageProtos;
import com.orange.protocol.message.UserProtos;
import org.bson.types.ObjectId;

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

    public int updateUser(String userId, UserProtos.PBUser pbUser, MessageProtos.PBUpdateUserInfoResponse.Builder builder) {

        BasicDBObject query = new BasicDBObject();
        query.put("_id", new ObjectId(userId));

        DBObject updateObj = User.pbToDBObject(pbUser);
        BasicDBObject update = new BasicDBObject();
        update.put("$set", updateObj);

        log.info("<updateUser> query="+query.toString()+",update="+update.toString());
        DBObject obj = mongoDBClient.findAndModify(BarrageConstants.T_USER, query, update);
        if (obj != null){
            User user = new User(obj);
            UserProtos.PBUser retPBUser = user.toProtoBufModel();
            builder.setUser(retPBUser);
        }

        return 0;
    }
}
