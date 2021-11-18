package com.bestrookie.design.impl;

import com.bestrookie.pojo.AuthInfo;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @author bestrookie
 * @date 2021/11/18 1:57 下午
 */
public abstract class AuthLink {
    protected SimpleDateFormat f = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
    protected String levelUserId;
    protected String levelUserName;
    protected AuthLink next;
    public AuthLink (String levelUserId,String levelUserName){
        this.levelUserId = levelUserId;
        this.levelUserName = levelUserName;
    }
    public AuthLink next(){
        return next;
    }
    public AuthLink appendNext(AuthLink next){
        this.next = next;
        return this;
    }
    public abstract AuthInfo doAuth(String uId, String orderId, Date authDate);
}
