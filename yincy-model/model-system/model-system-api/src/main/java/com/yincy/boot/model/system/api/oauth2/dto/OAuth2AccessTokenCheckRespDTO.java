package com.yincy.boot.model.system.api.oauth2.dto;

import lombok.Data;

import java.io.Serializable;
import java.util.List;

/**
 * 访问令牌的校验 Response DTO
 *
 * @author yincy
 */
@Data
public class OAuth2AccessTokenCheckRespDTO implements Serializable {

    /**
     * 用户编号
     */
    private Long userId;
    /**
     * 授权范围的数组
     */
    private List<String> scopes;

}
