package com.cme.cloud.eurekaclient;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/***
 * 通过注解 @EnableEurekaClient 表明自己是一个eurekaclient
 */
@EnableEurekaClient
@SpringBootApplication
public class EurekaclientApplication {

    private final static Logger log = LoggerFactory.getLogger(EurekaclientApplication.class);

    public static void main(String[] args) {
        SpringApplication.run(EurekaclientApplication.class, args);
        log.info("服务提供者启动成功");
    }

}
