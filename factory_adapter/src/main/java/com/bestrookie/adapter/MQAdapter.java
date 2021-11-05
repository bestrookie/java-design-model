package com.bestrookie.adapter;

import com.alibaba.fastjson.JSON;

import java.lang.reflect.InvocationTargetException;
import java.util.Map;

/**
 * @author bestrookie
 * @date 2021/11/4 3:48 下午
 */
public class MQAdapter {
    public static RebateInfo filter(String strJson, Map<String,String> link) throws InvocationTargetException, NoSuchMethodException, IllegalAccessException {
        return filter(JSON.parseObject(strJson,Map.class),link);
    }
     public static RebateInfo filter(Map obj,Map<String, String> link) throws NoSuchMethodException, InvocationTargetException, IllegalAccessException {
        RebateInfo rebateInfo = new RebateInfo();
         for (String key : link.keySet()) {
             Object value = obj.get(link.get(key));
             RebateInfo.class.getMethod("set"+key.substring(0,1).toUpperCase()+key.substring(1),String.class).invoke(rebateInfo,value.toString());
         }
         return rebateInfo;
     }
}
