package com.bestrookie.design;

import com.alibaba.fastjson.JSON;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * @author bestrookie
 * @version 1.0
 * @date 2021/11/20 17:58
 */
public class XiaoEr {
    private Map<Integer, String> cuisineMap = new ConcurrentHashMap<>();
    public void  order(int cuisine){
        if (1 == cuisine){
            cuisineMap.put(1,"广东菜");
        }
        if (2 == cuisine){
            cuisineMap.put(2,"江苏菜");
        }
        if (3 == cuisine){
            cuisineMap.put(3,"山东菜");
        }
        if (4 == cuisine){
            cuisineMap.put(4,"川菜");
        }
    }
    public void placeOrder(){
        System.out.println("菜单: "+ JSON.toJSONString(cuisineMap));
    }
}

