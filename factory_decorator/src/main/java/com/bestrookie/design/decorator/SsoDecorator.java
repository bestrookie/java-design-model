package com.bestrookie.design.decorator;

import com.bestrookie.design.HandlerInterceptor;

/**
 * @author bestrookie
 * @date 2021/11/10 1:34 下午
 */
public abstract class SsoDecorator implements HandlerInterceptor {
    private HandlerInterceptor handlerInterceptor;
    private SsoDecorator(){

    }
    public SsoDecorator(HandlerInterceptor handlerInterceptor){
        this.handlerInterceptor = handlerInterceptor;
    }
    public boolean preHandle(String request, String response, Object handler){
        return handlerInterceptor.preHandle(request, response, handler);
    }

}
