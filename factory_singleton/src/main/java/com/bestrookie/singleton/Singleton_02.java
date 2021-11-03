package com.bestrookie.singleton;

/**
 * @author bestrookie
 * @description 懒汉模式（线程安全）
 * @date 2021/11/3 11:24 上午
 */
public class Singleton_02 {
    private static Singleton_02 instance;
    private Singleton_02(){

    }
    public static synchronized Singleton_02 getInstance(){
        if (instance == null) {
            instance = new Singleton_02();
        }
        return instance;
    }
}
