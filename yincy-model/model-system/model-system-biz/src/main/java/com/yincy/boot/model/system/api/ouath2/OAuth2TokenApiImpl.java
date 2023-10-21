package com.yincy.boot.model.system.api.ouath2;

import com.yincy.boot.model.system.api.oauth2.OAuth2TokenApi;
import com.yincy.boot.model.system.api.oauth2.dto.OAuth2AccessTokenCheckRespDTO;
import com.yincy.boot.model.system.convert.auth.OAuth2TokenConvert;
import com.yincy.boot.model.system.service.oauth2.OAuth2TokenService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * OAuth2.0 Token API 实现类
 *
 * @author 芋道源码
 */
@Service
public class OAuth2TokenApiImpl implements OAuth2TokenApi {

    @Resource
    private OAuth2TokenService oauth2TokenService;

    @Override
    public OAuth2AccessTokenCheckRespDTO checkAccessToken(String accessToken) {
        return OAuth2TokenConvert.INSTANCE.convert(oauth2TokenService.checkAccessToken(accessToken));
    }
}
