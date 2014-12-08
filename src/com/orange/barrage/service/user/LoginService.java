package com.orange.barrage.service.user;

import com.orange.barrage.common.CommonModelService;
import com.orange.barrage.constant.BarrageConstants;
import com.orange.barrage.model.user.UserManager;
import com.orange.common.utils.StringUtil;
import com.orange.protocol.message.ErrorProtos;
import com.orange.protocol.message.MessageProtos;
import com.orange.protocol.message.UserProtos;

/**
 * Created by pipi on 14/12/2.
 */
public class LoginService extends CommonModelService {

    private static LoginService ourInstance = new LoginService();

    public static LoginService getInstance() {
        return ourInstance;
    }

    private LoginService() {
    }

    public int loginByXiaoji(String xiaoji, String password, MessageProtos.PBLoginUserResponse.Builder rspBuilder) {

        if (StringUtil.isEmpty(xiaoji) ||
                StringUtil.isEmpty(password)){
            return ErrorProtos.PBError.ERROR_USER_LOGIN_INFO_EMPTY_VALUE;
        }



        return 0;
    }

    public int loginByEmail(String email, String password, MessageProtos.PBLoginUserResponse.Builder rspBuilder) {
        if (StringUtil.isEmpty(email) ||
                StringUtil.isEmpty(password)){
            return ErrorProtos.PBError.ERROR_USER_LOGIN_INFO_EMPTY_VALUE;
        }

        UserProtos.PBUser user = UserManager.findUser(BarrageConstants.F_EMAIL, email);


        return 0;
    }
}
