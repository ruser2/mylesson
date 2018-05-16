package com.self.work.enums;

import lombok.Getter;

/**
 * @Author: zhouyh
 * @Date: 2018-04-13 17:33
 * @Description:
 */
@Getter
public enum ProductStatusEnum {
    UP(0,"上架"),
    DOWN(1,"下架");

    private Integer code;
    private String message;

    ProductStatusEnum(Integer code, String message) {
        this.code = code;
        this.message = message;
    }
}
