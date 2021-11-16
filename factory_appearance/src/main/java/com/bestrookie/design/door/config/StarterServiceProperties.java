package com.bestrookie.design.door.config;

import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * @author bestrookie
 * @date 2021/11/15 11:40 上午
 */
@ConfigurationProperties("itstack.door")
public class StarterServiceProperties {
    private String userStr;
    public  String getUserStr(){
        return userStr;
    }
}
