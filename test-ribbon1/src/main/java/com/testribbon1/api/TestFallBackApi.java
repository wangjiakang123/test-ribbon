package com.testribbon1.api;

import org.springframework.stereotype.Component;

@Component
public class TestFallBackApi implements ApiTest{

    @Override
    public String test01() {
        System.out.println("===错误====固定返回值======");

        return "错误Fegin";
    }
}
