package com.zhouyh.myspringboot.exception;

import com.zhouyh.myspringboot.enums.ErrorEnum;

/**
 * @Author: zhouyh
 * @Date: 2018-03-14 15:12
 * @Description:
 */
public class ServiceException extends RuntimeException {
    private Integer code;

    public ServiceException(ErrorEnum errorEnum) {
        super(errorEnum.getMessage());
        this.code = errorEnum.getCode();
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }
}
