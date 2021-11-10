package com.bestrookie.design;

/**
 * @author bestrookie
 * @date 2021/11/10 10:59 上午
 */
public interface HandlerInterceptor {
    boolean preHandle(String request,String response,Object handler);
}
