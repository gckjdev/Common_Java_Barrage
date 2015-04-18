package com.orange.barrage.service.push;

/**
 * Created by pipi on 15/4/17.
 */
public class PushService {
    private static PushService ourInstance = new PushService();

    public static PushService getInstance() {
        return ourInstance;
    }

    MiPushManager androidManager;
    MiPushManager iOSManager;

    private PushService() {
        iOSManager = new MiPushManager("z9PH0haNBsxcVVw2ahUzIA==");
    }

    public void sendMessage(){

    }
}
