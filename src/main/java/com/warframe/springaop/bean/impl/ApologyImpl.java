package com.warframe.springaop.bean.impl;

import com.warframe.springaop.bean.Apology;

/**
 * @Author warframe[github.com/WarframePrimer]
 * @Date 2017/10/23 8:33
 */
public class ApologyImpl implements Apology {
    @Override
    public void saySorry(String name) {
        System.out.println("Sorry " + name);
    }
}
