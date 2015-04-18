package com.orange.barrage.model.chat;

import com.mongodb.DBObject;
import com.orange.barrage.common.CommonModelManager;
import com.orange.barrage.constant.BarrageConstants;
import com.orange.barrage.model.user.User;
import com.orange.common.utils.DateUtil;
import com.orange.game.api.service.ElasticsearchService;
import com.orange.game.model.manager.CommonManager;
import com.orange.protocol.message.UserProtos;

/**
 * Created by pipi on 15/4/18.
 */
public class ChatManager extends CommonModelManager<Chat> {
    private static ChatManager ourInstance = new ChatManager();

    public static ChatManager getInstance() {
        return ourInstance;
    }

    private ChatManager() {
    }

    public Chat createChat(UserProtos.PBChat chat) {

        UserProtos.PBChat.Builder builder = UserProtos.PBChat.newBuilder(chat);

        // set some auto creation data here
        builder.setCreateDate(DateUtil.getCurrentSeconds());

        DBObject obj = Chat.pbToDBObject(builder.build(), true, BarrageConstants.F_CHAT_ID);

        log.info("create chat = "+obj.toString());
        mongoDBClient.insert(BarrageConstants.T_USER, obj);

        Chat retObj = new Chat(obj);

        // TODO index in Elastic Search
//        ElasticsearchService.addOrUpdateIndex(retObj, mongoDBClient);
        return retObj;
    }

    @Override
    public String getTableName() {
        return BarrageConstants.T_CHAT;
    }

    @Override
    public Class<Chat> getClazz() {
        return Chat.class;
    }

    public void updateChatToUser(Chat chat, Agent agent) {
        // TODO
    }
}
