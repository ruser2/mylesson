package com.seckill.exception;

/**
 * @Author: zhouyh
 * @Date: 2018-03-04 14:36
 * @Description:重复秒杀异常(运行期异常)
 */
public class RepeatKillException extends SeckillException {

    public RepeatKillException(String message, Throwable cause) {
        super(message, cause);
    }

    public RepeatKillException(String message) {
        super(message);
    }
}
