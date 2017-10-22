package com.warframe.springaop.advice;


import org.springframework.aop.AfterReturningAdvice;
import org.springframework.aop.MethodBeforeAdvice;
import org.springframework.stereotype.Component;

import java.lang.reflect.Method;

/**
 * @Author warframe[github.com/WarframePrimer]
 * @Date 2017/10/22 9:12
 */
@Component
public class GreetingAroundAdvice implements MethodBeforeAdvice,AfterReturningAdvice {
    @Override
    public void afterReturning(Object o, Method method, Object[] objects, Object o1) throws Throwable {
        System.out.println("After");
    }

    @Override
    public void before(Method method, Object[] objects, Object o) throws Throwable {
        System.out.println("before");
    }
}
