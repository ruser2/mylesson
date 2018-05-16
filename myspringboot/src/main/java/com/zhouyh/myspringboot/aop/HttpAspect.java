package com.zhouyh.myspringboot.aop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import javax.servlet.http.HttpServletRequest;

/**
 * @Author: zhouyh
 * @Date: 2018-03-13 17:31
 * @Description:
 */
@Component
@Aspect
public class HttpAspect {
    public final Logger logger = LoggerFactory.getLogger(getClass());

    @Pointcut("execution(public * com.zhouyh.myspringboot.controller.*.*(..))")
    public void log() {
    }

    @Before("log()")
    public void doBefore(JoinPoint joinpoint) {
        ServletRequestAttributes attributes = (ServletRequestAttributes) RequestContextHolder.getRequestAttributes();
        HttpServletRequest request = attributes.getRequest();
        logger.info("url={}", request.getRequestURL());
        logger.info("ip={}", request.getRemoteAddr());
        logger.info("method={}", request.getMethod());
        logger.info("classMethdo={}", joinpoint.getSignature().getDeclaringTypeName() + "." + joinpoint.getSignature().getName());
        logger.info("args={}", joinpoint.getArgs());
    }

    @After("log()")
    public void doAfter() {

    }

    @Around("log()")
    public Object doAround(ProceedingJoinPoint proceedingJoinPoint) throws Throwable {

        Object result = proceedingJoinPoint.proceed();

        return result;
    }

    @AfterReturning(value = "log()", returning = "result")
    public void doAfterReturning(Object result) {
        logger.info("response={}",result);
    }

    @AfterThrowing(value = "log()", throwing = "e")
    public void doAfterThrowing(Exception e) {
    }
}
