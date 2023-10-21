package com.yincy.boot.model.system.convert.user;


import com.yincy.boot.model.system.controller.admin.user.vo.user.UserCreateReqVO;
import com.yincy.boot.model.system.controller.admin.user.vo.user.UserPageItemRespVO;
import com.yincy.boot.model.system.dal.dataobject.user.AdminUserDO;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

/**
 * @author yincy
 */
@Mapper
public interface UserConvert {
    UserConvert INSTANCE = Mappers.getMapper(UserConvert.class);

    UserPageItemRespVO convert(AdminUserDO bean);

    AdminUserDO convert(UserCreateReqVO bean);

}
