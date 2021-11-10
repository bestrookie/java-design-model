package com.bestrookie.design;

/**
 * @author bestrookie
 * @date 2021/11/10 11:09 上午
 */
public class SsoInterceptor implements HandlerInterceptor{
    public boolean preHandle(String request, String response, Object handler) {
        String ticket = request.substring(1, 8);
        return "success".equals(ticket);
    }
}
