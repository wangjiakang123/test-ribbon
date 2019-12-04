package com.testribbon1.api;


import com.netflix.ribbon.proxy.annotation.Hystrix;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

@FeignClient(name="riddon02",fallback = TestFallBackApi.class)
public interface ApiTest {

    @RequestMapping("test01")
    public String test01();



}
