package com.self.work.service.impl;

import com.self.work.entity.ProductCategory;
import com.self.work.service.ProductCategoryServiceExtendBase;
import lombok.extern.slf4j.Slf4j;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Arrays;
import java.util.List;

/**
 * @Author: zhouyh
 * @Date: 2018-03-18 19:08
 * @Description:
 */
@RunWith(SpringRunner.class)
@SpringBootTest
@Slf4j
public class ProductCategoryImplTest {
    @Autowired
    private ProductCategoryServiceExtendBase productCategoryService;
    @Test
    public void TestFindById() throws Exception {
        ProductCategory productCategory = productCategoryService.findById(2);
        Assert.assertEquals(new Integer(2),productCategory.getCategoryId());
    }

    @Test
    public void TestFindAll() throws Exception {
        List<ProductCategory> productCategoryList = productCategoryService.findAll();
        Assert.assertNotEquals(0,productCategoryList.size());
    }

    @Test
    public void TestFindByCategoryTypeIn() throws Exception {
        List<ProductCategory> productCategories = productCategoryService.findByCategoryTypeIn(Arrays.asList(1, 2, 3, 4));
        Assert.assertNotEquals(0, productCategories.size());
    }

    @Test
    public void TestSave() throws Exception {
//        ProductCategory productCategory = new ProductCategory("dsd",2,new Date(),new Date());
//
//        productCategoryService.save();
    }

}