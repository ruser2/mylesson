package com.seckill.mapperparam;

import java.util.Date;
import java.util.List;

/**
 * @Author: zhouyh
 * @Date: 2018-03-01 15:33
 * @Description:
 */
public class SuccessKilledQuery {
    private Long seckillId;
    private Long userPhone;
    private Integer status;
    private Date createTime;
    private List<Long> seckillIds;
    //多对一
    /**
     * 可以根据这个思路写模板   连接的时候就简单很多了
     */
    private SeckillQuery seckill;

    public Long getSeckillId() {
        return seckillId;
    }

    public void setSeckillId(Long seckillId) {
        this.seckillId = seckillId;
    }

    public Long getUserPhone() {
        return userPhone;
    }

    public void setUserPhone(Long userPhone) {
        this.userPhone = userPhone;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public List<Long> getSeckillIds() {
        return seckillIds;
    }

    public void setSeckillIds(List<Long> seckillIds) {
        this.seckillIds = seckillIds;
    }

    public SeckillQuery getSeckill() {
        return seckill;
    }

    public void setSeckill(SeckillQuery seckill) {
        this.seckill = seckill;
    }
}
