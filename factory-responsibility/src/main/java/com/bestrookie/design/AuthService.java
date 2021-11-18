package com.bestrookie.design;

import java.util.Date;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * @author bestrookie
 * @date 2021/11/18 10:22 上午
 */
public class AuthService {
    private static Map<String, Date> authMap = new ConcurrentHashMap<>();
    public static Date queryAuthInfo(String uId,String orderId){
        return authMap.get(uId.concat(orderId));
    }
    public static void auth(String uId,String orderId){
        authMap.put(uId.concat(orderId),new Date());
    }
}
