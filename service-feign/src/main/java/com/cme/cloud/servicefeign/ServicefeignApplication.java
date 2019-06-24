package com.cme.cloud.servicefeign;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * 在程序的启动类ServiceFeignApplication ，
 * 加上@EnableFeignClients注解开启Feign的功能
 * *
 * 通过@EnableDiscoveryClient向服务中心注册
 * *
 *
 * @EnableEurekaClient 表明是个EurekaClient类
 */
@SpringBootApplication
@EnableFeignClients
@EnableDiscoveryClient
@EnableEurekaClient
public class ServicefeignApplication {

    private final static Logger log = LoggerFactory.getLogger(ServicefeignApplication.class);

    public static void main(String[] args) {
        SpringApplication.run(ServicefeignApplication.class, args);
        log.info("服务消费者 Feign 启动成功");
    }

}
