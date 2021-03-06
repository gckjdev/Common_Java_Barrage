package com.orange.game.constants;


import com.orange.game.model.manager.MessageManager;

import java.util.Date;

public class DBConstants {
	// user purchase item history
	// buy id, user id, item type, create date, amount, amount after buy, cost
	// coins, result

	// constants

	// user("device_id","device_model","device_os","device_token","language",
	// "country_code","create_date","source_id","subscribe")

	// DB User Fields

	// DB App fields
	// public static final String F_APPID = "appid";
	// public static final String F_NAME = "name";
	// public static final String F_DESC = "desc";

	// App Table

	public static final String D_GAME = "barrage";

	// tables
	public static final String T_USER = "user";


	public static final String T_FETCH_TASK = "task";
	public static final String T_PRODUCT = "product";
	public static final String T_IDX_PRODUCT_GPS = "address";
	public static final String T_APP = "app";
	public static final String T_KEYWORD_STAT = "keyword_stat";
	public static final String T_PUSH_MESSAGE = "push_message";
	public static final String T_RECOMMEND = "recommend";
	public static final String T_CATEGORY = "category";
	public static final String T_SHOPPING_CATEGORY = "shopping_category";
	public static final String T_AD = "ad";
	public static final String T_SPAM_NUMBER = "spam_number";

	public static final String T_USER_WALL_AWARD_HISTORY = "his_wall_award";
	public static final String T_USER_BUY_COINS_HISTORY = "his_coins";
	public static final String T_USER_BUY_ITEM_HISTORY = "his_items";
	public static final String T_USER_STATUS = "user_status";

	public static final String T_LATEST_FEED = "latest_feed";
	public static final String T_USER_OPUS_ACTION = "user_opus_action";

	// for download applications
	public static final String T_DOWNLOAD_SITE = "download_site";
	public static final String T_TOP_DOWNLOAD = "top_download";

	public static final String T_DRAW = "draw";
	public static final String T_GUESS = "guess";

	public static final String T_MESSAGE = "message";
	public static final String T_MESSAGE_STATISTIC = "message_stat";
    public static final String T_USER_MESSAGE_STAT = "new_message_stat";

	public static final String T_BULLETIN = "bulletin";
	public static final String T_USER_PUSH_INFO = "user_push_info";

	public static final String T_USER_AWARD_COUNTER = "user_award_counter";
	
	public static final String T_CACHE = "cache";
    public static final String T_CACHE_OPUS_MISSING = "cache_opus_missing";


    public static final String F_DRAW_USER_ID = "user_id";
	public static final String F_DRAW_NICK_NAME = "nick_name";
	public static final String F_DRAW_AVATAR = "avatar";
	public static final String F_DRAW_WORD = "word";
	public static final String F_DRAW_LEVEL = "level";
	public static final String F_DRAW_LANGUAGE = "lang";
	public static final String F_DRAW_CREATE_DATE = "create_date";
	public static final String F_DRAW_DATA = "data";
	public static final String F_DRAW_DATA_LEN = "data_len";
	public static final String F_DATA_LEN = "data_len";
	public static final String F_DRAW_RANDOM = "random";
	public static final String F_DRAW_VIEW_USER_LIST = "view_users";
	public static final String F_GUESS_WORD_LIST = "guess_list";
	public static final String F_DRAW_TYPE = "type";
	public static final String F_LATEST_MSG = "latest_msg";
	public static final String F_NEW_MSG_COUNT = "new_msg_cnt";
    public static final String F_NEW_GROUP_MSG_COUNT = "new_g_msg_cnt";
	public static final String F_TOTAL_MSG_COUNT = "total_msg_cnt";

	// user message table fields
	public static final String F_MESSAGE_ID = "_id";
	public static final String F_MESSAGE_FROM = "from";
	public static final String F_MESSAGE_TO = "to";
	public static final String F_MESSAGE_CREATE_DATE = "create_date";
	public static final String F_MESSAGE_DRAW_DATA = "draw_data";
	public static final String F_MESSAGE_TEXT = "text";
	public static final String F_MESSAGE_STATUS = "status";
    public static final String F_MESSAGE_CONTENT_TYPE = "c_type";

	public static final String F_MESSAGE_USER_ID = "user_id";
	public static final String F_MESSAGE_FRIEND_USER_ID = "f_user_id";
	public static final String F_MESSAGE_LATEST_MESSAGE_ID = "l_msg_id";
	public static final String F_MESSAGE_LATEST_MODIFY_DATE = "modify_date";
	public static final String F_MESSAGE_NEW_MESSAGE_COUNT = "n_msg_count";

	// user account
	public static final String F_ACCOUNT_BALANCE = "balance";
	public static final String F_ACCOUNT_INGOT_BALANCE = "ingot_balance";

	// user items
	public static final String F_ITEMS = "items";
	public static final String F_ITEM_TYPE = "type";
	public static final String F_ITEM_AMOUNT = "amount";

	// user purchase coins history
	// buy id, user id, coins amount, create date, coins balance, cost money,
	// result
	public static final String F_BUY_ID = "_id";
	public static final String F_BUY_AMOUNT = "buy_amount";
	public static final String F_BALANCE_AFTER_BUY = "balance_after";
	public static final String F_COST_MONEY = "cost_money";
	public static final String F_BUY_RESULT = "result";

	// user purchase item history
	// buy id, user id, item type, create date, amount, amount after buy, cost
	// coins, result
	public static final String F_AMOUNT_AFTER_BUY = "amount_after";
	public static final String F_COST_COIN = "cost_coin";

	// for download table
	public static final String F_DOWNLOAD_COUNT = "count";

	// fields
	public static final String F_TASK_STATUS = "status";
	public static final String F_TASK_URL = "url";
	public static final String F_TASK_FILE_PATH = "path";
	public static final String F_TASK_PARSER_TYPE = "parser";
	public static final String F_TASK_SITE_ID = "site_id";
	public static final String F_TASK_RETRY_TIMES = "retry";

	public static final String F_PUSH_MESSAGE_TRYCOUNT = "try_cnt";
	public static final String F_PUSH_MESSAGE_STATUS = "p_status";
	public static final String F_PUSH_MESSAGE_SCHEDULE_DATE = "sc_date";
	public static final String F_PUSH_MESSAGE_START_DATE = "s_date";
	public static final String F_PUSH_MESSAGE_FINISH_DATE = "f_date";
	public static final String F_PUSH_MESSAGE_ERROR_CODE = "err_code";
	public static final String F_PUSH_MESSAGE_TYPE = "type";
	public static final String F_PUSH_MESSAGE_SUBJECT = "p_sub";
	public static final String F_PUSH_MESSAGE_BODY = "p_body";
	public static final String F_PUSH_MESSAGE_IPHONE = "p_iphone";
	public static final String F_PUSH_MESSAGE_ANDROID = "p_android";

	public static final String F_PUSH_MESSAGE_WEIBO = "p_weibo";
	public static final String F_PUSH_MESSAGE_IMAGE = "p_image";

	public static final String F_PUSH_MESSAGE_REASON = "reason";

	public static final String F_RECOMMEND_STATUS = "r_status";
	public static final String F_RECOMMEND_COUNT = "r_count";
	public static final String F_RECOMMEND_DATE = "r_date";
	public static final String F_PUSH_COUNT = "p_count";
	public static final String F_PUSH_DATE = "p_date";

	// DB Friends Fields
	// public static final String F_FOLLOWS = "follows";
	// public static final String F_FANS = "fans";
	public static final String F_FRIENDID = "fid";

	// DB Robot Fields
	public static final String F_ISROBOT = "is_robot";

	// constants
	public static final int C_TASK_STATUS_NOT_RUNNING = 0;
	public static final int C_TASK_STATUS_RUNNING = 1;
	public static final int C_TASK_STATUS_DOWNLOAD_OK = 2;
	public static final int C_TASK_STATUS_CLOSE = 3;
	public static final int C_TASK_STATUS_FAILURE = 4;
	public static final int C_TASK_STATUS_FAIL_MAX_RETRY = 5;

	public static final int C_PUSH_MESSAGE_STATUS_NOT_RUNNING = 0;
	public static final int C_PUSH_MESSAGE_STATUS_RUNNING = 1;
	public static final int C_PUSH_MESSAGE_STATUS_CLOSED = 2;
	public static final int C_PUSH_MESSAGE_STATUS_FAILED = 3;

	public static final int C_PUSH_MESSAGE_TRY_COUNT_LIMIT = 100;
	public static final int C_PUSH_DAILY_LIMIT = 5;

	// failure reason
	public static final int C_PUSH_MESSAGE_FAIL_REACH_USER_LIMIT = 1001;

	public static final int C_RECOMMEND_STATUS_NOT_RUNNING = 0;
	public static final int C_RECOMMEND_STATUS_RUNNING = 1;
	public static final int C_RECOMMEND_STATUS_COLSE = 2;
	public static final int C_RECOMMEND_STATUS_FAILURE = 3;

	public static final int C_ITEM_NOT_SENT = 0;
	public static final int C_ITEM_SENT = 1;

	// major product or not
	public static final int C_NOT_MAJOR = 0;
	public static final int C_IS_MAJOR = 1;

	public static final int C_CATEGORY_UNKNOWN = 0;
	public static final int C_CATEGORY_EAT = 1;
	public static final int C_CATEGORY_FUN = 2;
	public static final int C_CATEGORY_FACE = 3;
	public static final int C_CATEGORY_SHOPPING = 4;
	public static final int C_CATEGORY_KEEPFIT = 5;
	public static final int C_CATEGORY_LIFE = 6;
	public static final int C_CATEGORY_FILM = 7;
	public static final int C_CATEGORY_COUPON = 8;
	public static final int C_CATEGORY_TRAVEL = 9;
	public static final int C_CATEGORY_HOTEL = 10;
	public static final int C_CATEGORY_PHOTO = 11;

	public static final String C_CATEGORY_NAME_UNKNOWN = "综合";
	public static final String C_CATEGORY_NAME_EAT = "美食";
	public static final String C_CATEGORY_NAME_FUN = "休闲";
	public static final String C_CATEGORY_NAME_FACE = "丽人";
	public static final String C_CATEGORY_NAME_SHOPPING = "网购";
	public static final String C_CATEGORY_NAME_KEEPFIT = "运动";
	public static final String C_CATEGORY_NAME_LIFE = "生活";
	public static final String C_CATEGORY_NAME_FILM = "电影票";
	public static final String C_CATEGORY_NAME_COUPON = "代金券";
	public static final String C_CATEGORY_NAME_TRAVEL = "旅游";
	public static final String C_CATEGORY_NAME_HOTEL = "酒店";
	public static final String C_CATEGORY_NAME_PHOTO = "写真";

	public static final int SORT_BY_START_DATE = 0;
	public static final int SORT_BY_PRICE = 1;
	public static final int SORT_BY_REBATE = 2;
	public static final int SORT_BY_BOUGHT = 3;
	public static final int SORT_BY_END_DATE = 4;
	public static final int SORT_BY_DOWNLOAD = 20;

	// site ID
	public static final String C_SITE_MEITUAN = "meituan";
	public static final String C_SITE_DIANPIAN = "dianping";
	public static final String C_SITE_WOWO = "wowo";
	public static final String C_SITE_58 = "58";
	public static final String C_SITE_24QUAN = "24quan";
	public static final String C_SITE_FTUAN = "ftuan";
	public static final String C_SITE_MANZUO = "manzuo";
	public static final String C_SITE_GAOPENG = "gaopeng";
	public static final String C_SITE_DIDA = "dida";
	public static final String C_SITE_NUOMI = "nuomi";
	public static final String C_SITE_GANJI = "ganji";
	public static final String C_SITE_KAIXIN = "kaixin";
	public static final String C_SITE_XING800 = "xing800";
	public static final String C_SITE_FANTONG = "fantong";
	public static final String C_SITE_LASHOU = "lashou";
	public static final String C_SITE_QUNAER = "qunaer";
	public static final String C_SITE_JUQI = "juqi";
	public static final String C_SITE_TUANBAO = "tuanbao";
	public static final String C_SITE_JUMEIYOUPIN = "jumeiyoupin";
	public static final String C_SITE_TUANHAO = "tuanhao";
	public static final String C_SITE_HAOTEHUI = "haotehui";
	public static final String C_SITE_SOUHU = "sohu";
	public static final String C_SITE_AIBANG = "aibang";
	public static final String C_SITE_SINA = "sina";
	public static final String C_SITE_QQ = "qq";
	public static final String C_SITE_JINGDONG = "jingdong";
	public static final String C_SITE_LETAO = "letao";
	public static final String C_SITE_ZTUAN = "ztuan";
	public static final String C_SITE_FENTUAN = "fentuan";
	public static final String C_SITE_ZUITAO = "zuitao";
	public static final String C_SITE_TGBABA = "tianji88";
	public static final String C_SITE_CHECKOO = "qianku";
	public static final String C_SITE_XIUTUAN = "xiutuan";
	public static final String C_SITE_5151TUAN = "5151tuan";
	public static final String C_SITE_5151POPO = "5151paopao";
	public static final String C_SITE_MIQI = "miqi";
	public static final String C_SITE_COO8 = "coo8";
	public static final String C_SITE_36TUAN = "36tuan";
	public static final String C_SITE_HAOYIDING = "haoyiding";
	public static final String C_SITE_HAOHUASUAN = "haohuasuan";
	public static final String C_SITE_SHUANGTUAN = "shuangtuan";

	// user("device_id","device_model","device_os","device_token","language",
	// "country_code","create_date","source_id","subscribe")

	// DB User Fields
	public static final String F_USERID = "_id";
	public static final String F_LOGINID = "login_id";
	public static final String F_APPID = "app_id";
	public static final String F_DEVICEID = "device_id";
	public static final String F_DEVICEMODEL = "device_model";
	public static final String F_DEVICEOS = "device_os";
	public static final String F_DEVICETOKEN = "device_token";
	public static final String F_LANGUAGE = "language";
	public static final String F_COUNTRYCODE = "country_code";
	public static final String F_CREATE_SOURCE_ID = "source_id";
	public static final String F_DEVICE_TYPE = "device_type";

	public static final String F_CREATE_DATE = "c_date";
	public static final String F_MODIFY_DATE = "m_date";
    public static final String F_VISIT_DATE = "v_date";

	public static final String F_FOREIGN_USER_ID = "user_id";

	public static final String F_EMAIL = "email";
	public static final String F_MOBILE = "mobile";
	public static final String F_PASSWORD = "password";
	public static final String F_VERIFICATION = "verification";
	public static final String F_VERIFYCODE = "verify_code";
	public static final String F_STATUS = "status";

	public static final String F_NICKNAME = "nick_name";
	public static final String F_AVATAR = "avatar";
	public static final String F_SINAID = "sina_id";
	public static final String F_QQID = "qq_id";
    public static final String F_QQSPACE_ID = "qqspace_id";

	public static final String F_RENRENID = "renren_id";
	public static final String F_FACEBOOKID = "facebook_id";
	public static final String F_TWITTERID = "twitter_id";

	public static final String F_SINA_ACCESS_TOKEN = "sina_at";
	public static final String F_SINA_ACCESS_TOKEN_SECRET = "sina_ats";
	public static final String F_QQ_ACCESS_TOKEN = "qq_at";
	public static final String F_QQ_ACCESS_TOKEN_SECRET = "qq_ats";

	public static final String F_SINA_REFRESH_TOKEN = "sina_rft";
	public static final String F_SINA_EXPIRE_DATE = "sina_expire_date";

	public static final String F_QQ_REFRESH_TOKEN = "qq_rft";
	public static final String F_QQ_EXPIRE_DATE = "qq_expire_date";
	public static final String F_QQ_OPEN_ID = "qq_open_id";

	public static final String F_FACEBOOK_ACCESS_TOKEN = "fb_rft";
	public static final String F_FACEBOOK_EXPIRE_DATE = "fb_expire_date";

	public static final String F_PROVINCE = "province";
	public static final String F_LOCATION = "location";
	public static final String F_GENDER = "gender";
	public static final String F_BIRTHDAY = "birthday";
	public static final String F_SINA_NICKNAME = "sina_nick";
	public static final String F_SINA_DOMAIN = "sina_domain";
	public static final String F_QQ_NICKNAME = "qq_nick";
	public static final String F_QQ_DOMAIN = "qq_domain";

	// DB Place Fields
	public static final String F_PLACEID = "placeId";
	public static final String F_LONGITUDE = "long";
	public static final String F_LATITUDE = "lat";
	public static final String F_NAME = "name";
	public static final String F_RADIUS = "radius";
	public static final String F_POST_TYPE = "postType";
	public static final String F_DESC = "desc";
	public static final String F_PLACE_TYPE = "type";
	public static final String F_AUTH_FLAG = "auth";

	// DB BBSPost Fields
	public static final String F_POSTID = "postId";
	public static final String F_USER_LONGITUDE = "userLong";
	public static final String F_USER_LATITUDE = "userLat";
	public static final String F_TEXT_CONTENT = "text";
	public static final String F_CONTENT_TYPE = "type";
	public static final String F_IMAGE_URL = "image";
	public static final String F_THUMB_URL = "thumb";
    public static final String F_BGIMAGE_URL = "bg_image";
    public static final String F_BGIMAGE_NAME = "bg_name";
	public static final String F_TOTAL_VIEW = "totalView";
	public static final String F_TOTAL_FORWARD = "totalForward";
	public static final String F_TOTAL_QUOTE = "totalQuote";
	public static final String F_TOTAL_REPLY = "totalReply";
	public static final String F_SRC_POSTID = "srcPostId";
	public static final String F_REPLY_POSTID = "replyPostId";
    public static final String F_FOR_TUTORIAL = "forTutorial";

	// DB App fields
	// public static final String F_APPID = "appid";
	// public static final String F_NAME = "name";
	// public static final String F_DESC = "desc";

	// App Table
	public static final String F_APPURL = "app_url";
	public static final String F_VERSION = "version";
	public static final String F_ICON = "icon";
	public static final String F_KEYWORD_NAME = "name";
	public static final String F_KEYWORD_QUERY = "query";

	public static final String F_SINA_APPKEY = "sinaAppKey";
	public static final String F_SINA_APPSECRET = "sinaAppSecret";
	public static final String F_QQ_APPKEY = "qqAppKey";
	public static final String F_QQ_APPSECRET = "qqAppSecret";
	public static final String F_RENREN_APPKEY = "renrenAppKey";
	public static final String F_RENREN_APPSECRET = "renrenAppSecret";
	// computed fields, not stored in DB
	public static final String C_TOTAL_RELATED = "totalRelatedPost";

	public static final String F_MESSAGEID = "messageId";
	public static final String F_MESSAGE_CONTENT = "text";
	public static final String F_FROM_USERID = "fromUserId";
	public static final String F_TO_USERID = "toUserId";
	public static final String F_SRC_MESSAGEID = "srcMessageId";

	public static final String F_MESSAGE_TYPE = "messageType";

	// Value
	public static final String STATUS_NORMAL = "1";
	public static final String STATUS_SUSPEND = "2";
	public static final String STATUS_TO_VERIFY = "3";

	// Constants
    public static final int LOGINID_START = 1;
	public static final int LOGINID_OWN = 1;
	public static final int LOGINID_SINA = 2;
	public static final int LOGINID_QQ = 3;
	public static final int LOGINID_RENREN = 4;
	public static final int LOGINID_FACEBOOK = 5;
	public static final int LOGINID_TWITTER = 6;
    public static final int LOGINID_QQSPACE = 9;
    public static final int LOGINID_END = 9;

	public static final int CONTENT_TYPE_TEXT = 1;
	public static final int CONTENT_TYPE_TEXT_PHOTO = 2;

	public static final String AUTH_FLAG_NONE = "0";

	public static final String PLACE_TYPE_UNKNOWN = "0";

    public static final String F_SING_INFO = "sing_info";
//    public static final String F_SONG_INFO = "song";

    public static final String F_ASK_PS_INFO = "askps_info";
    public static final String F_DRAW_INFO = "draw_info";

    
    public static final String F_TABLE_NAME     = "table";
    public static final String T_INDEX_MONITOR  = "xiaoji_index_monitor";
    public static final String F_MEMO = "memo";

    public static final String F_SPEND_TIME = "spend_time";

    public static final String F_DEVICES = "devices";
    public static final String F_DEVICEID_LIST = "device_ids";
    public static final String F_DEVICETOKEN_LIST = "device_tokens";
    public static final String F_FEATURE_OPUS = "feature_opus";
    public static final String F_XIAOJI_NUMBER = "xiaoji";
    public static final String F_FEATURE = "feature";

    public static final String T_USER_GUESS_ACHIEVEMENT = "user_guess_achievement";
    public static final String F_EARN = "earn";
    public static final String F_ANONYMOUS = "anonymous";
    public static final String F_JUDGES = "judges";
    public static final String F_REPORTERS = "reporters";
    public static final String F_CONTESTANTS = "contestants";
    public static final String F_CONTESTANTS_ONLY = "contestants_only";

    public static final String F_WINNER_LIST = "winner_list";
    public static final String F_AWARD_LIST = "award_list";
    public static final String F_MAX_FLOWER_PER_CONTEST = "max_flower_per_contest";
    public static final String F_MAX_FLOWER_PER_OPUS = "max_flower_per_opus";
    public static final String F_VOTE_START_DATE = "vote_start_date";
    public static final String F_VOTE_END_DATE = "vote_end_date";
    public static final String F_AWARD_COIN = "award_coins";
    public static final String F_IS_AWARD = "is_award";

    public static final int C_DEFAULT_MAX_FLOWER_PER_CONTEST = 20;
    public static final int C_DEFAULT_MAX_FLOWER_PER_OPUS = 3;

    public static final int DEFAULT_RANK_TYPE = 1;          // rank by score
    public static final String F_RANK_TYPE_INFO = "rank_types";
    public static final String F_EMAIL_VERIFY_STATUS = "email_status";
    public static final String F_EMAIL_VERIFY_CODE = "email_code";

    public static final String F_FLOWER_RANK_WEIGHT = "flower_rank_weight";
    public static final String F_JUDGE_RANK_WEIGHT = "judge_rank_weight";
    public static final String F_SHAKE_XIAOJI = "shake_xiaoji";
    public static final String F_SHAKE_NUMBER_TIMES = "shake_times";
    public static final String F_TAKE_COINS = "take_coins";
    public static final String F_CALCULATE_TAKE_COINS = "cal_take_coins";
    public static final String F_BLOCK_DEVICES = "block_devices";
    public static final String F_INSERT_USER_OPUS_STATUS = "insert_user_opus_status";
    public static final String F_FANS = "fans";
    public static final String F_FOLLOWS = "follows";
    public static final String F_POP_SCORE = "pop_score";
    public static final String F_ISMARKED = "marked";

    public static final String T_LOGIN_HISTORY = "login_history";
    public static final String F_FAME = "fame";
    public static final String F_GROUP_BALANCE = "balance";
    public static final String F_LAST_CHARGE_MONTH = "last_charge";

    public static final String F_MEMBER_FEE = "fee";
    public static final String F_GROUP_TITLES = "titles";
    public static final String F_TITLE_ID = "title_id";
    public static final String F_GUESTUID_LIST = "guest_uid";
    public static final String T_GROUP = "group_info";
    public static final String T_USER_GROUP = "user_group";
    public static final String F_GROUPID = "group_id";
    public static final String F_CAPACITY = "capacity";
    public static final String F_SIZE = "size";
    public static final String F_ROLE = "role";
    public static final String T_GROUP_RELATION = "group_relation";
    public static final String F_JOINED_DATE = "joined_date";
    public static final String F_CREDENTIAL_QQ_WEIBO = "cred_qq";
    public static final String F_CREDENTIAL_SINA_WEIBO = "cred_sina";
    public static final String F_CREDENTIAL_FACEBOOK = "cred_fb";
    public static final String F_CREDENTIAL_QQ_SPACE = "cred_qzone";

    public static final String F_DESC_LABEL_INFO = "desc_label";
    public static final String F_Y_RATIO = "y_ratio";
    public static final String F_X_RATIO = "x_ratio";
    public static final String F_STYLE = "style";
    public static final String F_STROKE_TEXT_COLOR = "s_text_color";
    public static final String F_TEXT_COLOR = "text_color";
    public static final String F_TEXT_FONT_SIZE = "font_size";

    public static final String F_FRAME_X = "f_x";
    public static final String F_FRAME_Y = "f_y";
    public static final String F_FRAME_WIDTH = "f_width";
    public static final String F_FRAME_HEIGHT = "f_height";

    public static final String F_CANVAS_WIDTH = "canvas_w";
    public static final String F_CANVAS_HEIGHT = "canvas_h";



    public static final String C_USER_INDEX_BEFORE_DATE = "20130818000000";
    public static final String C_OPUS_INDEX_BEFORE_DATE = "20130818000000";
    public static final String C_BBS_INDEX_BEFORE_DATE = "20131210000000";

    public static final String F_GUEST_CAPACITY = "guest_capacity";
    public static final String F_GUEST_SIZE = "guest_size";
    public static final String F_FAN_COUNT = "fan_count";
    public static final String T_GROUP_FAN = "group_fan";
    public static final String T_FOLLOW_GROUP = "follow_group";
    public static final String T_GROUP_NOTICE = "group_notice";
    public static final String F_GROUPS = "groups";
    public static final String T_GROUP_TOPIC = "group_topic";
    public static final String T_GROUP_ACTION = "group_action";
    public static final String T_GROUP_TOPIC_LATEST = "group_topic_index";
    public static final String T_GROUP_TOPIC_MARK = "group_topic_mark";
    public static final String T_GROUP_TOPIC_TOP = "group_topic_top";
    public static final String F_NEW_GROUPACTION_COUNT = "new_group_action_count";
    public static final String F_GROUPNAME = "group_name";
    public static final String T_GROUP_TITLE = "group_title";
    public static final String F_JOINERS_TYPE = "joiners_type";
    public static final String F_IS_AWARD_DEDUCT = "award_deduct";

    public static final String F_RULE = "rule";
    public static final String F_AWARD_RULE_LIST = "award_rules";
    public static final String SYSTEM_USERID = "888888888888888888888888";
    public static final String F_ISARREARS = "arrears";
    public static final String F_DEBET = "debet";
    public static final String F_VIP = "vip";
    public static final String F_VIP_EXPIRE_DATE = "vip_expire";
    public static final String F_VIP_LAST_PAY_DATE = "vip_pay";
    public static final int C_VIP_FLAG = 1;
    public static final String F_DATA = "data";
    public static final String T_VIP_PAY_HISTORY = "vip_pay_history";
    public static final String F_VIP_MONTHLY_CHARGE = "vip_charge_date";
    public static final String F_AWARD_APP_LIST = "award_apps";

    public static final int C_VIP_MONTHLY_CHARGE = 29999;


    public static final String F_IS_PRIVATE = "is_private";
    public static final String T_HISTORY_AWARD_APP = "his_award_app";
    public static final String F_TOTAL_AWARD = "award_total";
    public static final String F_OFF_GROUPS = "off_groups";
    public static final String F_OFF_USERS = "off_users";
    public static final String T_DELETE_GROUP = "group_deleted";

    public static final String TOP_BOARD_ID_DRAW = "50bd8c62e4b0e970bbebc747";
    public static final String DEFAULT_BOARD_ICON = "http://58.215.160.100:8080/bbs/icon/b_picture.png";
    public static final String C_DELETED_VALUE = "deleted";
    public static final String F_PERMISSIONS = "permissions";

    public static final String C_PERMISSION_BLACK_USER = "black_user";
    public static final String T_BLACK_BOARD_USER = "black_board_user";

    public static final String F_DRAFT_CREATE_DATE = "dc_date";
    public static final String F_DRAFT_COMPLETE_DATE = "dco_date";
    public static final String F_STROKES = "stroke";
    public static final String F_CLASS = "class";

    public static final String T_STAT_DAILY_ACTIVE_USER = "stat_daily_active_user";
    public static final String T_STAT_DAILY_NEW_USER = "stat_daily_new_user";
    public static final String T_STAT_DAILY_NEW_OPUS = "stat_daily_new_opus";
    public static final String T_STAT_DAILY_NEW_OPUS_BY_OLD_USER = "stat_daily_new_opus_by_old_user";
    public static final String T_STAT_DAILY_NEW_OPUS_BY_NEW_USER = "stat_daily_new_opus_by_new_user";
    public static final String T_USER_TUTORIAL_INDEX = "user_tutorial_index";
    public static final String T_USER_TUTORIAL_INFO = "user_tutorial_info";

    public static final String F_TUTORIAL_ID = "tutorial_id";
    public static final String F_STAGE_ID = "stage_id";
    public static final String F_STAGE_INDEX = "stage_index";
    public static final String F_STAGE_SCORE = "stage_score";
    public static final String F_LOCAL_USER_TUTORIAL_ID = "local_id";
    public static final String F_REMOTE_USER_TUTORIAL_ID = "remote_id";
    public static final String F_CHAPTER_OPUS_ID = "c_opus_id";
    public static final String F_CHAPTER_INDEX = "c_index";

    public static final String F_USER_TUTORIAL_DELETE_STATUS = "delete" ;
    public static final String F_BEST_SCORE = "best_score";
    public static final String F_BEST_OPUS_ID = "best_opus_id";
    public static final String F_BEST_CREATE_DATE = "best_c_date";

    public static final String F_LATEST_SCORE = "l_score";
    public static final String F_LATEST_OPUS_ID = "l_opus_id";
    public static final String F_LATEST_CREATE_DATE = "l_c_date";

    public static final String T_TUTORIAL_OPUS_INFO = "tutorial_opus_info";
    public static final String F_BGIMAGE_HEIGHT = "bg_height";
    public static final String F_BGIMAGE_WIDTH = "bg_width";

    public static final int C_MIN_OPUS_CLASS_FLOWERS_0 = 100;

    public static final int C_MIN_OPUS_CLASS_FLOWERS_1 = 12;
    public static final long C_MIN_OPUS_CLASS_STROKES_1 = 2000;

    public static final int C_MIN_OPUS_CLASS_FLOWERS_2 = 50;
    public static final long C_MIN_OPUS_CLASS_STROKES_2 = 500;

    public static final String T_STAT_TUTORIAL = "stat_tutorial";
    
    public static final String C_STAGE_POST_SUBJECT = "关卡答疑帖 - %s , %s";
    public static final String C_STAGE_POST_CREATE_USERID = "523fed65e4b07e8d9c5fe9ee";
    public static final String C_STAGE_POST_BOARDID = "532cf231e4b0f2e3448f2f12";  // 画技锻造城

    public static final String T_STAT_TUTORIAL_DAILY = "stat_tutorial";
    public static final String T_STAT_TUTORIAL_ALL = "stat_tutorial_all";
    public static final String T_EXPIRE_TOKENS = "expire_token";
    public static final String F_STAGE_RANK = "stage_rank";

    public static final String F_FROM_USER_NICKNAME = "from_nick";
    public static final String F_FROM_USER_XIAOJI = "from_xiaoji";
    public static final String F_FROM_USER_ID = "from_uid";

    public static final String F_LOGIN_USER_XIAOJI = "login_xiaoji";
    public static final String F_LOGIN_USER_NICKNAME = "login_nick";
    public static final String F_LOGIN_USER_ID = "login_uid";
    public static final String F_DELETE_DATE = "d_date";
    public static final String F_DELETE_USER_ID = "d_uid";
    public static final String F_RESET_PASSWORD_DATE = "rp_date";
    public static final String F_RESET_PASSWORD = "reset_pwd";

    // TODO: CommonManager.java
	public static int UNLIMITED_COUNT = 9999999;

	// normal statistic Constants
	public static final String USER_SIMILARITY = "place_user_similarity";
	public static final String USER_POST_STATISTIC = "place_user_post_stat";

	public static final String F_USER_POST_STATISTIC_TOTOAL = "totalPost";

	// DB UPDATE Row Key
	public static final String R_UPDATE_DATA = "update_data";
	public static final String R_RECOMMEND_APPS = "recommend_apps";



	// appID type
	public static final String R_APPID_ALL = "ALL";

	public static final String F_LOC = "loc";
	public static final String F_WAP_LOC = "w_loc";

	public static final String F_SITE_NAME = "s_name";
	public static final String F_SITE_URL = "s_url";
	public static final String F_SITE_ID = "s_id";

	public static final String F_TITLE = "title";
	public static final String F_DESCRIPTION = "desc";
	public static final String F_DETAIL = "tip";

	public static final String F_IMAGE = "image";
	public static final String F_START_DATE = "s_date";
	public static final String F_END_DATE = "e_date";
	public static final String F_VALUE = "value";
    public static final String F_KEY = "value";
    public static final String F_STAT_VALUE = "val";

	public static final String F_PRICE = "price";
	public static final String F_REBATE = "rebate";
	public static final String F_BOUGHT = "bought";

	public static final String F_CATEGORY = "cate";
	public static final String F_MAJOR = "major";

	public static final String F_CITY = "city";
	public static final String F_VENDOR = "vendor";
	public static final String F_SHOP = "shop";
	public static final String F_ADDRESS = "addr";
	public static final String F_GPS = "gps";
	public static final String F_RANGE = "range";
	public static final String F_DP_SHOPID = "dpid";
	public static final String F_TEL = "tel";
	public static final String F_POST = "post";
	public static final String F_SOLD_OUT = "sold";
	public static final String F_MIN_QUOTA = "min";
	public static final String F_MAX_QUOTA = "max";
	public static final String F_TAG = "tag";
	public static final String F_PRIORITY = "pri";
	public static final String F_MERCHANT_END_DATE = "me_date";
	public static final String F_SCORE = "score";
    public static final String F_QUALITY_SCORE = "quality";             // 系统自动打分
	public static final String F_RANK = "rank";
	public static final String F_RECOMMEND_LIST = "re_list";
	public static final String F_ITEM_SENT_STATUS = "status";
	public static final String F_TOP_SCORE = "topscore";

	public static final String F_COMMENTS = "comments";
	public static final String F_KEYWORD = "keys";
	public static final String F_PRODUCTID = "p_id";

	public static final String C_NATIONWIDE = "全国";

	public static final String F_ID = "_id";
	public static final String F_INDEX_ID = "id";

	public static final String F_STAT = "stat";

	public static final String F_COUNTER_ADDRESS_API = "address_api";
	public static final String F_COUNTER_ADDRESS_HTML = "address_html";
	public static final String F_COUNTER_ADDRESS_FAIL = "address_fail";
	public static final String F_COUNTER_ADDRESS_TOTAL = "address_toal";
	public static final String F_COUNTER_ADDRESS_SKIP = "address_skip";

	public static final String F_COUNTER_INSERT = "insert";
	public static final String F_COUNTER_UPDATE = "update";
	public static final String F_COUNTER_EXIST = "exist";
	public static final String F_COUNTER_TOTAL = "total";
	public static final String F_COUNTER_FAIL = "fail";

	public static final String F_DATE = "date";
	public static final String F_SEARCH_HISTORY = "s_his";
	public static final String F_COUNT = "cnt";

	public static final String F_CATEGORY_NAME = "cate_n";
	public static final String F_CATEGORY_ID = "cate_id";
	public static final String F_SUB_CATEGORY_NAME = "subcate_n";
	public static final String F_SUB_CATEGORY_ID = "subcate_id";
	public static final String F_SUB_CATEGORY_KEYS = "keys";
	public static final String F_MAX_PRICE = "max_p";
	public static final String F_MIN_REBATE = "min_r";
	public static final String F_EXPIRE_DATE = "v_date";

	public static final String F_SHOPPING_LIST = "s_list";
	public static final String F_ITEM_ID = "item_id";

	public static final float MIN_SCORE_TO_RECOMMEND = 0.04f;

	public static final String F_UP = "up";
	public static final String F_DOWN = "down";

	public static final int C_PUSH_TYPE_IPHONE = 1;
	public static final int C_PUSH_TYPE_ANDROID = 2;
	public static final int C_PUSH_TYPE_EMAIL = 3;
	public static final int C_PUSH_TYPE_WEIBO = 4;

	public static final String F_COMMENT_CONTENT = "content";

	public static final String F_SUB_CATEGORY = "subcate";

	public static final String F_PUSH_APP_KEY = "push_key";
	public static final String F_PUSH_APP_SECRET = "push_secret";
	public static final String F_PUSH_APP_MASTER_SECRET = "push_master_secret";

	public static final String F_PUSH_APP_DEV_CERTIFICATE = "push_dev_cert";
	public static final String F_PUSH_APP_DEV_CERTIFICATE_PASSWORD = "push_dev_cert_pwd";

	public static final String F_PUSH_APP_PRODUCT_CERTIFICATE = "push_pro_cert";
	public static final String F_PUSH_APP_PRODUCT_CERTIFICATE_PASSWORD = "push_pro_cert_pwd";

	public static final String F_EXTERNAL_ID = "external_id";

	public static final String C_ALL_COUNTRY = "all";
	public static final String C_COUNTRY_CHINA = "CN";
	public static final String C_COUNTRY_USA = "US";

	public static final String F_TYPE = "type";
	public static final String F_BALANCE_TYPE = "balance_type";
	public static final String F_FILE_TYPE = "file_type";

	public static final String F_FILE_URL = "url";
	public static final String F_FILE_SIZE = "size";
	public static final String F_FILE_NAME = "name";

	public static final int C_SITE_TYPE_SYSTEM = 1;
	public static final int C_SITE_TYPE_USER = 2;

	public static final int UNDEFINE = -1;

	public static final int KEYWORD_TYPE_DEFAULT = 0;
	public static final int KEYWORD_TYPE_QUAN = 8;

	public static final String C_SITE_TAOBAO_MIAOSHA = "taobao_miaosha";
	public static final String C_SITE_TAOBAO_ZHEKOU = "taobao_zhekou";

	public static final int C_CATEGORY_TAOBAO_KILL_SHOES = 100;

	public static final String F_TAOBAO_QUERY = "query";
	public static final String F_TAOBAO_CATEGORY = "cate";

	public static final int C_CATEGORY_TAOBAO_MIAOSHA = 100;
	public static final int C_CATEGORY_TAOBAO_MIAOSHA_MIN = 101;
	public static final int C_CATEGORY_TAOBAO_MIAOSHA_MAX = 149;

	public static final int C_CATEGORY_TAOBAO_ZHEKOU = 150;
	public static final int C_CATEGORY_TAOBAO_ZHEKOU_MIN = 151;
	public static final int C_CATEGORY_TAOBAO_ZHEKOU_MAX = 199;

	public static final int C_CATEGORY_AD = 200;
	public static final int C_CATEGORY_AD_MIN = 201;
	public static final int C_CATEGORY_AD_MAX = 249;

	public static final String T_TAOBAO_MIAOSHA_CATEGORY = "taobao_miaosha_category";
	public static final String T_TAOBAO_ZHEKOU_CATEGORY = "taobao_zhekou_category";

	public static final int C_PRODUCT_TYPE_TUANGOU = 1;
	public static final int C_PRODUCT_TYPE_TAOBAO = 2;
	public static final int C_PRODUCT_TYPE_AD = 3;

	public static final String F_PRODUCT_TYPE = "type";

	public static final double C_PRICE_NA = -999;

	public static final String F_AD_TARGET = "target";
	public static final String F_AD_TEXT = "text";
	public static final String F_AD_IMAGE = "image";
	public static final String F_AD_LINK = "link";

	// default values for user
//	public static final int C_DEFAULT_BALANCE = 999;
//	public static final int C_DEFAULT_DICE_BALANCE = 3000;
//
//	public static final int C_DEFAULT_INGOT_BALANCE = 0;
//	public static final int C_DEFAULT_LEARN_DRAW_INGOT = 5;	

	public static final int C_DEFAULT_TIPS_AMOUNT = 10;
	public static final int C_DEFAULT_DICE_REROLL_AMOUNT = 5;
	public static final int C_DEFAULT_DICE_DOUBLE_COINS_AMOUNT = 5;

	// item feedTypes
	public static final int C_ITEM_TYPE_TIPS = 1;

	// Pens
	public static final int C_ITEM_TYPE_PEN_WATER = 1001;
	public static final int C_ITEM_TYPE_PEN_PEN = 1002;
	public static final int C_ITEM_TYPE_PEN_ICE = 1003;
	public static final int C_ITEM_TYPE_PEN_QUILL = 1004;

    public static final int C_ITEM_TYPE_FUN_PEN1 = 1151;
    public static final int C_ITEM_TYPE_FUN_PEN2 = 1152;
    public static final int C_ITEM_TYPE_FUN_PEN3 = 1153;
    public static final int C_ITEM_TYPE_FUN_PEN4 = 1154;
    public static final int C_ITEM_TYPE_FUN_PEN5 = 1155;

    public static final int C_ITEM_TYPE_COPY_PAINT = 1009;

    public static final int C_ITEM_TYPE_SHADOW = 1010;
    public static final int C_ITEM_TYPE_GRADIENT = 1011;
    public static final int C_ITEM_TYPE_SELECTOR = 1012;

	public static final int C_ITEM_TYPE_PAINT_PALETTE = 1101;	
	public static final int C_ITEM_TYPE_PAINT_ALPHA = 1102;	
	public static final int C_ITEM_TYPE_PAINT_PLAYER = 1103;	
	public static final int C_ITEM_TYPE_PAINT_STRAW = 1104;
    public static final int C_ITEM_TYPE_PAINT_ERASER = 1105;

    public static final int C_ITEM_TYPE_PAINT_GRID = 1106;

    public static final int C_ITEM_TYPE_BACKGROUND_START = 1200;
    public static final int C_ITEM_TYPE_BACKGROUND_1 = 1201;
    public static final int C_ITEM_TYPE_BACKGROUND_2 = 1202;
    public static final int C_ITEM_TYPE_BACKGROUND_12 = 1212;


//    public static final int DrawBackground1,
//    public static final int DrawBackground2,
//    public static final int DrawBackground3,
//    public static final int DrawBackground4,
//    public static final int DrawBackground5,
//    public static final int DrawBackground6,
//    DrawBackground7,
//    DrawBackground8,
//    DrawBackground9,
//    //Add 2013-6-17 By Gamy
//    DrawBackground10,
//    DrawBackground11,
//    DrawBackground12,
//    DrawBackground13,
//    DrawBackground14,
//    DrawBackground15,
//    DrawBackground16,
//    DrawBackground17,

    public static final int C_ITEM_TYPE_PAINT_SHAPE = 1300;


//    //add by Gamy 2013-6-7
//
//    ImageShapeBasic0 = 1300,
//
//    ImageShapeNature0 = 1310,
//    ImageShapeNature1 = 1311,
//
//    ImageShapeAnimal0 = 1320,
//    ImageShapeAnimal1 = 1321,
//
//    ImageShapeShape0 = 1330,
//    ImageShapeShape1 = 1331,
//
//    ImageShapeStuff0 = 1340,
//    ImageShapeStuff1 = 1341,
//
//    ImageShapeSign0 = 1350,
//    ImageShapeSign1 = 1351,
//
//    ImageShapePlant0 = 1360,
//    ImageShapePlant1 = 1361,
//    ImageShapePlant2 = 1362,


    public static final int C_ITEM_TYPE_CANVAS_START = 1400;
    public static final int C_ITEM_TYPE_CANVAS_IPHONE_DEFAULT = 1401;                   // 300 * 300
    public static final int C_ITEM_TYPE_CANVAS_IPAD_DEFAULT = 1402;                     // 700 * 700
    public static final int C_ITEM_TYPE_CANVAS_IPAD_HORIZONTAL = 1403;                  // 700 * 432
    public static final int C_ITEM_TYPE_CANVAS_IPAD_VERTICAL = 1404;                    // 432 * 700
    public static final int C_ITEM_TYPE_CANVAS_IPAD_LARGE = 1405;                       // 1024 * 1024
    public static final int C_ITEM_TYPE_CANVAS_IPHONE_HORIZONTAL = 1406;               // 1024 * 768
    public static final int C_ITEM_TYPE_CANVAS_IPHONE_VERTICAL = 1407;                 // 768 * 1024
    public static final int C_ITEM_TYPE_CANVAS_IPHONE5_HORIZONTAL = 1408;              // 1136 * 640
    public static final int C_ITEM_TYPE_CANVAS_IPHONE5_VERTICAL = 1409;                // 640 * 1136

    public static final int C_ITEM_TYPE_PURSE_1000 = 1107;

    public static final int C_ITEM_TYPE_DICE_REROLL = 2001;
	public static final int C_ITEM_TYPE_DICE_DOUBLE_COINS = 2002;





	public static final int C_CHARGE_SOURCE_CHECKIN = 1;
	public static final int C_CHARGE_SOURCE_PURCHASE_COIN = 2;
	public static final int C_CHARGE_SOURCE_PURCHASE_ITEM = 3;
	public static final int C_CHARGE_SOURCE_DRAW_REWARD = 4;
	public static final int C_CHARGE_SOURCE_GUESS_REWARD = 5;
	
	public static final int C_CHARGE_SOURCE_YOUMI_APP_REWARD = 8;
	public static final int C_CHARGE_SOURCE_APP_REWARD = 9;

	public static final int C_CHARGE_SOURCE_ESCAPE = 10;
	public static final int C_CHARGE_SOURCE_CHANGE_ROOM = 11;
	public static final int C_CHARGE_SOURCE_BY_ADMIN = 14;				// TODO check with client
	public static final int C_CHARGE_SOURCE_FLOWER = 15;					// 

	public static final int C_CHARGE_SOURCE_ALIPAY_WEB = 20;
    public static final int C_CHARGE_SOURCE_USE_PURSE = 21;

    public static final int C_CHARGE_SOURCE_GROUP = 30;



	public static final int C_CHARGE_SOURCE_ROBOT_AUTO = 99;
    public static final int C_CHARGE_SOURCE_GUESS_HAPPY_AWARD = 70;
    public static final int C_CHARGE_SOURCE_GUESS_GENIUS_AWARD = 71;
    public static final int C_CHARGE_SOURCE_GUESS_CONTEST_AWARD = 72;
    public static final int C_CHARGE_SOURCE_AWARD_TAKE_COINS = 451;
    public static final int C_CHARGE_SOURCE_CONTEST = 452;
    public static final int C_CHARGE_SOURCE_VIP_MONTHLY = 453;
    public static final int C_CHARGE_SOURCE_POP_USER = 454;


	// 猜猜画画作品榜得奖
	public static final int C_CHARGE_SOURCE_DRAW_TOP = 12;

	// 点击广告海报
	public static final int C_CHARGE_SOURCE_CLICK_BOARD = 13;

	public static final int C_CHARGE_SOURCE_DICE_WIN = 200;

	public static final int C_CHARGE_SOURCE_ZJH_FOLD_CARD = 201;
	public static final int C_CHARGE_SOURCE_ZJH_COMPARE_LOSE = 202;
	public static final int C_CHARGE_SOURCE_ZJH_QUIT_GAME = 203;// 中途退出，当输了游戏
	public static final int C_CHARGE_SOURCE_ZJH_WIN_TAX = 204;
	public static final int C_CHARGE_SOURCE_ZJH_RESULTS = 205; // 写入userResult时用到

	// for transaction
	public static final String F_TRANSACTION_USERID = "uid";
	public static final String F_AMOUNT = "amount";
	public static final String F_TRANSACTION_ID = "tid";
	public static final String F_TRANSACTION_RECEIPT = "treceipt";

	public static final String F_ROOM_NAME = "room_name";

	public static final String F_SERVER_ADDRESS = "server_address";

	public static final String F_SERVER_PORT = "server_port";

	public static final String F_ROOM_USERS = "room_users";
	public static final String F_LAST_PALY_DATE = "last_play_date";
	public static final String F_PLAY_TIMES = "play_times";

	public static final String T_ROOM = "room";
	public static final String T_USERROOM = "userroom";

	public static final String F_CREATE_USERID = "create_uid";

	public static final String F_OBJECT_ID = "_id";

	public static final String F_ROOM_ID = "room_id";

	public static final String F_ROOM_USERID = "room_user_id";

	public static final String F_ROOM_TYPE = "room_type";

	public static final String F_ROOM_LIST = "room_list";

	public static final String F_LEVEL_INFO = "level_info";
	public static final String F_LEVEL = "level";
	public static final String F_EXP_NEW = "experience";
	public static final String F_EXP = "experience";

	public static final String F_OPUS_ID = "opus_id";

	public static final String F_WORD = "word";

//	public static final String T_ACTION = "action";

	public static final String F_MATCH_TIMES = "match_times";

	public static final String F_USERID_LIST = "user_list";
	public static final String F_OPUS_CREATOR_UID = "opus_creator_uid";

	public static final String F_CORRECT = "correct";

	public static final String F_MESSAGE_DIRECTION = "msg_direction";

	public static final String F_REQUEST_MESSAGE_ID = "req_msg_id";
	public static final String F_REPLY_MESSAGE_ID = "reply_msg_id";
	public static final String F_REPLY_RESULT = "reply_result";

	public static final String F_CORRECT_TIMES = "correct_times";

	public static final String F_GUESS_TIMES = "guess_times";

	public static final String F_COMMENT_TIMES = "comment_times";

    public static final String F_CONTEST_COMMENT_TIMES = "contest_comment_times";

	public static final String F_HOT = "hot";

	public static final String F_FEED_TIMESTAMP = "feed_timestamp";

	public static final String F_HAS_WORDS = "has_words";

	public static final String F_NEW_FAN_COUNT = "new_fan_cnt";

	public static final String F_NEW_ROOM_COUNT = "new_room_count";

	public static final String F_TARGET_UID = "target_uid";
	public static final String F_SENDER_DEL_FLAG = "sender_del_flag";
	public static final String F_RECEIVER_DEL_FLAG = "reciever_del_flag";
	public static final String F_OPUS_RELATED_USER_ID = "related_uid";		// Add By Benson, record all userid in one field
	public static final String F_RELATED_USER_ID = "related_user_id"; // message: fromId ,toId
	public static final String F_RELATED_UID = "related_uid";
	
	public static final String F_TARGET_NICK = "target_nick";

	public static final String F_OPUS_STATUS = "opus_status";

	public static final String F_GUESS_BALANCE = "guess_balance";
	public static final String F_AWARD_EXP = "award_exp";

	// App ID
	public static final String FAKE_APPID = "555555555"; // 假的APPID，如果不是独立发布就没有APPID
	public static final String APPID_DRAW = "513819630";
	public static final String APPID_LITTLEGEE = "645475970";
	public static final String APPID_DRAW_PRO = "541354772";
	public static final String APPID_DICE = "557072001";
	public static final String APPID_DICE_NEW = "606131564";
	public static final String APPID_DICE_PRO = "test";
	public static final String APPID_ZHAJINHUA = "585525675";
	public static final String APPID_PURE_DRAW = "639593519";
	public static final String APPID_PURE_DRAW_FREE = "639593939";
	public static final String APPID_PHOTO_DRAW = "639595333";
	public static final String APPID_PHOTO_DRAW_FREE = "639596045";
	public static final String APPID_CALLTRACK = "427457714";
	public static final String APPID_SECURESMS = "427737140";

	public static final String APPID_DREAM_AVATAR = "648176144";
	public static final String APPID_DREAM_AVATAR_FREE = "645413029";
	public static final String APPID_DREAM_LOCK_SCREEN = "645413042";
	public static final String APPID_DREAM_LOCK_SCREEN_FREE = "648179189";	
	
	public static final String APPID_SING = "660557448";
	public static final String APPID_ASK_PS = "660561093";
	
	
	
	
	public static final String APPID_CANDY = "test";

	public static final String APPID_GAME = "Game";

	// game ID
	public static final String GAME_ID_DRAW = "Draw";
	public static final String GAME_ID_DICE = "Dice";
	public static final String GAME_ID_ZHAJINHUA = "Zhajinhua";
	public static final String GAME_ID_CANDY = "Candy";
	public static final String GAME_ID_LEARN_DRAW = "Learndraw";
	public static final String GAME_ID_PHOTO_DRAW = "Photodraw";
	public static final String GAME_ID_PURE_DRAW = "Puredraw";
	public static final String GAME_ID_PHOTO_DRAW_FREE = "Photodrawfree";
	public static final String GAME_ID_PURE_DRAW_FREE = "Puredrawfree";

	public static final String GAME_ID_DREAM_AVATAR = "Dreamavatar";
	public static final String GAME_ID_DREAM_AVATAR_FREE = "Dreamavatarfree";

	public static final String GAME_ID_DREAM_LOCK_SCREEN = "Lockscreen";
	public static final String GAME_ID_DREAM_LOCK_SCREEN_FREE = "Lockscreenfree";

	public static final String GAME_ID_CALLTRACK = "Calltrack";
	public static final String GAME_ID_SECURESMS = "Securesms";
	
	public static final String GAME_ID_SING = "Sing";
	public static final String GAME_ID_ASK_PS = "Askps";

	public static final String F_TOMATO_TIMES = "tomato_times";
	public static final String F_FLOWER_TIMES = "flower_times";

	public static final String F_SAVE_TIMES = "save_times";

	public static final String T_TIMELINE = "timeline";

	public static final String F_ACTION_IDS = "action_ids";

	public static final String F_OWNER = "owner";

	public static final String F_TIMELINE_COUNT = "timeline_count";

	public static final String F_TIMELINE_READ_COUNT = "timeline_read_count";

	public static final String F_OPUS_WORD = "word";

	public static final String F_OPUS_CREATOR_NICKNAME = "creator_nickname";

	public static final String F_OPUS_CREATOR_AVATAR = "creator_avatar";

	public static final String F_OPUS_CREATOR_GENDER = "creator_gender";

	// Board
	public static final String PLATFORM = "platform";

	public static final String PUBLISID = "publish_id";

	public static final String F_INDEX = "index";

	public static final String F_AD_NUMBER = "ad_number";

	public static final String F_AD_LIST = "ad_list";

	public static final String F_WEB_TYPE = "web_type";

	public static final String F_LOCAL_URL = "local_url";

	public static final String F_REMOTE_URL = "remote_url";

	public static final String F_CLICK_URL = "click_url";

	public static final String F_FACETIME = "facetime";

	public static final String F_SIGNATURE = "signature";

	public static final String T_BOARD = "board";

	public static final String F_APPID_LIST = "app_list";

	public static final String F_GAMEID = "game_id";

	public static final String F_BOARD_ID = "board_id";

	public static final String T_GAME_BOARD = "game_board";

	public static final String F_AD_IMAGE_URL = "ad_image";

	public static final String F_CN_IMAGE_URL = "cn_image";

	public static final String F_CN_AD_IMAGE_URL = "cn_ad_image";

	public static final String T_USER_GAME_RESULT = "user_game_result";

	public static final String F_WIN_TIMES = "win_times";

	public static final String F_LOSE_TIMES = "lose_times";

	// for contest table
	public static final String T_CONTEST = "contest";

	public static final String F_WORD_LIST = "word_list";

	public static final String F_PARTICIPANT_LIST = "participant_list";

	public static final String F_PARTICIPANT_COUNT = "participant_count";

	public static final String F_OPUS_COUNT = "opus_count";

	public static final String F_HAS_PARTICIPATED = "has_participated";

	public static final String F_LIMIT = "limit";

	public static final String F_CONTEST_URL = "contest_url";

	public static final String F_STATEMENT_URL = "statement_url";

	public static final String F_HISTORY_SCORE = "history_score";

	public static final String F_CONTEST_SCORE = "contest_score";

	public static final String F_CONTESTID = "contest_id";

	public static final String F_DRAW_RANK_SCORE = "draw_rank_score";

	public static final String F_OPUS_LIST = "opus_list";

	public static final String F_ACTION_ID = "action_id";

	public static final String F_SUMMARY = "summary";

	public static final String F_COMMENT_INFO = "comment_info";

	public static final String F_COMMENT_READ_COUNT = "comment_read_count";

	public static final String T_COMMENT = "comment";

	public static final String F_COMMENT_IDS = "comment_ids";

	public static final String F_COMMENT_COUNT = "comment_count";

	public static final String F_DRAWTOME_COUNT = "drawtome_count";
    public static final String F_SINGTOME_COUNT = "singtome_count";
    public static final String F_PSTOME_COUNT = "pstome_count";

	public static final String F_SUBMIT_COUNT = "submit_count";

	public static final String F_CONTEST_IPAD_URL = "contest_ipad_url";

	public static final String F_STATEMENT_IPAD_URL = "statement_ipad_url";

	public static final String T_EXCHANGE_AD = "exchange_ad";
	public static final String T_EXCHANGE_AD_HISTORY = "exchange_ad_history";

	public static final String C_DEFAULT_APP_URL = "http://phobos.apple.com/WebObjects/MZStore.woa/wa/viewSoftware?id=513819630&mt=8"; // default
																																		// url

	// exchange ad fields
	public static final String F_APP_NAME = "name";
	public static final String F_APP_URL = "app_url";

	public static final String F_SOURCE = "src";
	public static final String F_REDIRECT_APP = "app";
	public static final String F_REDIRECT_URL = "url";

	public static final String F_SOURCE_IP = "source_ip";

	public static final String T_BOARD_RECORD = "board_record";

	public static final String F_CLICK_TIMES = "click_times";

	public static final String F_RELATION = "relation";

	public static final String F_UID = "uid";

	public static final String T_RELATION = "relation";

	public static final String F_FRIEND_NICKNAME = "friend_nickname";
	public static final String F_FRIEND_AVATAR = "friend_avatar";
	public static final String F_FRIEND_GENDER = "friend_gender";
    public static final String F_IS_GROUP = "group";


	public static final String F_FRIEND_GAME_STATUS = "game_status";

	public static final String F_SESSION_ID = "session_id";
	public static final String F_SERVER_ID = "server_id";
	public static final String F_GAME_ID = "game_id";

	public static final int C_GAME_STATUS_ONLINE = 1;
	public static final int C_GAME_STATUS_OFFLINE = 0;

	public static final String T_USER_GAME_STATUS = "user_game_status";
	// _id, F_SERVER_ADDRESS, F_SERVER_PORT, F_GAME_ID, F_MODIFY_DATE,
	// F_GAME_STATUS, F_SERVER_ID

	// bbs fields
	public static final String F_PARENT_BOARDID = "parent_boardid";

	public static final String F_LAST_POST = "last_post";

	// public static final String F_TOPIC_COUNT = "topic_count";

	public static final String F_POST_COUNT = "post_count";

	public static final String F_DRAW_THUMB_URL = "draw_thumb";

	public static final String F_DRAW_IMAGE_URL = "draw_image";

	public static final String F_CREATE_USER = "c_user";

	public static final String F_CONTENT = "content";

	public static final String F_SOURCE_USER = "source_user";

	public static final String F_SOURCE_CONTENT = "source_content";

	public static final String F_REPLY_COUNT = "reply_count";

	public static final String F_SUPPROT_COUNT = "support_count";

	public static final String F_LAST_POSTID = "last_postid";

	public static final String T_BBS_BOARD = "bbs_board";

	public static final String T_BBS_POST = "bbs_post";

	public static final String F_BONUS = "bonus";

	public static final String F_WINNER = "winner";

	public static final String F_AWARD_DATE = "award_date";

	public static final String F_REWARD = "reward";

	public static final String F_SOURCE_POST = "src_post";

	public static final String F_SOURCE_ACTION = "src_action";

	public static final String F_POST_UID = "post_uid";

	public static final String F_ACTION_UID = "action_uid";

	public static final String F_ACTION_TYPE = "action_type";

	public static final String F_BRIEF_TEXT = "brief_text";

	public static final String F_ACTION_SOURCE = "action_source";

	public static final String T_BBS_ACTION = "bbs_action";
	
	public static final String T_BBS_ACTION_INDEX = "bbs_action_index";
	
	public static final String T_BBS_PERMISSION = "bbs_permission";

	public static final String F_ACTION_NICKNAME = "action_nick";

	public static final String F_ACTION_COUNT = "action_count";

	public static final String F_NEW_BBSACTION_COUNT = "new_bbsaction_count";

	public static final String F_PERMISSION = "permission";

	public static final String F_FORBID_END_DATE = "forbid_end_date";

    public static final String T_BBS_MARKEDPOST = "bbs_markedpost";

	// for bulletin
	public static final String F_FUNCTION = "function";
    public static final String F_FUNC_PARA = "para";
	public static final String F_URL = "url";

	public static final int C_DEFAULT_WORD_SCORE = 2;

	public static final String F_DRAW_WORD_SCORE = "word_score";

	public static final String T_TRANSACTION_ID_CHECK = "check_transaction_id";
	public static final String T_TRANSACTION_RECEIPT_CHECK = "check_transaction_receipt";

	// for table user_message
	public static final int C_MESSAGE_SENDER   = 1;
	public static final int C_MESSAGE_RECEIVER = 2;
    public static final int C_MESSAGE_GROUP = 3;

	public static final String T_USER_MESSAGE = "user_message";
    public static final String T_NEW_USER_MESSAGE = "new_user_message";
	public static final String F_USER_MESSAGE_ID = "message_id";



		
	public static final String F_ADMINUID_LIST = "admin_list";

	public static final String F_ADMINUSER_LIST = "admin_user_list";

	
	// wall table fields
	// wall_id, user_id, type, name, layout_id, display_mode, background_image, opus_id_list, 
	// public static final String F_WALL_ID = "_id";
	public static final String F_LAYOUT_ID = "layout_id";
	public static final String F_LAYOUT_DISPLAY_MODE = "display_mode";
	public static final String F_BACKGROUND = "background";
	public static final String F_LAYOUT_OPUS_LIST= "opus_id_list";
	public static final String F_WALL_DATA = "data";

	public static final String T_USER_WALL = "user_wall";
	public static final String T_CONTEST_LATEST_OPUS_INDEX = "contest_latest_opus";
	public static final String T_CONTEST_MY_OPUS_INDEX = "contest_my_opus";

	public static final String F_OPUS_ID_LIST = "opus_id_list";

	public static final String T_BLACK_USER = "black_user";
	public static final String T_BLACK_DEVICE = "black_device";

	// add for draw data
	public static final String F_DRAW_DATA_URL = "data_url";
	public static final String F_DATA_URL = "data_url";

	public static final String F_FILE_GEN = "file_gen";
	public static final String F_FILE_GEN_RESULT = "file_gen_result";

	public static final String F_ZODIAC = "zodiac";
	public static final String F_GUESS_WORD_LANGUAGE = "guess_lang";

	public static final String F_PATH = "path";
	public static final String F_IS_ABSOLUTE = "absolute";

	public static final String T_USER_PHOTO = "user_photo";

	public static final String F_BLOOD = "blood";
	public static final String F_OPEN_INFO_TYPE = "open_info";
    public static final String F_SING_RECORD_LIMIT = "sing_record_limit";

//	public static final int C_DEFAULT_DICE_AWARD_INGOT = 5;
//	public static final int C_DEFAULT_ZJH_AWARD_INGOT  = 8;
//
//	public static final int C_DEFAULT_DICE_AWARD_COINS  = 2000;
//	public static final int C_DEFAULT_ZJH_AWARD_COINS  = 2500;
//	public static final int C_DEFAULT_DRAW_AWARD_COINS  = 3000;

	// for elasticsearch
	public static final String ES_INDEX_NAME = "game";
	public static final String ES_INDEX_TYPE_USER = "user";
    public static final String ES_INDEX_TYPE_POST = "post";
    public static final String ES_INDEX_TYPE_GROUP_TOPIC = "topic";
    public static final String ES_INDEX_TYPE_SONG = "song";
    public static final String ES_INDEX_TYPE_GROUP = "group";

	public static final String ES_NICK_NAME = "nick_name";
	public static final String ES_EMAIL = "email";
	public static final String ES_SINA_NICK = "sina_nick";
	public static final String ES_QQ_NICK = "qq_nick";
	public static final String ES_SINA_ID = "sina_id";
	public static final String ES_QQ_ID = "qq_id";
	public static final String ES_FACEBOOK_ID = "facebook_id";
	public static final String ES_SIGNATURE = "signature";
	public static final String ES_USER_ID = "user_id";
    public static final String ES_POST_ID = "post_id";
	public static final String ES_INDEX_MASK = "index_mask";
    public static final String ES_XIAOJI_NUMBER = "xiaoji";
    public static final String ES_CONTENT = "content";

    public static final String ES_SONG_NAME = "name";
    public static final String ES_SONG_AUTHOR = "author";
    public static final String ES_SONG_ALBUM = "album";
    public static final String ES_SONG_TAGS = "tags";
    public static final String ES_SONG_ID = "song_id";


    //Group
    public static final String ES_DESCRIPTION = "description";
    public static final String ES_NAME = "name";
    public static final String ES_GROUP_ID = "group_id";
	
	//learn draw
	public static final String T_LEARN_DRAW = "learn_draw";
	public static final String T_LEARN_DRAW_INDEX = "learn_draw_index";
	public static final String F_BOUGHT_TIMES = "buy_times";

	public static final String F_LEARN_DRAW = "learn_draw";
	public static final String APPID_LEARN_DRAW = "635820146"; 

	public static final String T_USER_ERROR_ES = "user_error_es";		// user elastic search index error id

	// redis name space
	public static final String REDIS_NS_HOT_FEED_CN = "hot_feed:cn";
	public static final String REDIS_NS_HOT_FEED_EN = "hot_feed:en";

	public static final int MAX_WALL_REWARD_INGOT = 10;

	public static final int C_SELL_CONTENT_TYPE_LEARN_DRAW = 1;
	public static final int C_SELL_CONTENT_TYPE_AVATAR = 2;
	public static final int C_SELL_CONTENT_TYPE_LOCK_SCREEN = 3;

	public static final String F_SELL_CONTENT_TYPE = "sell_type";
	public static final String F_IS_JAILBROKEN = "is_jb";	

	public static final String F_BY_USER_ID = "by_uid";

	public static final String T_RECOMMEND_OPUS = "recommend_opus";

	public static final int C_CATEGORY_TYPE_DRAW = 0;
	public static final int C_CATEGORY_TYPE_SING = 1;
	public static final int C_CATEGORY_TYPE_ASKPS = 2;

	public static final String F_ID_LIST = "list";
	public static final String F_TOTAL_COUNT = "total";
	public static final String F_UNREAD_COUNT = "unread";
    public static final String F_TOTAL_DEFEAT = "defeat";

	public static final String F_READ_DATE = "r_date";

	public static final String T_OPUS = "opus";
	public static final String T_OPUS_ACTION = "opus_action";

	public static final String C_SUB_CATEGORY_CAICAIHUHUA_CN = "caicaihuahua_cn";
	public static final String C_SUB_CATEGORY_CAICAIHUHUA_EN = "caicaihuahua_en";	
	public static final String C_SUB_CATEGORY_XIAOJIHUAHUA = "xiaojihuahua";
	public static final String C_SUB_CATEGORY_NICHANGWOCAI = "nichangwocai";

	public static final int C_LANGUAGE_CHINESE = 1;
	public static final int C_LANGUAGE_ENGLISH = 2;

	public static final String T_PHOTO = "photo";
	public static final String T_USER_PHOTO_INDEX = "user_photo_index";

	public static final String T_USER_PHOTO_DATA = "user_photo_data";

	public static final String F_PHOTO_ID = "pid";

	public static final String F_USAGE = "usage";

	public static final int PAYMENT_SENT = 0;
	public static final int PAYMENT_SUCCESS = 1;
	public static final int PAYMENT_FAIL = 2;
	public static final String T_ALIPAY_TRANSACTION = "alipay_trans";
	public static final String F_STATUS_INFO = "err";
    public static final String F_STATUS_DESC = "status_desc";
	public static final String F_BUYER_EMAIL = "buyer";

	public static final String F_INDEX_DONE = "index_done";

	
	public static final String F_VOICE_TYPE     = "voice_type";
    public static final String F_FORMANT        = "formant";
    public static final String F_DURATION       = "duration";
    public static final String F_PITCH          = "pitch";

    // song表
    public static final String T_SONG = "song";
    public static final String F_SONG_NAME      = "song_name";
    public static final String F_SONG_ID        = "song_id";
    public static final String F_SONG_AUTHOR    = "song_author";
    public static final String F_SONG_LYRIC_URL = "song_lyric_url";
    public static final String F_SONG_LYRIC_PATH= "song_lyric_path";
 	public static final String F_SONG_URL       = "song_url";
 	public static final String F_SONG_ALBUM     = "song_album";
 	public static final String F_SONG_SINGER    = "singer_name";
 	public static final String F_SONG_RANDOM    = "random"; // 随机数值,　用于RandomGetSongService

 	//　singer表
 	public static final String T_SINGER = "singer";
 	public static final String F_SINGER_NAME_CAPITAL = "name_capital";
 	public static final String F_SINGER_SONG_INDEX_ID = "song_index_id";
 	
    // singer_song_index表,　某歌手的歌曲索引表
	public static final String T_SINGER_SONG_INDEX = "singer_song_index";
	public static final String F_SONG_OID_MAP = "song_oid_map";

	// song_category表
	public static final String T_SONG_CATEGORY = "song_category";
	public static final String F_SONG_CATEGORY = "category";
	public static final String F_SONG_SUBCATEGORY = "subcategory";
	public static final String F_SONGS_DATA = "songs_data";

	public static final String F_HEIGHT = "height";

	public static final String F_WIDTH = "width";

    public static final String ANOUNYMOUS_USER_ID = "53be23a6e4b05fb3fcd5d3db"; //MessageManager.DRAW_CUSTOMER_SERVICER_ID;
    public static final String ANOUNYMOUS_USER_NICK = "就不告诉你";
    public static final String ANOUNYMOUS_USER_AVATAR = "";
    public static final String ANOUNYMOUS_USER_SIGNATURE = "哈哈，比赛是匿名的，我就不告诉你，不好意思了";


    //PushMessage_表
    public static final String T_PUSH_MESSAGE_BOARDCAST = "push_";
    public static  final  int F_PUSH_MESSAGE_ACTION_REMOVE_ALL_SEND = 1;
    public static final int F_PUSH_MESSAGE_ACTION_RESEND_ALL = 2;
    public static final int F_PUSH_MESSAGE_ACTION_START_NEW = 3;
    public static final int F_PUSH_MESSAGE_ACTION_PUSH = 4;
    public static final int F_PUSH_MESSAGE_ACTION_INSERT_TABLE = 5;
    //tutorial_stage_post 表
    public static final String T_TUTORIAL_STAGE_POST = "tutorial_stage_post";



}
