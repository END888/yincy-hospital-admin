package com.yincy.boot.model.system.convert.auth;

import com.yincy.boot.model.system.api.oauth2.dto.OAuth2AccessTokenCheckRespDTO;
import com.yincy.boot.model.system.dal.dataobject.oauth2.OAuth2AccessTokenDO;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface OAuth2TokenConvert {

    OAuth2TokenConvert INSTANCE = Mappers.getMapper(OAuth2TokenConvert.class);

    OAuth2AccessTokenCheckRespDTO convert(OAuth2AccessTokenDO bean);

}
