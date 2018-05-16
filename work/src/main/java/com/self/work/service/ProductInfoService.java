package com.self.work.service;

import com.self.work.entity.ProductInfo;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;

/**
 * @Author: zhouyh
 * @Date: 2018-04-13 17:27
 * @Description:
 */
public interface ProductInfoService {

    ProductInfo findById(String productId);

    //上架的
    List<ProductInfo> findUpAll();

    Page<ProductInfo> findAll(Pageable pageable);

    ProductInfo save(ProductInfo productInfo);


}
