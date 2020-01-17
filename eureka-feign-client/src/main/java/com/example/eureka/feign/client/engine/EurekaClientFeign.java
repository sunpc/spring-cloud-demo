package com.example.eureka.feign.client.engine;

import com.example.eureka.feign.client.config.FeignConfig;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(value = "eureka-client", configuration = FeignConfig.class)
public interface EurekaClientFeign {

    @GetMapping(value = "/hello")
    String sayHelloFromEurekaClient(@RequestParam(value = "name") String name);

}
