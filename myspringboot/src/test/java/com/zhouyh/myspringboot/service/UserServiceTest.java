package com.zhouyh.myspringboot.service;

import com.zhouyh.myspringboot.domain.jpa.User;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * @Author: zhouyh
 * @Date: 2018-03-14 16:01
 * @Description:
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class UserServiceTest {
    @Autowired
    private UserService userService;
    @Test
    public void TestFindOne() throws Exception {
        User user= userService.findOne(1);
        System.out.println(user);
        Assert.assertEquals(new Integer(1),user.getAge());



    }

}