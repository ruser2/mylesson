package com.zhouyh.myspringboot.service;

import com.zhouyh.myspringboot.dao.UserDao;
import com.zhouyh.myspringboot.domain.jpa.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @Author: zhouyh
 * @Date: 2018-03-14 15:29
 * @Description:
 */
@Service
public class UserService {
    @Autowired
    private UserDao userDao;

    public User findOne(Integer id) {
        return userDao.findById(id).get();
    }

}
