package com.warframe.springaop.advice;

import com.warframe.springaop.bean.Apology;
import com.warframe.springaop.bean.impl.ApologyImpl;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.DeclareParents;
import org.springframework.stereotype.Component;

/**
 * @Author warframe[github.com/WarframePrimer]
 * @Date 2017/10/22 9:42
 */

@Aspect
@Component
public class GreetingAspect {

    /**
     * Spring+AspectJ IntroductionAdvice(引入增强)
     */
    @DeclareParents(value = "com.warframe.springaop.bean.impl.GreetingImpl",defaultImpl = ApologyImpl.class)
    private Apology apology;


    /**
     * 方法中的参数ProceedingJoinPoint称为连接点，可以通过该对象获取方法的任何信息
     * @param pjp
     * @return
     * @throws Throwable
     */
    @Around("execution(* com.warframe.springaop.bean.impl.GreetingImpl.*(..))")
    public Object around(ProceedingJoinPoint pjp) throws  Throwable{
        before();
        Object result = pjp.proceed();
        after();
        return result;
    }

    private void before(){
        System.out.println("Before...");
    }
    private void after(){
        System.out.println("After...");
    }

}
