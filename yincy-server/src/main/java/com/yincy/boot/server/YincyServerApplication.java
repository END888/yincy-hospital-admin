package com.yincy.boot.server;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author 24720
 */
@SpringBootApplication(scanBasePackages = {"${yincy.info.base-package}.server", "${yincy.info.base-package}.model"})
public class YincyServerApplication {

    public static void main(String[] args) {
        SpringApplication.run(YincyServerApplication.class, args);
    }
}
