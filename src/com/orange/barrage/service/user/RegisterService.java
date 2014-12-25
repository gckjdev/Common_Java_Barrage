package com.orange.barrage.service.user;

import com.googlecode.protobuf.format.JsonFormat;
import com.mongodb.DBObject;
import com.mongodb.util.JSON;
import com.orange.barrage.common.CommonModelService;
import com.orange.barrage.constant.BarrageConstants;
import com.orange.barrage.model.user.User;
import com.orange.game.api.service.CommonGameService;
import com.orange.protocol.message.MessageProtos;
import com.orange.protocol.message.UserProtos;
import org.bson.types.ObjectId;

/**
 * Created by pipi on 14/12/2.
 */
public class RegisterService extends CommonModelService {
    private static RegisterService ourInstance = new RegisterService();

    public static RegisterService getInstance() {
        return ourInstance;
    }

    private RegisterService() {

    }

    public int registerByEmail(UserProtos.PBUser user, MessageProtos.PBRegisterUserResponse.Builder rspBuilder) {

//        String jsonString = JsonFormat.printToString(user);
        DBObject obj = User.pbToDBObject(user, true); //JSON.parse(jsonString);
        String userId = obj.get("_id").toString();

//        ObjectId userId = new ObjectId();
//        obj.put("_id", userId);
//        obj.put(BarrageConstants.F_USER_ID, userId.toString());

        mongoDBClient.insert(BarrageConstants.T_USER, obj);

        // set response builder
        UserProtos.PBUser.Builder retUserBuilder = UserProtos.PBUser.newBuilder(user);
        retUserBuilder.setUserId(userId.toString());
        rspBuilder.setUser(retUserBuilder.build());
        return 0;
    }
}
