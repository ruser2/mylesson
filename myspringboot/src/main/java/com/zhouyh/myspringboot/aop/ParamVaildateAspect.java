package com.zhouyh.myspringboot.aop;

import com.zhouyh.myspringboot.response.Response;
import com.zhouyh.myspringboot.validator.ParamValidator;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

/**
 * @Author: zhouyh
 * @Date: 2018-03-13 17:31
 * @Description:
 */
@Component
@Aspect
public class ParamVaildateAspect {
    public final Logger logger = LoggerFactory.getLogger(getClass());

    @Pointcut("@annotation(com.zhouyh.myspringboot.annotations.ParamValid)")
    public void valid() {

    }

    @Around("valid()")
    public Object doAround(ProceedingJoinPoint proceedingJoinPoint) throws Throwable {
        Response validResp = ParamValidator.validate(proceedingJoinPoint.getArgs());

//        proceedingJoinPoint.getSignature().getDeclaringType().getMethod().getAnnotation();

        if (null != validResp) {
            return validResp;
        }
        Object result = proceedingJoinPoint.proceed();
        return result;
    }

}
