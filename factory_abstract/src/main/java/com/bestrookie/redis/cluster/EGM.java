package com.bestrookie.redis.cluster;


import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * @author bestrookie
 * @date 2021/10/28 11:15 上午
 */
public class EGM {
    private Map<String, String> dataMap = new ConcurrentHashMap<String, String>();
    public String gain(String key){
        System.out.println("EGM获取数据 key:"+key);
        return dataMap.get(key);
    }
    public void set(String key, String value){
        System.out.println("EGM写入数据 key: "+ key +" val: "+ value);
        dataMap.put(key, value);
    }
    public void delete(String key){
        System.out.println("EGM删除数据 key:"+key);
        dataMap.remove(key);
    }

}
