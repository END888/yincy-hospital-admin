package com.yincy.boot.model.system.convert.permission;

import com.yincy.boot.model.system.controller.admin.permission.vo.permission.RoleCreateReqVO;
import com.yincy.boot.model.system.dal.dataobject.permission.RoleDO;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface RoleConvert {

    RoleConvert INSTANCE = Mappers.getMapper(RoleConvert.class);

    RoleDO convert(RoleCreateReqVO bean);

}
