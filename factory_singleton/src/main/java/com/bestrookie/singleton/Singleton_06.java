package com.bestrookie.singleton;

import java.util.concurrent.atomic.AtomicReference;

/**
 * @author bestrookie
 * @description CAS
 * @date 2021/11/3 1:42 下午
 */
public class Singleton_06 {
    private static final AtomicReference<Singleton_06> INSTANCE = new AtomicReference<Singleton_06>();
    private static Singleton_06 instance;
    private Singleton_06(){

    }
    public static final Singleton_06 getInstance(){
        for (;;){
            Singleton_06 instance = INSTANCE.get();
            if (null != instance){
                return instance;
            }
            INSTANCE.compareAndSet(null, new Singleton_06());
            return INSTANCE.get();
        }
    }
}
