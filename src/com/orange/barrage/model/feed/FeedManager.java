package com.orange.barrage.model.feed;

/**
 * Created by pipi on 14/12/8.
 */
public class FeedManager {
    private static FeedManager ourInstance = new FeedManager();

    public static FeedManager getInstance() {
        return ourInstance;
    }

    private FeedManager() {
    }
}
