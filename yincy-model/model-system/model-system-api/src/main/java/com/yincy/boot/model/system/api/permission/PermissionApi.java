package com.yincy.boot.model.system.api.permission;
/**
 * 权限 API 接口
 *
 * @author 芋道源码
 */
public interface PermissionApi {

    /**
     * 判断是否有角色，任一一个即可
     *
     * @param userId 用户编号
     * @param roles 角色数组
     * @return 是否
     */
    boolean hasAnyRoles(Long userId, String... roles);

}
