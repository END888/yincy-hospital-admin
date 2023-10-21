package com.yincy.boot.model.system.service.auth;

import com.yincy.boot.model.system.controller.admin.auth.vo.AuthLoginReqVO;
import com.yincy.boot.model.system.controller.admin.auth.vo.AuthLoginRespVO;
import com.yincy.boot.model.system.dal.dataobject.user.AdminUserDO;

import javax.validation.Valid;

/**
 * 管理后台的认证 Service 接口
 *
 * 提供用户的登录、登出的能力
 *
 * @author yincy
 */
public interface AdminAuthService {


    /**
     * 验证账号 + 密码。如果通过，则返回用户
     *
     * @param username 账号
     * @param password 密码
     * @return 用户
     */
    AdminUserDO authenticate(String username, String password);

    /**
     * 账号登录
     *
     * @param reqVO 登录信息
     * @return 登录结果
     */
    AuthLoginRespVO login(@Valid AuthLoginReqVO reqVO);
}
