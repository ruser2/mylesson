package com.self.work.dao;

import com.self.work.entity.ProductCategory;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.domain.Example;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.transaction.annotation.Transactional;

import java.util.Date;
import java.util.Optional;

/**
 * @Author: zhouyh
 * @Date: 2018-03-18 16:06
 * @Description:
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class ProductCategoryDaoTest {
    @Autowired
    private ProductCategoryDao productCategoryDao;
    @Test
    @Transactional          //这里会自然回滚,但是主键触发器会+1
    public void testSave(){
        ProductCategory productCategory=new ProductCategory();
        productCategory.setCategoryName("update");
        productCategory.setCreateTime(new Date());
        productCategory.setUpdateTime(new Date());
        productCategory.setCategoryType(100);
        System.out.println(productCategoryDao.save(productCategory));
    }

    @Test
    @Transactional
    public void testUpdate(){
        ProductCategory productCategory =productCategoryDao.findById(3).get();
//                new ProductCategory();//
        productCategory.setCategoryId(3);
        productCategory.setCategoryName("updated");
        System.out.println(productCategoryDao.save(productCategory));
    }

    @Test
    public void testFindOne(){
        ProductCategory query=new ProductCategory();
        query.setCategoryId(1);
        Example example=Example.of(query);
        Optional result = productCategoryDao.findOne(example);
        System.out.println(result.get());
    }

    @Test
    public void testFindById(){

        Optional result = productCategoryDao.findById(2);
        System.out.println(result.get());
    }

}