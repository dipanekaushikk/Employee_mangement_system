package com.luv2code.springboot.thymeleafdemo.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

import java.util.logging.Logger;

@Aspect
@Component
public class DemoLoggingAspect {

    private Logger logger=Logger.getLogger(getClass().getName());


    @Pointcut("execution(* com.luv2code.springboot.thymeleafdemo.controller.*.*(..))")
    private void forControllerPackage(){};
    @Pointcut("execution(* com.luv2code.springboot.thymeleafdemo.dao.*.*(..))")
    private void forDaoPackage(){};
    @Pointcut("execution(* com.luv2code.springboot.thymeleafdemo.service.*.*(..))")
    private void forServicePackage(){};
    @Pointcut("forControllerPackage()||forServicePackage()||forDaoPackage()")
    private void forAppFlow(){};
    @Before("forAppFlow()")
    public void before(JoinPoint joinPoint){
        String method=joinPoint.getSignature().toShortString();
        logger.info("=====>>in @Before calling method:"+method);

        Object[] agrs=joinPoint.getArgs();
        for (Object tempArg:agrs){
            logger.info("=====>>>> agrument: "+tempArg);
        }
    }

}