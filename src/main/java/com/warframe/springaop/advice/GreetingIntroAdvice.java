package com.warframe.springaop.advice;

import com.warframe.springaop.bean.Apology;
import org.aopalliance.intercept.MethodInvocation;
import org.springframework.aop.support.DelegatingIntroductionInterceptor;
import org.springframework.stereotype.Component;

/**
 * @Author warframe[github.com/WarframePrimer]
 * @Date 2017/10/22 8:48
 */
@Component
public class GreetingIntroAdvice extends DelegatingIntroductionInterceptor implements Apology{
    @Override
    public Object invoke(MethodInvocation mi) throws Throwable {
        return super.invoke(mi);
    }

    @Override
    public void saySorry(String name) {
        System.out.println("sorry " + name);
    }
}
