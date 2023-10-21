package com.yincy.boot.model.system.convert.auth;

import com.yincy.boot.model.system.controller.admin.auth.vo.AuthLoginRespVO;
import com.yincy.boot.model.system.dal.dataobject.oauth2.OAuth2AccessTokenDO;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

/**
 * @author yincy
 */
@Mapper
public interface AuthConvert {

    AuthConvert INSTANCE = Mappers.getMapper(AuthConvert.class);

    AuthLoginRespVO convert(OAuth2AccessTokenDO bean);
}
