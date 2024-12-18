package com.ming.diy;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.Signature;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

@Aspect
public class AnnotationPointcut {
    @Before("execution(* com.ming.service.UserServiceImpl.*(..))")
    public void before(){
        System.out.println("方法执行前");
    }
    @After("execution(* com.ming.service.UserServiceImpl.*(..))")
    public void after(){
        System.out.println("方法执行后");

    }
    @Around("execution(* com.ming.service.UserServiceImpl.*(..))")
    public void around(ProceedingJoinPoint joinPoint) throws Throwable {
        System.out.println("环绕前");
        Signature signature = joinPoint.getSignature();
        System.out.println("signature" +signature);

        Object proceed = joinPoint.proceed();
        System.out.println("环绕后");
        System.out.println(proceed);
    }
}
