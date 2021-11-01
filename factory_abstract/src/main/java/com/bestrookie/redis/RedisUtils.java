package com.bestrookie.redis;


import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * @author bestrookie
 * @date 2021/10/28 11:04 上午
 */
public class RedisUtils {
    private Map<String,String> dataMap = new ConcurrentHashMap<String, String>();
    public String get(String key){
        System.out.println("redis获取数据 key: "+key);
        return dataMap.get(key);
    }
    public void set(String key,String value){
        System.out.println("redis写入数据 key: "+key+" val: "+value);
        dataMap.put(key,value);
    }
    public void del(String key){
        System.out.println("redis删除数据 val: "+key);
        dataMap.remove(key);
    }
}
