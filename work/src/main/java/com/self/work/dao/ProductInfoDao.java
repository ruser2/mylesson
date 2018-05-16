package com.self.work.dao;

import com.self.work.entity.ProductInfo;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/**
 * @Author: zhouyh
 * @Date: 2018-04-13 17:02
 * @Description:
 */
public interface ProductInfoDao extends JpaRepository<ProductInfo,String>{
    /**
     * 查询对应状态的商品
     * @param productStatus
     * @return
     */
    List<ProductInfo> findByProductStatus(Integer productStatus);
}
