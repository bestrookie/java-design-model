package com.bestrookie.singleton;

/**
 * @author bestrookie
 * @description 懒汉式（线程不安全）
 * @date 2021/11/3 11:16 上午
 */
public class Singleton_01 {
    private static Singleton_01 instance;
    private Singleton_01(){

    }
    public Singleton_01 getInstance(){
        if (instance != null){
            return instance;
        }else {
            instance = new Singleton_01();
            return instance;
        }
    }

}
