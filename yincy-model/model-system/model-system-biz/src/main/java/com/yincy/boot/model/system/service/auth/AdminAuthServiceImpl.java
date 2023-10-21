package com.yincy.boot.model.system.service.auth;


import cn.hutool.core.util.ObjectUtil;
import com.yincy.boot.framework.common.enums.CommonStatusEnum;
import com.yincy.boot.model.system.controller.admin.auth.vo.AuthLoginReqVO;
import com.yincy.boot.model.system.controller.admin.auth.vo.AuthLoginRespVO;
import com.yincy.boot.model.system.convert.auth.AuthConvert;
import com.yincy.boot.model.system.dal.dataobject.oauth2.OAuth2AccessTokenDO;
import com.yincy.boot.model.system.dal.dataobject.user.AdminUserDO;
import com.yincy.boot.model.system.enums.oauth2.OAuth2ClientConstants;
import com.yincy.boot.model.system.service.oauth2.OAuth2TokenService;
import com.yincy.boot.model.system.service.user.AdminUserService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

import static com.yincy.boot.framework.common.exception.util.ServiceExceptionUtil.exception;
import static com.yincy.boot.model.system.enums.ErrorCodeConstants.AUTH_LOGIN_BAD_CREDENTIALS;
import static com.yincy.boot.model.system.enums.ErrorCodeConstants.AUTH_LOGIN_USER_DISABLED;

/**
 * Auth Service 实现类
 *
 * @author yincy
 */
@Service
@Slf4j
public class AdminAuthServiceImpl implements AdminAuthService {

    @Resource
    private AdminUserService userService;

    @Resource
    private OAuth2TokenService oauth2TokenService;


    @Override
    public AuthLoginRespVO login(AuthLoginReqVO reqVO) {
        // 使用账号密码，进行登录
        AdminUserDO user = authenticate(reqVO.getUsername(), reqVO.getPassword());
        // 创建 Token 令牌，记录登录日志
        return createTokenAfterLoginSuccess(user.getId(), reqVO.getUsername());
    }

    private AuthLoginRespVO createTokenAfterLoginSuccess(Long userId, String username) {
        // 创建访问令牌
        OAuth2AccessTokenDO accessTokenDO = oauth2TokenService.createAccessToken(userId,
                OAuth2ClientConstants.CLIENT_ID_DEFAULT, null);
        // 构建返回结果
        return AuthConvert.INSTANCE.convert(accessTokenDO);
    }

    @Override
    public AdminUserDO authenticate(String username, String password) {
        // 校验账号是否存在
        AdminUserDO user = userService.getUserByUsername(username);
        if (user == null) {
            throw exception(AUTH_LOGIN_BAD_CREDENTIALS);
        }
        if (!userService.isPasswordMatch(password, user.getPassword())) {
            throw exception(AUTH_LOGIN_BAD_CREDENTIALS);
        }
        // 校验是否禁用
        if (ObjectUtil.notEqual(user.getStatus(), CommonStatusEnum.ENABLE.getStatus())) {
            throw exception(AUTH_LOGIN_USER_DISABLED);
        }
        return user;
    }
}
