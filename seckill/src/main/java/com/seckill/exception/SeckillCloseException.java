package com.seckill.exception;

/**
 * @Author: zhouyh
 * @Date: 2018-03-04 14:37
 * @Description:
 */
public class SeckillCloseException extends SeckillException {

    public SeckillCloseException(String message) {
        super(message);
    }

    public SeckillCloseException(String message, Throwable cause) {
        super(message, cause);
    }
}
