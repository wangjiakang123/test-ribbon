package com.testribbon1.controller;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.testribbon1.api.ApiTest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {

    @Autowired
    public ApiTest apiTests;

    @RequestMapping("test01")
    //@HystrixCommand(fallbackMethod = "testBack")
    public String test01(){
      //  String das="";
       //循环10000次调用
        /*for (int i=0;i<10000;i++){
          String da= apiTests.test01();
          das=das+da;
        }*/



     return apiTests.test01();
    }
    public String testBack(){
        return "出错了-->>";
    }


}
