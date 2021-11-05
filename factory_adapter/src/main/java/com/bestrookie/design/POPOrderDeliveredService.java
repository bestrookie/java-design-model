package com.bestrookie.design;

import com.alibaba.fastjson.JSON;
import com.bestrookie.ma.POPOrderDelivered;

/**
 * @author bestrookie
 * @date 2021/11/4 3:12 下午
 */
public class POPOrderDeliveredService {
    public void onMessage(String message){
        POPOrderDelivered mq = JSON.parseObject(message,POPOrderDelivered.class);
        mq.getOrderId();
        //业务逻辑
    }
}
