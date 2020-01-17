package com.example.eureka.feign.client.service;

import com.example.eureka.feign.client.engine.EurekaClientFeign;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class HelloService {

    @Autowired
    private EurekaClientFeign eurekaClientFeign;

    public String sayHello(String name) {
        return eurekaClientFeign.sayHelloFromEurekaClient(name);
    }

}
