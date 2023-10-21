package com.yincy.boot.model.system.dal.mysql.user;

import com.yincy.boot.framework.mybatis.core.mapper.BaseMapperX;
import com.yincy.boot.model.system.dal.dataobject.user.AdminUserDO;
import org.apache.ibatis.annotations.Mapper;


/**
 * @author yincy
 */
@Mapper
public interface AdminUserMapper extends BaseMapperX<AdminUserDO> {

    /**
     * 根据用户名查询用户
     * @param username 用户名
     * @return 用户
     */
    default AdminUserDO selectByUsername(String username) {
        return selectOne(AdminUserDO::getUsername, username);
    }

    /**
     * 根据手机号查询用户
     * @param mobile 手机号
     * @return 用户
     */
    default AdminUserDO selectByMobile(String mobile) {
        return selectOne(AdminUserDO::getMobile, mobile);
    }

    /**
     * 根据邮箱查询用户
     * @param email 邮箱
     * @return 用户
     */
    default AdminUserDO selectByEmail(String email) {
        return selectOne(AdminUserDO::getEmail, email);
    }
}