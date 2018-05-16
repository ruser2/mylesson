package com.zhouyh.myspringboot.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author: zhouyh
 * @Date: 2018-03-11 15:51
 * @Description:
 */
@RestController
@RequestMapping("/aopTest")
public class AopTestController {
    public final Logger logger = LoggerFactory.getLogger(getClass());


    @GetMapping(value = "/test")
    public String test() {
        return "aa";
    }

    @GetMapping(value = "/testThrow")
    public String testThrow() {
        if (true) {
            throw new RuntimeException("---");
        }
        return "bb";
    }
}
