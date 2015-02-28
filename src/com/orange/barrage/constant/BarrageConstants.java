package com.orange.barrage.constant;

import com.mongodb.DBObject;

/**
 * Created by pipi on 14/12/2.
 */
public class BarrageConstants {

    public static final String F_ID = "_id";

    public static final String F_USER_ID = "userId";
    public static final String T_USER = "user";
    public static final String T_FRIEND = "friend";
    public static final String T_FRIEND_REQUEST = "friend_request";
    public static final String T_FEED = "feed";
    public static final String T_USER_FEED_TIMELINE = "user_feed_timeline";
    public static final String T_USER_TAG = "user_tag";
    public static final String T_USER_INVITE_CODES = "user_invite_codes";

    public static final String F_EMAIL = "email";
    public static final String F_FEED_ID = "feedId";
    public static final String F_ACTIONS = "actions";
    public static final String F_ACTION_ID = "actionId";
    public static final String F_FRIEND_ID = "friendId";
    public static final String F_TAG_ID = "tid";
    public static final String F_USER_IDS = "userIds";

    public static final String F_ADD_DATE = "addDate";
    public static final String F_ADD_SOURCE = "addSource";
    public static final String F_DIRECTION = "addDir";
    public static final String F_ADD_STATUS = "addStatus";

    public static final String F_REPLY_MEMO = "replyMemo";
    public static final String F_MEMO = "memo";

    public static final String F_NICK = "nick";
    public static final String F_LOCATION = "location";
    public static final String F_AVATAR = "avatar";
    public static final String F_SIGNATURE = "signature";
    public static final String F_AVATAR_BG = "avatarBg";
    public static final String F_GENDER = "gender";

    public static final String F_SNS_USERS = "snsUsers";
    public static final String F_SINA_NICK = "sina_nick";
    public static final String F_QQ_NICK = "qq_nick";
    public static final String F_WEIXIN_NICK = "weixin_nick";

    public static final String F_MOBILE = "mobile";
    public static final String F_WEIXIN_ID = "weixinId";
    public static final String F_SINA_ID = "sinaId";
    public static final String F_QQ_OPEN_ID = "qqOpenId";
    public static final String F_PASSWORD = "password";
    public static final String F_TAG_LIST = "tags";
    public static final String F_MODIFY_DATE = "mDate";

    public static final int C_SHARE_WEIBO = 1;
    public static final int C_SHARE_QQ_ZONE = 9;
    public static final int C_SHARE_QQ = 24;
    public static final int C_SHARE_WEIXIN_TIMELINE = 22;
    public static final int C_SHARE_WEIXIN_SESSION = 23;

    // elastic search index name & type
    public static final String ES_INDEX_NAME_BARRAGE = "barrage";       // like DB name
    public static final String ES_INDEX_TYPE_USER = "user";             // like table name
    public static final String ES_INDEX_TYPE_FEED = "feed";
    public static final String ES_INDEX_TYPE_FEED_ACTION = "feed_action";

    public static final String F_AVAILABLE_CODES = "availableCodes";
    public static final String F_SENT_CODES = "sentCodes";
    public static final String F_APPLY_COUNT = "applyCount";
    public static final String F_CODE = "code";
    public static final String F_STATUS = "status";
}
