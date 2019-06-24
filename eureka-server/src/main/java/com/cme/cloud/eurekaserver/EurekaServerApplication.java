package com.cme.cloud.eurekaserver;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * 启动一个服务注册中心
 * 注解 @EnableEurekaServer 表示这是一个注册中心
 */

@EnableEurekaServer
@SpringBootApplication
public class EurekaServerApplication {

    private final static Logger log = LoggerFactory.getLogger(EurekaServerApplication.class);

    public static void main(String[] args) {
        SpringApplication.run(EurekaServerApplication.class, args);
        log.info("注册中心启动成功");
    }

}
