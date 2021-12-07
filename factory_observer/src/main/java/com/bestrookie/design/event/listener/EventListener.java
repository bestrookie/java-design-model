package com.bestrookie.design.event.listener;

import com.bestrookie.design.LotteryResult;

/**
 * @author bestrookie
 * @date 2021/12/7 2:18 下午
 */
public interface EventListener {
    void doEvent(LotteryResult result);
}
