package com.zhouyh.myspringboot.controller;

import com.zhouyh.myspringboot.dao.UserDao;
import com.zhouyh.myspringboot.domain.jpa.User;
import com.zhouyh.myspringboot.properties.TestProperties;
import com.zhouyh.myspringboot.response.Response;
import com.zhouyh.myspringboot.response.ResponseUtil;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;
import java.util.List;

/**
 * @Author: zhouyh
 * @Date: 2018-03-11 15:51
 * @Description:
 */
@RestController
@RequestMapping("/user")
public class UserController {
    public final Logger logger= LoggerFactory.getLogger(getClass());
    @Value("${test.test}")
    private String test;

    @Autowired
    private TestProperties testProperties;

    @Autowired
    private UserDao userDao;

    @GetMapping(value = "/list")
    public List<User> list(){
        return userDao.findAll();
    }

    @GetMapping(value = "/get")
    public User get(){
        return userDao.findById(1).get();
    }

    @PostMapping(value = "/save")
    public Response<User> save(@Valid User user, BindingResult bindingResult){
        if(bindingResult.hasErrors()){
            logger.error(bindingResult.getFieldError().getDefaultMessage());
            return ResponseUtil.fail(1,bindingResult.getFieldError().getDefaultMessage());
        }
        return ResponseUtil.success(userDao.save(user));
    }


    @PostMapping(value = "/sss")
    public Response<User> sss(@Valid User user, BindingResult bindingResult){
        if(bindingResult.hasErrors()){
            logger.error(bindingResult.getFieldError().getDefaultMessage());
            return ResponseUtil.fail(1,bindingResult.getFieldError().getDefaultMessage());
        }
        return ResponseUtil.success(userDao.save(user));
    }
}
