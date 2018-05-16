package com.self.work.service;

import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * @Author: zhouyh
 * @Date: 2018-03-15 14:01
 * @Description:
 */
@RunWith(SpringRunner.class)
@SpringBootTest
@Slf4j
public class LoggerTest {

    private final Logger logger= LoggerFactory.getLogger(getClass());
    @Test
    public void test1(){
        logger.info("info");
        logger.debug("debug");
        logger.warn("warn");
        logger.error("error");
        log.info("info");
        log.debug("debug");
        log.warn("warn");
        log.error("error");
    }
}
