package com.zhouyh.myspringboot.annotations;

import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.Target;

import static java.lang.annotation.ElementType.PARAMETER;
import static java.lang.annotation.RetentionPolicy.RUNTIME;

/**
 * 声明方法的参数需要校验
 * @Author: zhouyh
 * @Date: 2018-03-14 17:54
 * @Description:
 */

@Target({PARAMETER})
@Retention(RUNTIME)
@Documented
public @interface ParamValid {
}
