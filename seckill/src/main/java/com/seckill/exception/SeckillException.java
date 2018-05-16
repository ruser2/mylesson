package com.seckill.exception;

/**
 * @Author: zhouyh
 * @Date: 2018-03-04 14:38
 * @Description:
 */
public class SeckillException extends RuntimeException {

    public SeckillException(String message) {
        super(message);
    }

    public SeckillException(String message, Throwable cause) {
        super(message, cause);
    }
}
