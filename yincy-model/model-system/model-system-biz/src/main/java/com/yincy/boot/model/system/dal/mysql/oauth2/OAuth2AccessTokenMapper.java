package com.yincy.boot.model.system.dal.mysql.oauth2;

import com.yincy.boot.framework.mybatis.core.mapper.BaseMapperX;
import com.yincy.boot.model.system.dal.dataobject.oauth2.OAuth2AccessTokenDO;
import org.apache.ibatis.annotations.Mapper;


/**
 * @author yincy
 */
@Mapper
public interface OAuth2AccessTokenMapper extends BaseMapperX<OAuth2AccessTokenDO> {

    /**
     * 根据访问令牌查询令牌信息
     * @param accessToken 访问令牌
     * @return 令牌信息
     */
    default OAuth2AccessTokenDO selectByAccessToken(String accessToken) {
        return selectOne(OAuth2AccessTokenDO::getAccessToken, accessToken);
    }


}