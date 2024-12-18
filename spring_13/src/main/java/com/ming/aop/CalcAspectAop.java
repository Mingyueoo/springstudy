package com.ming.aop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.Signature;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

import java.sql.ResultSet;
import java.util.Arrays;

@Aspect//切面，代理类
@Component//放入IOC中
public class CalcAspectAop {
    @After("execution(* com.ming.service.CalcService.*(..))")
    public void calcAfterLogging(JoinPoint joinPoint) {
        String name = joinPoint.getSignature().getName();
        System.out.println(name + "后置日志输出");

    }

    //@Before("execution(* com.ming.service.CalcService.add(..))")
    @Before("execution(* com.ming.service.CalcService.*(..))")
    public void calcParamValidator(JoinPoint joinPoint) {
        Object[] args = joinPoint.getArgs();
        for (Object arg : args) {
            if (Integer.parseInt(arg.toString()) < 0) {
                throw new RuntimeException("参数必须是正数");
            }
        }
        System.out.println("===========计算参数合理===========");
    }

    @AfterReturning(value = "execution(* com.ming.service.*.*(..))", returning = "result")
    public void calcAfterReturning(JoinPoint joinPoint, Object result) {
        System.out.println("返回通知=最后通知=最终通知=afterReturning = " + result);

    }

    @AfterThrowing(value = "execution(* com.ming.service.*.*(..))", throwing = "exception")
    public void calcExceptionHandler(JoinPoint joinPoint, Exception exception) {
        System.out.println("通过异常通知来处理方法执行过程中发生的异常问题exception = " + exception);
    }

    @Around("execution(* com.ming.service.*.*(..))")
    public Object calcAround(ProceedingJoinPoint joinPoint) {
        Object[] args = joinPoint.getArgs();
        System.out.println("环绕的入参输出：Arrays.asList(args) = " + Arrays.asList(args));

        String name = joinPoint.getSignature().getName();
        System.out.println("环绕的代理方法名称method = " + name);
        int result = -1;
        try {
            result = (int) joinPoint.proceed();
        } catch (
                Throwable throwable) {
            throwable.printStackTrace();
        }
        return result;

    }
}
