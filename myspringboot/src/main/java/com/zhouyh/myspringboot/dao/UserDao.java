package com.zhouyh.myspringboot.dao;

import com.zhouyh.myspringboot.domain.jpa.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * @Author: zhouyh
 * @Date: 2018-03-13 18:18
 * @Description:
 */
@Repository
public interface UserDao extends JpaRepository<User, Integer> {

}
