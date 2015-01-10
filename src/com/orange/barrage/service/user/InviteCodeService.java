package com.orange.barrage.service.user;

import com.orange.barrage.model.user.InviteCodeManager;
import com.orange.protocol.message.ErrorProtos;
import com.orange.protocol.message.MessageProtos;

import java.util.Set;

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
        return InviteCodeManager.getInstance().checkInviteCode(code);
    }

    public int getNewInviteCode(int count, MessageProtos.PBGetNewInviteCodeResponse.Builder builder) {

        Set<String> codes = InviteCodeManager.getInstance().generateInviteCode(count);
        if (codes == null || codes.size() == 0){
            return ErrorProtos.PBError.ERROR_NO_INVITE_CODE_AVAILABLE_VALUE;
        }

        builder.addAllInviteCodes(codes);
        return 0;
    }
}
