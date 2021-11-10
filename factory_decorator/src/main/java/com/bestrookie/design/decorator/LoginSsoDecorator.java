package com.bestrookie.design.decorator;

import com.bestrookie.design.HandlerInterceptor;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * @author bestrookie
 * @date 2021/11/10 2:04 下午
 */
public class LoginSsoDecorator extends SsoDecorator{

    public LoginSsoDecorator(HandlerInterceptor handlerInterceptor) {
        super(handlerInterceptor);
    }
    private static Map<String, String>authMap = new ConcurrentHashMap<String, String>();
    static {
        authMap.put("huahua","queryUserInfo");
        authMap.put("doudou","queryUserInfo");
    }

    @Override
    public boolean preHandle(String request, String response, Object handler) {
        boolean success = super.preHandle(request, response, handler);
        if (!success){
            return false;
        }
        String userId = request.substring(8);
        String method = authMap.get(userId);
        return "queryUserInfo".equals(method);
    }
}
