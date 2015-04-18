package com.orange.barrage.service.chat;

import com.orange.barrage.model.chat.*;
import com.orange.protocol.message.MessageProtos;
import com.orange.protocol.message.UserProtos;

/**
 * Created by pipi on 15/4/18.
 */
public class ChatService {
    private static ChatService ourInstance = new ChatService();

    public static ChatService getInstance() {
        return ourInstance;
    }

    private ChatService() {
    }

    public int sendChat(UserProtos.PBChat pbChat, MessageProtos.PBSendChatResponse.Builder rspBuilder) {


        // create chat into db
        Chat chat = ChatManager.getInstance().createChat(pbChat);

        String userId = pbChat.getFromUserId();
        String chatId = chat.getChatId();

        // create user chat index
        UserChatManager.getInstance().insertUserChat(userId, chatId, "");

        String agentId = chat.getToUserId();
        if (agentId == null) {
            // assign agent
            Agent agent = OnlineAgentManager.getInstance().assignAgent(chat);
            if (agent != null) {
                // update agent in chat
                ChatManager.getInstance().updateChatToUser(chat, agent);
            }
        }

        // increase agent counter
        int counter = UserChatCounterManager.getInstance().incAgentChatCounter(agentId);

        // TODO notify agent
//        OnlineAgentManager.getInstance().notifyAgentNewMessage(agent, counter);



        return 0;
    }
}
