package com.warframe.springaop.advice;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

/**
 * @Author warframe[github.com/WarframePrimer]
 * @Date 2017/10/23 8:54
 */
@Aspect
@Component
public class ApologyAspect {

    @Around("execution(* com.warframe.springaop.bean.impl.ApologyImpl.*(..))")
    public Object around(ProceedingJoinPoint pjp) throws  Throwable{
        before();
        Object result = pjp.proceed();
        after();
        return result;
    }

    private void before(){
        System.out.println("Before... 2333");
    }
    private void after(){
        System.out.println("After...3334");
    }
}
