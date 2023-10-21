package com.yincy.boot.framework.security.core.service;

import com.yincy.boot.framework.security.core.LoginUser;
import com.yincy.boot.model.system.api.permission.PermissionApi;
import lombok.AllArgsConstructor;
import org.springframework.lang.Nullable;

import static com.yincy.boot.framework.security.core.util.SecurityFrameworkUtils.getLoginUser;

/**
 * 默认的 {@link SecurityFrameworkService} 实现类
 *
 * @author 芋道源码
 */
@AllArgsConstructor
public class SecurityFrameworkServiceImpl implements SecurityFrameworkService {

    private final PermissionApi permissionApi;

    @Override
    public boolean hasRole(String role) {
        return hasAnyRoles(role);
    }

    @Override
    public boolean hasAnyRoles(String... roles) {
        return permissionApi.hasAnyRoles(getLoginUserId(), roles);
    }

    /**
     * 获得当前用户的编号，从上下文中
     *
     * @return 用户编号
     */
    @Nullable
    public static Long getLoginUserId() {
        LoginUser loginUser = getLoginUser();
        return loginUser != null ? loginUser.getId() : null;
    }
}
