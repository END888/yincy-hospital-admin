package com.yincy.boot.model.system.api.oauth2;

import com.yincy.boot.model.system.api.oauth2.dto.OAuth2AccessTokenCheckRespDTO;

/**
 * Token API 接口
 *
 * @author yincy
 */
public interface OAuth2TokenApi {

    /**
     * 校验访问令牌
     *
     * @param accessToken 访问令牌
     * @return 访问令牌的信息
     */
    OAuth2AccessTokenCheckRespDTO checkAccessToken(String accessToken);
}
