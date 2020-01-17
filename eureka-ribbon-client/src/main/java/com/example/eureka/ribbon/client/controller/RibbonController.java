package com.example.eureka.ribbon.client.controller;

import com.example.eureka.ribbon.client.service.RibbonService;
import com.netflix.discovery.converters.Auto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RibbonController {

    @Autowired
    private RibbonService ribbonService;

    @GetMapping("/hello")
    public String hello(@RequestParam(required = false, defaultValue = "Simon") String name) {
        return ribbonService.hello(name);
    }

}
