package com.example.eureka.ribbon.client.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class RibbonService {

    @Autowired
    private RestTemplate restTemplate;

    public String hello(String name) {
        String url = "http://eureka-client/hello?name=" + name;
        return restTemplate.getForObject(url, String.class);
    }

}
