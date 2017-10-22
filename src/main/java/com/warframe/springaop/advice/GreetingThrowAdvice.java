package com.warframe.springaop.advice;

import org.springframework.aop.ThrowsAdvice;
import org.springframework.stereotype.Component;

import java.lang.reflect.Method;

/**
 * @Author warframe[github.com/WarframePrimer]
 * @Date 2017/10/22 8:39
 */
@Component
public class GreetingThrowAdvice implements ThrowsAdvice {
    public void afterThrowing(Method method, Object[] args, Object target, Exception e) {
        System.out.println("-----------Throw Exception-------------");
        System.out.println("target Class:" + target.getClass().getName());
        System.out.println("method name:" + method.getName());
        System.out.println("exception message:" + e.getMessage());
        System.out.println("------------------------");
    }

}
