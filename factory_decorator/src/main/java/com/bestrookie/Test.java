package com.bestrookie;

import com.bestrookie.design.SsoInterceptor;
import com.bestrookie.design.decorator.LoginSsoDecorator;

/**
 * @author bestrookie
 * @date 2021/11/10 11:29 上午
 */
public class Test {
    public static void main(String[] args) {
        LoginSsoDecorator loginSsoDecorator = new LoginSsoDecorator(new SsoInterceptor());
        System.out.println(loginSsoDecorator.preHandle("1successhuahua","asdas","t"));
    }
}
