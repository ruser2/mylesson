package com.self.work.service.base;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

/**
 * @Author: zhouyh
 * @Date: 2018-03-18 19:29
 * @Description:
 */
public abstract class BaseService<T,ID> implements IBaseService<T,ID> {

    public abstract JpaRepository<T,ID> getDao();


    public T findById(ID id){
        Optional<T> optional=getDao().findById(id);
        return optional.isPresent()?optional.get():null;
    }

    public List<T> findAll(){
        return getDao().findAll();
    }

    public T save(T t){
        return getDao().save(t);
    }

}
