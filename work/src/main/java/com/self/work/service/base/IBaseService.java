package com.self.work.service.base;

import java.util.List;

/**
 * @Author: zhouyh
 * @Date: 2018-03-18 19:20
 * @Description:
 */
public interface IBaseService<T,ID>{


    T findById(ID id);

    List<T> findAll();

    T save(T t);
}
