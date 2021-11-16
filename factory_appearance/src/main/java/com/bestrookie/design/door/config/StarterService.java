package com.bestrookie.design.door.config;

import org.springframework.util.StringUtils;

import java.util.Stack;

/**
 * @author bestrookie
 * @date 2021/11/15 11:31 上午
 */
public class StarterService {
    private String userStr;
    public StarterService(String userStr){
        this.userStr = userStr;
    }
    public String[] split(String separatorChar){
        return StringUtils.split(this.userStr,separatorChar);
    }
}
