package com.cme.cloud.servicefeign.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * 定义一个feign接口，通过@ FeignClient（“服务名”），来指定调用哪个服务。
 * 比如在代码中调用了eureka-client服务的“/hi”接口
 * * * *
 * Feign中使用断路器
 * 只需要在FeignClient的SchedualServiceHi接口的注解中加上fallback的指定类就行了
 * SchedualEurekaClientImpl 需要继承 SchedualEurekaClient 并实现 sayHiFromClientOne 方法
 */

@FeignClient(value = "eureka-client", fallback = SchedualEurekaClientImpl.class)
public interface SchedualEurekaClient {

    @RequestMapping(value = "/hi", method = RequestMethod.GET)
    String sayHiFromClientOne(@RequestParam(value = "name") String name);
}
