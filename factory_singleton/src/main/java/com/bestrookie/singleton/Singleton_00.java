package com.bestrookie.singleton;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * @author bestrookie
 * @description 静态类的使用
 * @date 2021/11/3 11:12 上午
 */
public class Singleton_00 {
    public static Map<String,String> cache = new ConcurrentHashMap<String, String>();
}
