package com.orange.game.model.manager.opusclass;

import com.orange.game.constants.DBConstants;
import com.orange.game.model.common.CommonZSetIndexManager;
import com.orange.game.model.dao.UserAction;
import com.orange.game.model.manager.opus.OpusUtils;

import java.util.List;
import java.util.concurrent.Callable;

/**
 * Created with IntelliJ IDEA.
 * User: qqn_pipi
 * Date: 14-6-4
 * Time: 下午5:37
 * To change this template use File | Settings | File Templates.
 */
public class OpusClassHotTopManager extends CommonZSetIndexManager<UserAction> {

    private static final String REDIS_PREFIX = "opus_class_hot_top_";
    private static final String MONGO_TABLE_NAME = DBConstants.T_OPUS;
    private static final int HOT_TOP_COUNT = 20000;

    public OpusClassHotTopManager(String className) {
        super(REDIS_PREFIX+className.toLowerCase(), MONGO_TABLE_NAME, HOT_TOP_COUNT, UserAction.class);
    }

    public void updateOpusScore(final String opusId, final double score){
        this.updateTopScore(opusId, score, null, false, true);
    }


    public List<UserAction> getTopList(int offset,int limit){
        return getTopList(offset, limit, DBConstants.F_OPUS_STATUS, UserAction.STATUS_DELETE, OpusUtils.NORMAL_RETURN_FIELDS);
    }
}
