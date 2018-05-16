package com.zhouyh.myspringboot.response;

import com.zhouyh.myspringboot.enums.ErrorEnum;

/**
 * @Author: zhouyh
 * @Date: 2018-03-14 14:44
 * @Description:
 */
public class Response<T> {
    private Integer code;
    private String message;
    private T data;
//    private int encryptType;

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }
}
