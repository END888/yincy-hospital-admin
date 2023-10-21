package com.yincy.boot.server;

import com.yincy.boot.model.system.service.user.AdminUserService;
import com.yincy.boot.model.system.service.user.AdminUserServiceImpl;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

import javax.annotation.Resource;

public class PasswordEncoderTest {


    @Test
    void test1() {
        BCryptPasswordEncoder encoder = new BCryptPasswordEncoder();
        String password = "123456";
        String res = encoder.encode(password);
        System.out.println("res = " + res);
    }
}
