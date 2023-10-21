package com.yincy.boot.model.system.service.permission;

import com.yincy.boot.model.system.controller.admin.permission.vo.permission.RoleCreateReqVO;
import com.yincy.boot.model.system.dal.dataobject.permission.RoleDO;

import javax.validation.Valid;
import java.util.Collection;
import java.util.List;

/**
 * 角色 Service 接口
 *
 * @author yyincy
 */
public interface RoleService {

    /**
     * 创建角色
     *
     * @param reqVO 创建角色信息
     * @param type 角色类型
     * @return 角色编号
     */
    Long createRole(@Valid RoleCreateReqVO reqVO, Integer type);

    /**
     * 校验角色们是否有效。如下情况，视为无效：
     * 1. 角色编号不存在
     * 2. 角色被禁用
     *
     * @param ids 角色编号数组
     */
    void validateRoleList(Collection<Long> ids);

    /**
     * 获得角色数组，从缓存中
     *
     * @param ids 角色编号数组
     * @return 角色数组
     */
    List<RoleDO> getRoleListFromCache(Collection<Long> ids);

    /**
     * 获得角色，从缓存中
     *
     * @param id 角色编号
     * @return 角色
     */
    RoleDO getRoleFromCache(Long id);
}
