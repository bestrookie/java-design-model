package com.bestrookie.design.event.listener;

import com.bestrookie.design.LotteryResult;

/**
 * @author bestrookie
 * @date 2021/12/7 2:25 下午
 */
public class MQEventListener implements EventListener{
    @Override
    public void doEvent(LotteryResult result) {
        System.out.println("MQ: 记录用户："+result.getUId()+" 摇号结果: "+result.getMsg());
    }
}
