package com.cme.cloud.servicezuul;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

/**
 * 在其入口applicaton类加上注解@EnableZuulProxy，开启zuul的功能
 *
 * @EnableDiscoveryClient 向注册注册服务
 */

@SpringBootApplication
@EnableZuulProxy
@EnableEurekaClient
@EnableDiscoveryClient
public class ServicezuulApplication {

    private final static Logger log = LoggerFactory.getLogger(ServicezuulApplication.class);

    public static void main(String[] args) {
        SpringApplication.run(ServicezuulApplication.class, args);
        log.info("路由器，过滤器(路由网关)启动成功");
    }

}
