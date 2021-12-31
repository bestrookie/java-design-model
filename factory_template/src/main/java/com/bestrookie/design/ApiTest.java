package com.bestrookie.design;

import com.bestrookie.design.group.JDNetMall;

import java.io.IOException;

/**
 * @author bestrookie
 * @date 2021/12/30 5:05 下午
 */
public class ApiTest {
    public static void main(String[] args) throws IOException {
        NetMall netMall = new JDNetMall("10001","******");
        String base = netMall.generateGoodsPoster("https://item.jd.com/10024794770134.html");
        System.out.println(base);
    }
}
