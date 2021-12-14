package com.bestrookie.design.event;

import com.bestrookie.design.LotteryResult;
import com.bestrookie.design.event.listener.EventListener;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author bestrookie
 * @date 2021/12/7 2:37 下午
 */
public class EventManager {
    Map<Enum<EventType>, List<EventListener>> listeners = new HashMap<>();
    @SafeVarargs
    public EventManager(Enum<EventType>... operations){
        for (Enum<EventType> operation : operations) {
            this.listeners.put(operation,new ArrayList<>());
        }
    }

    /**
     * 订阅
     * @param eventType 事件类型
     * @param listener 监听
     */
    public void subscribe(Enum<EventType> eventType,EventListener listener){
        List<EventListener> users = listeners.get(eventType);
        users.add(listener);
    }

    /**
     * 取消订阅
     * @param eventType 事件类型
     * @param listener 监听
     */
    public void unsubscribe(Enum<EventType> eventType,EventListener listener){
        List<EventListener> users = listeners.get(eventType);
        users.remove(listener);
    }

    public void notify(Enum<EventType> eventType, LotteryResult result){
        List<EventListener> users = listeners.get(eventType);
        for (EventListener user : users){
            user.doEvent(result);
        }

    }
}
