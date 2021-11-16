package com.bestrookie;

import com.bestrookie.factory.ActivityFactory;
import com.bestrookie.pojo.Activity;
import com.bestrookie.pojo.Stock;
import com.bestrookie.redis.RedisUtil;

/**
 * @author bestrookie
 * @date 2021/11/16 2:34 下午
 */
public class ActivityController {
    private RedisUtil redisUtil = new RedisUtil();
    public Activity queryActivityInfo(Long id){
        Activity activity = ActivityFactory.getActivity(id);
        Stock stock = new Stock(1000, redisUtil.getStockUsed());
        activity.setStock(stock);
        return activity;
    }
}
