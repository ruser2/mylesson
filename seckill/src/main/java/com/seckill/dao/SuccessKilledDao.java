package com.seckill.dao;

import com.seckill.mapperparam.SuccessKilledQuery;
import com.seckill.mapperresult.SuccessKilledResult;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @Author: zhouyh
 * @Date: 2018-02-27 9:15
 * @Description:
 */
public interface SuccessKilledDao {
    /**
     * 插入购买明细
     *
     * @param seckillId
     * @param userPhone
     * @return
     */
    int insertSuccessKill(@Param("seckillId") long seckillId,@Param("userPhone") long userPhone);

    /**
     * 根据主键查询 带回Seckill
     *
     * @param seckillId
     * @param userPhone
     * @return
     */
    SuccessKilledResult queryByIdWithSeckill(@Param("seckillId") long seckillId, @Param("userPhone") long userPhone);

    List<SuccessKilledResult> query(SuccessKilledQuery successKilledQuery);

}
