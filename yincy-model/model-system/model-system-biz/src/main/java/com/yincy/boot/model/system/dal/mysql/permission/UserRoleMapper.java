package com.yincy.boot.model.system.dal.mysql.permission;

import com.yincy.boot.framework.mybatis.core.mapper.BaseMapperX;
import com.yincy.boot.model.system.dal.dataobject.permission.UserRoleDO;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * @author yincy
 */
@Mapper
public interface UserRoleMapper extends BaseMapperX<UserRoleDO> {

    /**
     * 根据用户id查询用户角色信息列表
     * @param userId 用户id
     * @return 用户角色信息列表
     */
    default List<UserRoleDO> selectListByUserId(Long userId) {
        return selectList(UserRoleDO::getUserId, userId);
    }
}
