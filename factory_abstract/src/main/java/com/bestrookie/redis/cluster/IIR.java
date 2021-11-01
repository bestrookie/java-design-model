package com.bestrookie.redis.cluster;


import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * @author bestrookie
 * @date 2021/10/28 11:22 上午
 */
public class IIR {
    private Map<String, String> dataMap = new ConcurrentHashMap<String, String>();
    public String getData(String key){
        System.out.println("IIR获取数据 key: "+key);
        return dataMap.get(key);
    }
    public void setData(String key,String value){
        System.out.println("IIR写入数据 key: "+key +" val:"+ value);
        dataMap.put(key, value);
    }
    public void delData(String key){
        System.out.println("IIR删除数据 key: "+key);
        dataMap.remove(key);
    }
}
