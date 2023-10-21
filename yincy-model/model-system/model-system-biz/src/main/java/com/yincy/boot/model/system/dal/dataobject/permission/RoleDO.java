package com.yincy.boot.model.system.dal.dataobject.permission;


import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import com.yincy.boot.framework.common.enums.CommonStatusEnum;
import com.yincy.boot.framework.mybatis.core.dataobject.BaseDO;
import com.yincy.boot.model.system.enums.permission.RoleTypeEnum;
import lombok.Data;
import lombok.EqualsAndHashCode;


/**
 * 角色 DO
 *
 * @author yincy
 */
@TableName(value = "system_role", autoResultMap = true)
@Data
@EqualsAndHashCode(callSuper = true)
public class RoleDO extends BaseDO {

    /**
     * 角色ID
     */
    @TableId
    private Long id;
    /**
     * 角色名称
     */
    private String name;
    /**
     * 角色标识
     *
     * 枚举
     */
    private String code;
    /**
     * 角色排序
     */
    private Integer sort;
    /**
     * 角色状态
     *
     * 枚举 {@link CommonStatusEnum}
     */
    private Integer status;
    /**
     * 角色类型
     *
     * 枚举 {@link RoleTypeEnum}
     */
    private Integer type;
    /**
     * 备注
     */
    private String remark;


}
