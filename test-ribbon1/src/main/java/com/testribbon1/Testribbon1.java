package com.testribbon1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@EnableFeignClients
@RestController
@EnableHystrix
@EnableCircuitBreaker
public class Testribbon1 {

    public static void main(String[] args) {
        SpringApplication.run(Testribbon1.class,args);
    }

    @RequestMapping("test41")
    public String da(){
        System.out.println("=====test41=====");
        return "OK01";
    }


}
