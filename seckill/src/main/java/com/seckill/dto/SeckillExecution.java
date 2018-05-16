package com.seckill.dto;

import com.seckill.enums.SeckillStatEnum;
import com.seckill.mapperresult.SuccessKilledResult;

/**
 * @Author: zhouyh
 * @Date: 2018-03-04 14:34
 * @Description:秒杀执行结果
 */
public class SeckillExecution {
    private Long seckillId;
    //
    private int state;
    //状态标识
    private String stateInfo;

    private SuccessKilledResult successKilled;

    public SeckillExecution(Long seckillId, SeckillStatEnum seckillStatEnum) {
        this.seckillId = seckillId;
        this.state = seckillStatEnum.getState();
        this.stateInfo = seckillStatEnum.getStateInfo();
    }

    public SeckillExecution(Long seckillId, SeckillStatEnum seckillStatEnum, SuccessKilledResult successKilled) {
        this.seckillId = seckillId;
        this.state = seckillStatEnum.getState();
        this.stateInfo = seckillStatEnum.getStateInfo();
        this.successKilled = successKilled;
    }

    @Override
    public String toString() {
        return "SeckillExecution{" +
                "seckillId=" + seckillId +
                ", state=" + state +
                ", stateInfo='" + stateInfo + '\'' +
                ", successKilled=" + successKilled +
                '}';
    }

    public Long getSeckillId() {
        return seckillId;
    }

    public void setSeckillId(Long seckillId) {
        this.seckillId = seckillId;
    }

    public int getState() {
        return state;
    }

    public void setState(int state) {
        this.state = state;
    }

    public String getStateInfo() {
        return stateInfo;
    }

    public void setStateInfo(String stateInfo) {
        this.stateInfo = stateInfo;
    }

    public SuccessKilledResult getSuccessKilled() {
        return successKilled;
    }

    public void setSuccessKilled(SuccessKilledResult successKilled) {
        this.successKilled = successKilled;
    }
}
