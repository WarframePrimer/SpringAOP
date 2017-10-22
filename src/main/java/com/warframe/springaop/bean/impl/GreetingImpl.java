package com.warframe.springaop.bean.impl;

import com.warframe.springaop.bean.Greeting;
import org.springframework.stereotype.Component;

/**
 * @Author warframe[github.com/WarframePrimer]
 * @Date 2017/10/21 9:24
 */
@Component("greetingImpl")
public class GreetingImpl implements Greeting {


    @Override
    public void sayHello(String name) {
        System.out.println("hello " + name);
//        throw new RuntimeException("throw a exception");
    }

    public void goodMorning(String name) {
        System.out.println("Good Morning " + name);
    }
    public void goodNight(String name) {
        System.out.println("Good Night " + name);
    }
}
