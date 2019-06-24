package com.cme.cloud.servicefeign.service;

import org.springframework.stereotype.Component;

@Component
public class SchedualEurekaClientImpl implements SchedualEurekaClient {

    @Override
    public String sayHiFromClientOne(String name) {
        return "sorry," + name;
    }
}
