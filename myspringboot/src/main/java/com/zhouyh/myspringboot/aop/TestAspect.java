package com.zhouyh.myspringboot.aop;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
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
public class TestAspect {
    public final Logger Logger= LoggerFactory.getLogger(getClass());
    @Pointcut("execution(public * com.zhouyh.myspringboot.controller.AopTestController.*(..))")
    public void test() {
        Logger.error("test");
    }
    @Before("test()")
    public void doBefore(){
        Logger.info("doBefore proceedingJoinPoint.proceed().执行时先执行");
    }

    @After("test()")
    public void doAfter(){
        Logger.info("doAfter around之后");
    }

    @Around("test()")
    public Object doAround(ProceedingJoinPoint proceedingJoinPoint) throws Throwable {
        Logger.info("doAround start  在before之前");
        Object result=proceedingJoinPoint.proceed();
        Logger.info("doAround end 在after之前");
        return result;
    }

    @AfterReturning(value = "test()",returning = "result")
    public void doAfterReturning(Object result){
        Logger.info("doAfterReturning 在after之后");
    }

    @AfterThrowing(value = "test()",throwing = "e")
    public void doAfterThrowing(Exception e){
        Logger.info("doAfterThrowing 抛出异常之后");
    }
}
