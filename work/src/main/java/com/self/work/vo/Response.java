package com.self.work.vo;

import lombok.Data;

/**
 * @Author: zhouyh
 * @Date: 2018-04-13 18:17
 * @Description:
 */
@Data
public class Response <T>{

    private Integer code;
    private String msg;
    private T data;
}
