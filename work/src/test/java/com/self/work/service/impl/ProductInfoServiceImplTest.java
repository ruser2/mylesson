package com.self.work.service.impl;

import com.self.work.entity.ProductInfo;
import com.self.work.service.ProductInfoService;
import lombok.extern.slf4j.Slf4j;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.test.context.junit4.SpringRunner;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

/**
 * @Author: zhouyh
 * @Date: 2018-04-13 17:39
 * @Description:
 */
@RunWith(SpringRunner.class)
@SpringBootTest
@Slf4j
public class ProductInfoServiceImplTest {
    @Autowired
    private ProductInfoService productInfoService;
    @Test
    public void TestFindById() throws Exception {
        ProductInfo byId = productInfoService.findById("123456");
        log.info(byId.toString());
        Assert.assertNotNull(byId);
    }

    @Test
    public void TestFindUpAll() throws Exception {
        List<ProductInfo> upAll = productInfoService.findUpAll();
        for (ProductInfo item:upAll
             ) {
            System.out.println(item);
        }
        Assert.assertTrue(upAll.size()>0);
    }

    @Test
    public void TestFindAll() throws Exception {
        PageRequest pageRequest=PageRequest.of(0,12);
        Page<ProductInfo> page = productInfoService.findAll(pageRequest);
        if(page.getTotalElements()>0){
            List<ProductInfo> content = page.getContent();
            for (ProductInfo item :
                    content) {
                System.out.println(item);
            }
        }
        Assert.assertTrue(page.getTotalElements()>0);
    }

    @Test
    public void TestSave() throws Exception {
        ProductInfo productInfo=new ProductInfo();
        productInfo.setProductId("2");
        productInfo.setProductName("好吃的很");
        productInfo.setProductPrice(new BigDecimal(44.5));
        productInfo.setProductStock(101);
        productInfo.setProductDescription("不错的好吃的很");
        productInfo.setProductIcon("http://xxxxfdf.jpg");
        productInfo.setCategoryType(7);
        productInfo.setProductStatus(0);
        productInfo.setCreateTime(new Date());
        productInfo.setUpdateTime(new Date());
        ProductInfo pr = productInfoService.save(productInfo);
        Assert.assertNotNull(pr);
    }

}