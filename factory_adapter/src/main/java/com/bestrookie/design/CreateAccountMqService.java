package com.bestrookie.design;

import com.alibaba.fastjson.JSON;
import com.bestrookie.ma.CreateAccount;

/**
 * @author bestrookie
 * @date 2021/11/4 2:45 下午
 */
public class CreateAccountMqService {
    public void onMessage(String message){
        CreateAccount ma = JSON.parseObject(message,CreateAccount.class);
        ma.getAccountDate();
        //业务逻辑
    }
}
