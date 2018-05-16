package com.seckill.dao;

import com.seckill.entity.Seckill;
import com.seckill.entity.SysUser;
import org.apache.ibatis.annotations.Param;

import java.util.Date;
import java.util.List;

/**
 * @Author: zhouyh
 * @Date: 2018-02-27 9:13
 * @Description:
 */
public interface SeckillDao {
    /**
     * 库存-
     * @param seckillId
     * @param killTime
     * @return 更新的记录数;0.没成功
     */
    int reduceNumber(@Param("seckillId") long seckillId, @Param("killTime") Date killTime);


    /**
     * 使用存储过程查询用户信息
     *
     * @param user
     * @return
     */
    void selectUserById(SysUser user);
    /**
     * get
     * @param seckillId
     * @return
     */
    Seckill queryById(long seckillId);

    /**
     * 分页查询
     * @param offset
     * @param limit
     * @return
     */
    /**
     *  java没有保存形参,queryAll(int offset, int limit)-->queryAll(arg0,arg1)
     *  使用@Param("**")来指定参数名称
     */
    List<Seckill> queryAll(@Param("offset")int offset, @Param("limit")int limit);

}
