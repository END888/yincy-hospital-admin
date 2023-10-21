package com.yincy.boot.model.system.service.user;

import com.yincy.boot.model.system.controller.admin.user.vo.user.UserCreateReqVO;
import com.yincy.boot.model.system.dal.dataobject.user.AdminUserDO;

import javax.validation.Valid;

/**
 * 后台用户 Service 接口
 *
 * @author ycy
 */
public interface AdminUserService {

    /**
     * 通过用户 ID 查询用户
     *
     * @param id 用户ID
     * @return 用户对象信息
     */
    AdminUserDO getUser(Long id);

    /**
     * 创建用户
     *
     * @param reqVO 用户信息
     * @return 用户编号
     */
    Long createUser(@Valid UserCreateReqVO reqVO);

    /**
     * 通过用户名查询用户
     *
     * @param username 用户名
     * @return 用户对象信息
     */
    AdminUserDO getUserByUsername(String username);

    /**
     * 判断密码是否匹配
     *
     * @param rawPassword 未加密的密码
     * @param encodedPassword 加密后的密码
     * @return 是否匹配
     */
    boolean isPasswordMatch(String rawPassword, String encodedPassword);

    /**
     * 对密码进行加密
     * @param password 要加密的密码
     * @return 加密后的密码
     */
    String encodePassword(String password);
}
