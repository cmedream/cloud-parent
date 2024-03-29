package com.cme.cloud.servicefeign.controller;

import com.cme.cloud.servicefeign.service.SchedualEurekaClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HiController {

    @Autowired
    SchedualEurekaClient schedualEurekaClient;

    @GetMapping("/hi")
    public String sayHi(@RequestParam String name) {
        return schedualEurekaClient.sayHiFromClientOne(name);
    }
}
