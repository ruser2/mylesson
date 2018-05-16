package com.self.work.dao.mybatis;

import com.self.work.entity.mybatis.ProductCategory;
import com.self.work.entity.mybatis.ProductCategoryExample;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Arrays;
import java.util.Date;
import java.util.List;

/**
 * @Author: zhouyh
 * @Date: 2018-03-20 17:47
 * @Description:
 */

@RunWith(SpringRunner.class)
@SpringBootTest
public class ProductCategoryMapperTest {
    @Autowired
    ProductCategoryMapper productCategoryMapper;
    @Test
    public void TestCountByExample() throws Exception {
        ProductCategoryExample productCategoryExample=new ProductCategoryExample();
        ProductCategoryExample.Criteria criteria = productCategoryExample.createCriteria();
        criteria.andCategoryIdIn(Arrays.asList(1,2));
        ProductCategoryExample.Criteria or = productCategoryExample.or();
        or.andCategoryTypeEqualTo(5);





        List<ProductCategory> categoryList = productCategoryMapper.selectByExample(productCategoryExample);
        System.out.println(categoryList.size());
        for (ProductCategory item:
             categoryList) {
            System.out.println(item);
        }
//        productCategoryMapper.countByExample();
    }

    @Test
    public void TestDeleteByExample() throws Exception {
    }

    @Test
    public void TestDeleteByPrimaryKey() throws Exception {
    }

    @Test
    public void TestInsert() throws Exception {
    }

    @Test
    public void TestInsertSelective() throws Exception {
    }

    @Test
    public void TestSelectByExample() throws Exception {
    }

    @Test
    public void TestSelectByPrimaryKey() throws Exception {
    }

    @Test
    public void TestUpdateByExampleSelective() throws Exception {
    }

    @Test
    public void TestUpdateByExample() throws Exception {
    }

    @Test
    public void TestUpdateByPrimaryKeySelective() throws Exception {
    }

    @Test
    public void TestUpdateByPrimaryKey() throws Exception {
    }

}