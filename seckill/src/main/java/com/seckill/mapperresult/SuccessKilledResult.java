package com.seckill.mapperresult;

import com.seckill.entity.Seckill;
import com.seckill.utils.JsonUtil;

import java.util.Date;

/**
 * @Author: zhouyh
 * @Date: 2018-03-01 15:33
 * @Description:
 */
public class SuccessKilledResult {
    private Long seckillId;
    private Long userPhone;
    private Integer status;
    private Date createTime;


    private Seckill seckill;

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

    public Seckill getSeckill() {
        return seckill;
    }

    public void setSeckill(Seckill seckill) {
        this.seckill = seckill;
    }

    @Override
    public String toString() {
        return JsonUtil.getShowJson(this);
    }
}
