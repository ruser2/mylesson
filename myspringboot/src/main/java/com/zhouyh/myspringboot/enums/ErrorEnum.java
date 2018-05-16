package com.zhouyh.myspringboot.enums;

/**
 * @Author: zhouyh
 * @Date: 2018-03-14 15:20
 * @Description:
 */
public enum  ErrorEnum{
    UNKONW_ERROR(-1,"未知错误"),
    PARAM_ERROR(1,"参数不匹配:"),
    SUCCESS(0,"成功");
    private Integer code;
    private String message;

    ErrorEnum(Integer code, String message) {
        this.code = code;
        this.message = message;
    }

    public Integer getCode() {
        return code;
    }

    public String getMessage() {
        return message;
    }
}
