package com.self.work.service;

import com.self.work.entity.ProductCategory;

import java.util.List;

/**
 * @Author: zhouyh
 * @Date: 2018-03-18 19:02
 * @Description:
 */
public interface ProductCategoryService {
    ProductCategory findById(Integer categoryId);

    List<ProductCategory> findAll();

    List<ProductCategory> findByCategoryTypeIn(List<Integer> categoryTypeList);

    ProductCategory save(ProductCategory productCategory);
}
