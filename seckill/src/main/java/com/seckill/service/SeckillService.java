package com.seckill.service;

import com.seckill.dto.Exposer;
import com.seckill.dto.SeckillExecution;
import com.seckill.entity.Seckill;
import com.seckill.exception.RepeatKillException;
import com.seckill.exception.SeckillCloseException;
import com.seckill.exception.SeckillException;

import java.util.List;

/**
 * @Author: zhouyh
 * @Date: 2018-03-01 15:00
 * @Description: 业务接口：站在“使用者”角度设计接口
 * 三个方面:方法定义粒度,参数,返回类型(return 类型或者抛出异常)
 */
public interface SeckillService {

    /**
     * 查询所有
     *
     * @return
     */
    List<Seckill> getSeckillList();

    /**
     * 查询单个记录
     *
     * @param seckillId
     * @return
     */
    Seckill getById(long seckillId);

    /**
     * 输出秒杀接口地址;
     * 未开启时候输出系统时间和秒杀时间
     *
     * @param seckillId
     */
    Exposer exportSeckillUril(long seckillId);

    /**
     * 执行秒杀操作
     *
     * @param seckillId
     * @param userPhone
     * @param md5
     */
    SeckillExecution executeSeckill(long seckillId, long userPhone, String md5)
            throws RepeatKillException, SeckillCloseException, SeckillException;


}
