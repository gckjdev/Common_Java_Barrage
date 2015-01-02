package com.orange.barrage.service.user;

import com.orange.protocol.message.MessageProtos;

/**
 * Created by pipi on 14/12/27.
 */
public class InviteCodeService {
    private static InviteCodeService ourInstance = new InviteCodeService();

    public static InviteCodeService getInstance() {
        return ourInstance;
    }

    private InviteCodeService() {
    }

    public int checkInviteCode(String code, MessageProtos.PBVerifyInviteCodeResponse.Builder builder) {
        // TODO
        return 0;
    }
}
