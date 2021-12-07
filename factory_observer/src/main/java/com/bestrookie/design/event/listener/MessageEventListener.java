package com.bestrookie.design.event.listener;

import com.bestrookie.design.LotteryResult;

/**
 * @author bestrookie
 * @date 2021/12/7 2:20 下午
 */
public class MessageEventListener implements EventListener{
    @Override
    public void doEvent(LotteryResult result) {
        System.out.println("Message: 给用户"+result.getUId()+"发送消息: "+result.getMsg());
    }
}
