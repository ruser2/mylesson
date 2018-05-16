package com.self.work.service;

import com.self.work.entity.ProductCategory;
import com.self.work.service.base.IBaseService;

import java.util.List;

/**
 * @Author: zhouyh
 * @Date: 2018-03-18 19:02
 * @Description:
 */
public interface ProductCategoryServiceExtendBase extends IBaseService<ProductCategory,Integer> {
    List<ProductCategory> findByCategoryTypeIn(List<Integer> categoryTypeList);
}
