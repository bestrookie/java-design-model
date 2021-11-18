package com.bestrookie.design.impl;

import com.bestrookie.design.AuthService;
import com.bestrookie.pojo.AuthInfo;

import java.util.Date;

/**
 * @author bestrookie
 * @date 2021/11/18 3:29 下午
 */
public  class LevelThreeLink extends AuthLink{
    public LevelThreeLink(String levelUserId, String levelUserName) {
        super(levelUserId, levelUserName);
    }

    @Override
    public AuthInfo doAuth(String uId, String orderId, Date authDate) {
        Date date = AuthService.queryAuthInfo(levelUserId, orderId);
        if (null == date){
            return new AuthInfo("0001","单号：",orderId," 状态: 待三级负责人审批 ",levelUserName);
        }
        AuthLink next = super.next();
        if (null == next){
            return new AuthInfo("0000","单号: ",orderId," 状态：三级负责人审批完成","时间: ",f.format(date)," 审批人：",levelUserName);
        }
        return next.doAuth(uId, orderId, authDate);
    }
}
