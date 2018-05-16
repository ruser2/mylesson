package com.self.work.service.impl;

import com.self.work.dao.ProductCategoryDao;
import com.self.work.entity.ProductCategory;
import com.self.work.service.ProductCategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Author: zhouyh
 * @Date: 2018-03-18 19:03
 * @Description:
 */
@Service
public class ProductCategoryImpl implements ProductCategoryService {

    @Autowired
    ProductCategoryDao productCategoryDao;
    @Override
    public ProductCategory findById(Integer categoryId) {
        System.out.println(productCategoryDao.findById(categoryId).get() == null);
        return null;
    }

    @Override
    public List<ProductCategory> findAll() {
        return productCategoryDao.findAll();
    }

    @Override
    public List<ProductCategory> findByCategoryTypeIn(List<Integer> categoryTypeList) {
        return productCategoryDao.findByCategoryTypeIn(categoryTypeList);
    }

    @Override
    public ProductCategory save(ProductCategory productCategory) {
        return productCategoryDao.save(productCategory);
    }
}
