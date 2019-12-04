package com.ribbon2.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Ribbon2Controller {

    @RequestMapping("test01")
    public String test01(){
        System.out.println("=====test01=====");
        return "OK";
    }


}
