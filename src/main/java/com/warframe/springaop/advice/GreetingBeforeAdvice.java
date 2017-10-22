package com.warframe.springaop.advice;

import org.springframework.aop.MethodBeforeAdvice;
import org.springframework.stereotype.Component;

import java.lang.reflect.Method;

/**
 * @Author warframe[github.com/WarframePrimer]
 * @Date 2017/10/21 9:28
 */
@Component
public class GreetingBeforeAdvice implements MethodBeforeAdvice{


    @Override
    public void before(Method method, Object[] objects, Object o) throws Throwable {
        System.out.println("Before");
    }
}
