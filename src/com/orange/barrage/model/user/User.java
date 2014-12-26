package com.orange.barrage.model.user;

import com.google.protobuf.GeneratedMessage;
import com.google.protobuf.Message;
import com.googlecode.protobuf.format.JsonFormat;
import com.mongodb.BasicDBObject;
import com.mongodb.DBObject;
import com.mongodb.util.JSON;
import com.orange.barrage.constant.BarrageConstants;
import com.orange.common.elasticsearch.ESORMable;
import com.orange.common.utils.MapUtil;
import com.orange.game.model.common.ProtoBufCoding;
import com.orange.game.model.dao.CommonData;
import com.orange.network.game.protocol.message.GameMessageProtos;
import com.orange.network.game.protocol.model.GroupProtos;
import com.orange.protocol.message.BarrageProtos;
import com.orange.protocol.message.UserProtos;
import org.bson.types.ObjectId;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * Created by pipi on 14/12/8.
 */
public class User extends CommonData implements ProtoBufCoding<UserProtos.PBUser>, ESORMable, MapUtil.MakeMapable<ObjectId, User> {

    public User(DBObject dbObject) {
        super(dbObject);
    }

    public User() {
        super();
    }

    public Map<String, Object> getESORM() {
        return null;
    }

    public String getESIndexType() {
        return null;
    }

    public String getESIndexName() {
        return null;
    }

    public String getID() {
        return null;
    }

    public boolean hasFieldForSearch() {
        return false;
    }

    public boolean canBeIndexed() {
        return false;
    }

    public ObjectId getKey() {
        return null;
    }

    public User getValue() {
        return null;
    }

    public UserProtos.PBUser toProtoBufModel() {
        UserProtos.PBUser.Builder builder = UserProtos.PBUser.newBuilder();
        return toPB(builder, null);
    }


    public void addIntoResponse(GameMessageProtos.DataQueryResponse.Builder builder) {

    }

    public static String getPbKeyFieldName(){
        return BarrageConstants.F_USER_ID;
    }

    public Class getPBClass(){
        return UserProtos.PBUser.class;
    }

    public String getUserId() {
        return getStringObjectId();
    }

    public BasicDBObject toFriendDBObject(DBObject info) {
        BasicDBObject obj = new BasicDBObject();
        obj.put(BarrageConstants.F_FRIEND_ID, getObjectId());
        obj.putAll(info);
        return obj;
    }

    public BasicDBObject toFriendRequestDBObject(DBObject info, int direction) {
        BasicDBObject obj = new BasicDBObject();
        obj.put(BarrageConstants.F_FRIEND_ID, getObjectId());
        obj.put(BarrageConstants.F_DIRECTION, direction);
        obj.putAll(info);
        return obj;
    }

    public static BasicDBObject getPublicReturnFields() {
        BasicDBObject obj = new BasicDBObject();
        obj.put(BarrageConstants.F_NICK, 1);
        obj.put(BarrageConstants.F_USER_ID, 1);
        obj.put(BarrageConstants.F_LOCATION, 1);
        obj.put(BarrageConstants.F_AVATAR, 1);
        obj.put(BarrageConstants.F_SIGNATURE, 1);
        obj.put(BarrageConstants.F_AVATAR_BG, 1);
        obj.put(BarrageConstants.F_GENDER, 1);
        return obj;
    }

    public static BasicDBObject getMinReturnFields() {
        BasicDBObject obj = new BasicDBObject();
        obj.put(BarrageConstants.F_NICK, 1);
        obj.put(BarrageConstants.F_USER_ID, 1);
        obj.put(BarrageConstants.F_AVATAR, 1);
        obj.put(BarrageConstants.F_SIGNATURE, 1);
        obj.put(BarrageConstants.F_GENDER, 1);
        return obj;
    }
}
