package com.seckill.mapperparam;

import com.seckill.entity.Seckill;

import java.util.Date;
import java.util.List;

/**
 * @Author: zhouyh
 * @Date: 2018-02-26 18:46
 * @Description:
 */
public class SeckillQuery extends Seckill{

    private Date startTimeEnd;
    private Date endTimeEnd;
    private Date createTimeEnd;
    private Date startTimeBegin;
    private Date endTimeBegin;
    private Date createTimeBegin;
    private List<Long>seckillIds;

    private String nameLike;


    public Date getStartTimeEnd() {
        return startTimeEnd;
    }

    public void setStartTimeEnd(Date startTimeEnd) {
        this.startTimeEnd = startTimeEnd;
    }

    public Date getEndTimeEnd() {
        return endTimeEnd;
    }

    public void setEndTimeEnd(Date endTimeEnd) {
        this.endTimeEnd = endTimeEnd;
    }

    public Date getCreateTimeEnd() {
        return createTimeEnd;
    }

    public void setCreateTimeEnd(Date createTimeEnd) {
        this.createTimeEnd = createTimeEnd;
    }

    public Date getStartTimeBegin() {
        return startTimeBegin;
    }

    public void setStartTimeBegin(Date startTimeBegin) {
        this.startTimeBegin = startTimeBegin;
    }

    public Date getEndTimeBegin() {
        return endTimeBegin;
    }

    public void setEndTimeBegin(Date endTimeBegin) {
        this.endTimeBegin = endTimeBegin;
    }

    public Date getCreateTimeBegin() {
        return createTimeBegin;
    }

    public void setCreateTimeBegin(Date createTimeBegin) {
        this.createTimeBegin = createTimeBegin;
    }

    public List<Long> getSeckillIds() {
        return seckillIds;
    }

    public void setSeckillIds(List<Long> seckillIds) {
        this.seckillIds = seckillIds;
    }

    public String getNameLike() {
        return nameLike;
    }

    public void setNameLike(String nameLike) {
        this.nameLike = nameLike;
    }
}
