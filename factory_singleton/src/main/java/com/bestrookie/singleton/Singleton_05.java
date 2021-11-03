package com.bestrookie.singleton;


/**
 * @author bestrookie
 * @description 双重锁模式
 * @date 2021/11/3 1:36 下午
 */
public class Singleton_05 {
    private static Singleton_05 instance;
    private Singleton_05(){

    }
    public static Singleton_05 getInstance(){
        if (instance != null){
            return instance;
        }
        synchronized (Singleton_05.class){
            if (instance == null){
                instance = new Singleton_05();
            }
        }
        return instance;
    }
}
