package com.yincy.boot.model.system.dal.mysql.permission;


import com.yincy.boot.framework.mybatis.core.dataobject.BaseDO;
import com.yincy.boot.framework.mybatis.core.mapper.BaseMapperX;
import com.yincy.boot.model.system.dal.dataobject.permission.RoleDO;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.lang.Nullable;

import java.util.Collection;
import java.util.List;

/**
 * @author yincy
 */
@Mapper
public interface RoleMapper extends BaseMapperX<RoleDO> {

    /**
     * 根据角色名称查询角色信息
     * @param name 角色名称
     * @return 角色信息
     */
    default RoleDO selectByName(String name) {
        return selectOne(RoleDO::getName, name);
    }

    /**
     * 根据角色标识查询角色信息
     * @param code 角色标识
     * @return 角色信息
     */
    default RoleDO selectByCode(String code) {
        return selectOne(RoleDO::getCode, code);
    }

    /**
     * 根据角色状态查询角色信息列表
     * @param statuses 角色状态
     * @return 角色信息列表
     */
    default List<RoleDO> selectListByStatus(@Nullable Collection<Integer> statuses) {
        return selectList(RoleDO::getStatus, statuses);
    }

}
