package com.orange.barrage.model.chat;

/**
 * Created by pipi on 15/4/18.
 */
public class OnlineAgentManager {
    private static OnlineAgentManager ourInstance = new OnlineAgentManager();

    public static OnlineAgentManager getInstance() {
        return ourInstance;
    }

    private OnlineAgentManager() {
    }

    public Agent assignAgent(Chat chat) {
        return null;
    }
}
