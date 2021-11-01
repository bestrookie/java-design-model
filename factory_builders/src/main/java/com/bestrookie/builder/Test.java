package com.bestrookie.builder;

/**
 * @author bestrookie
 * @date 2021/11/1 4:42 下午
 */
public class Test {
    public static void main(String[] args) {
        Builder builder = new Builder();
        System.out.println(builder.levelOne(132.25D).getDetail());
        System.out.println(builder.levelOne(98.25D).getDetail());
        System.out.println(builder.levelOne(84.25D).getDetail());
    }
}
