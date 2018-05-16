package com.seckill.dto;

/**
 * 暴露秒杀地址DTO
 * @Author: zhouyh
 * @Date: 2018-03-04 14:29
 * @Description:
 */
public class Exposer {
    //是否开启秒杀
    private boolean exposed;
    //加密措施
    private String md5;
    //id
    private Long seckillId;
    //当前时间
    private long now;
    //开启时间
    private long start;
    //结束时间
    private long end;

    public boolean isExposed() {
        return exposed;
    }

    public String getMd5() {
        return md5;
    }

    public Long getSeckillId() {
        return seckillId;
    }

    public long getNow() {
        return now;
    }

    public long getStart() {
        return start;
    }

    public long getEnd() {
        return end;
    }

    public Exposer(boolean exposed, String md5, Long seckillId) {
        this.exposed = exposed;
        this.md5 = md5;
        this.seckillId = seckillId;
    }

    public Exposer(boolean exposed, Long seckillId, long now, long start, long end) {
        this.exposed = exposed;
        this.seckillId = seckillId;
        this.now = now;
        this.start = start;
        this.end = end;
    }

    public Exposer(boolean exposed, Long seckillId) {
        this.exposed = exposed;
        this.seckillId = seckillId;
    }

    @Override
    public String toString() {
        return "Exposer{" +
                "exposed=" + exposed +
                ", md5='" + md5 + '\'' +
                ", seckillId=" + seckillId +
                ", now=" + now +
                ", start=" + start +
                ", end=" + end +
                '}';
    }
}
