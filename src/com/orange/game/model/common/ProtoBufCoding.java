package com.orange.game.model.common;

import com.google.protobuf.GeneratedMessage;
import com.orange.network.game.protocol.message.GameMessageProtos;

/**
 * Created with IntelliJ IDEA.
 * User: gckj
 * Date: 13-11-2
 * Time: 上午10:59
 * To change this template use File | Settings | File Templates.
 */
public interface ProtoBufCoding<T extends GeneratedMessage> {
    T toProtoBufModel();
    void addIntoResponse(GameMessageProtos.DataQueryResponse.Builder builder);
}
