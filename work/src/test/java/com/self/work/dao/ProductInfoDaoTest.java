package com.self.work.dao;

import com.self.work.entity.ProductInfo;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

/**
 * @Author: zhouyh
 * @Date: 2018-04-13 17:04
 * @Description:
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class ProductInfoDaoTest {
    @Autowired
    private ProductInfoDao productInfoDao;
    @Test
    public void TestSave(){
        ProductInfo productInfo=new ProductInfo();
        productInfo.setProductId("1234561");
        productInfo.setProductName("好吃");
        productInfo.setProductPrice(new BigDecimal(3.5));
        productInfo.setProductStock(10001);
        productInfo.setProductDescription("不错的好吃");
        productInfo.setProductIcon("http://xxxxfdf.jpg");
        productInfo.setCategoryType(8);
        productInfo.setProductStatus(0);
        productInfo.setCreateTime(new Date());
        productInfo.setUpdateTime(new Date());
        ProductInfo pr = productInfoDao.save(productInfo);
        Assert.assertNotNull(pr);
    }
    @Test
    public void TestFindByProductStatus() throws Exception {
        List<ProductInfo> byProductStatus = productInfoDao.findByProductStatus(0);
        Assert.assertTrue(byProductStatus.size()>0);
    }

}