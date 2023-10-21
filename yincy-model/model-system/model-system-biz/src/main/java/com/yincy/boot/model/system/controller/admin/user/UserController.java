package com.yincy.boot.model.system.controller.admin.user;

import com.yincy.boot.framework.common.pojo.CommonResult;
import com.yincy.boot.model.system.controller.admin.user.vo.user.UserCreateReqVO;
import com.yincy.boot.model.system.controller.admin.user.vo.user.UserPageItemRespVO;
import com.yincy.boot.model.system.controller.admin.user.vo.user.UserRespVO;
import com.yincy.boot.model.system.convert.user.UserConvert;
import com.yincy.boot.model.system.dal.dataobject.user.AdminUserDO;
import com.yincy.boot.model.system.service.user.AdminUserService;
import io.swagger.v3.oas.annotations.Operation;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import javax.validation.Valid;

import static com.yincy.boot.framework.common.pojo.CommonResult.success;

/**
 * @author yincy
 */
@RestController
@RequestMapping("/system/user")
@Validated
public class UserController {

    @Resource
    private AdminUserService userService;

    @GetMapping("/get")
//    @PreAuthorize("@ss.hasRole('root')")
    public CommonResult<UserPageItemRespVO> getUser(@RequestParam("id") Long id) {
        AdminUserDO user = userService.getUser(id);
        return success(UserConvert.INSTANCE.convert(user));
    }

    @PostMapping("/create")
    public CommonResult<Long> createUser(@Valid @RequestBody UserCreateReqVO reqVO) {
        Long id = userService.createUser(reqVO);
        return success(id);
    }
}
