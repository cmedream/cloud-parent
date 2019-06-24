package com.cme.cloud.serviceribbon;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

/**
 * 在工程的启动类中,通过@EnableDiscoveryClient向服务中心注册；
 * 并且向程序的ioc注入一个bean: restTemplate;
 * 并通过@LoadBalanced注解表明这个restRemplate开启负载均衡的功能
 * * * * * * *
 * 通过注解@EnableEurekaClient 表明自己是一个eurekaclient
 * * * * * * * *
 * 在ribbon使用断路器，在程序的启动类ServiceRibbonApplication 加@EnableHystrix注解开启Hystrix
 */

@SpringBootApplication
@EnableEurekaClient
@EnableDiscoveryClient
@EnableHystrix
public class ServiceribbonApplication {

    private final static Logger log = LoggerFactory.getLogger(ServiceribbonApplication.class);

    public static void main(String[] args) {
        SpringApplication.run(ServiceribbonApplication.class, args);
        log.info("服务消费者 Ribbon 启动成功");
    }

    @Bean
    @LoadBalanced
    RestTemplate restTemplate() {
        return new RestTemplate();
    }

}
