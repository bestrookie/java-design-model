package com.bestrookie.design;

import com.bestrookie.design.event.EventManager;
import com.bestrookie.design.event.EventType;
import com.bestrookie.design.event.listener.MQEventListener;
import com.bestrookie.design.event.listener.MessageEventListener;

/**
 * @author bestrookie
 * @date 2021/12/7 3:24 下午
 */
public abstract class LotteryService {
    private EventManager eventManager;
    public LotteryService(){
        eventManager = new EventManager(EventType.MQ,EventType.Message);
        eventManager.subscribe(EventType.MQ,new MQEventListener());
        eventManager.subscribe(EventType.Message,new MessageEventListener());
    }
    public LotteryResult draw(String id){
        LotteryResult lotteryResult = doDraw(id);
        eventManager.notify(EventType.MQ,lotteryResult);
        eventManager.notify(EventType.Message,lotteryResult);
        return lotteryResult;
    }
    protected abstract LotteryResult doDraw(String uId);
}
