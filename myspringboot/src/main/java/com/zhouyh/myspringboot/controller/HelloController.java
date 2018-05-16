package com.zhouyh.myspringboot.controller;

import com.zhouyh.myspringboot.properties.TestProperties;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author: zhouyh
 * @Date: 2018-03-11 15:51
 * @Description:
 */
@RestController
public class HelloController {

    @Value("${test.test}")
    private String test;

    @Autowired
    private TestProperties testProperties;


    @GetMapping(value = "/hello")
    public String fuckU(){
        System.out.println(test);
        System.out.println(testProperties);
        System.out.println(testProperties.getTest5());
        return "hello fuck u";
    }

    @GetMapping(value = "/test")
    public String test(){
        return "test";
    }
}
