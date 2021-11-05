package com.bestrookie.design;

import com.alibaba.fastjson.JSON;
import com.bestrookie.ma.OrderMq;

/**
 * @author bestrookie
 * @date 2021/11/4 3:04 下午
 */
public class OrderMqService {
    public void onMessage(String message){
        OrderMq mq = JSON.parseObject(message,OrderMq.class);
        mq.getUid();
        //业务逻辑
    }
}
