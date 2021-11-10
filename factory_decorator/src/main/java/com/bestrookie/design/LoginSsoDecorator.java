package com.bestrookie.design;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * @author bestrookie
 * @date 2021/11/10 11:12 上午
 */
public class LoginSsoDecorator extends SsoInterceptor {
    private static Map<String, String>authMap = new ConcurrentHashMap<String, String>();
    static {
        authMap.put("huahua","queryUserInfo");
        authMap.put("doudou","queryUserInfo");
    }
    @Override
    public boolean preHandle(String request, String response, Object handler) {
        String ticket = request.substring(1, 8);
        boolean success = "success".equals(ticket);
        if(!success){
            return false;
        }
        String userId = request.substring(8);
        String method = authMap.get(userId);
        return "queryUserInfo".equals(method);
    }
}
