package com.bestrookie.redis;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

/**
 * @author bestrookie
 * @date 2021/11/16 2:28 下午
 */
public class RedisUtil {
    private ScheduledExecutorService scheduledExecutorService = Executors.newScheduledThreadPool(1);
    private AtomicInteger stock = new AtomicInteger(0);
    public RedisUtil(){
        scheduledExecutorService.scheduleAtFixedRate(() -> {
            stock.addAndGet(1);
        },0,100000, TimeUnit.MICROSECONDS);
    }
    public int getStockUsed(){
        return stock.get();
    }
}
