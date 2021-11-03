package com.bestrookie.singleton;

/**
 * @author bestrookie
 * @description 饿汉式（线程安全）
 * @date 2021/11/3 11:35 上午
 */
public class Singleton_03 {
    private static Singleton_03 instance = new Singleton_03();
    private Singleton_03(){

    }
    public static Singleton_03 getInstance(){
        return instance;
    }
}
