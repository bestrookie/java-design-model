package com.bestrookie.singleton;

/**
 * @author bestrookie
 * @description 内部类（线程安全）
 * @date 2021/11/3 11:44 上午
 */
public class Singleton_04 {
    private static class SingletonHolder{
        private static Singleton_04 instance = new Singleton_04();
    }

    private Singleton_04(){

    }
    public Singleton_04 getInstance(){
        return SingletonHolder.instance;
    }
}
