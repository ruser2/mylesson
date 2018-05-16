package com.self.work.service.impl;

import com.self.work.dao.ProductCategoryDao;
import com.self.work.entity.ProductCategory;
import com.self.work.service.ProductCategoryServiceExtendBase;
import com.self.work.service.base.BaseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Author: zhouyh
 * @Date: 2018-03-18 19:03
 * @Description:
 */
@Service
public class ProductCategoryImplExtendBase extends BaseService<ProductCategory,Integer> implements ProductCategoryServiceExtendBase {

    @Autowired
    private ProductCategoryDao dao;


    @Override
    public JpaRepository<ProductCategory, Integer> getDao() {
        return dao;
    }

    @Override
    public List<ProductCategory> findByCategoryTypeIn(List<Integer> categoryTypeList) {
        return dao.findByCategoryTypeIn(categoryTypeList);
    }


}
