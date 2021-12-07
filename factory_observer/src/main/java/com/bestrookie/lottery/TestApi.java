package com.bestrookie.lottery;

import com.alibaba.fastjson.JSON;
import com.bestrookie.design.LotteryResult;
import com.bestrookie.design.LotteryService;
import com.bestrookie.design.LotteryServiceImpl;

/**
 * @author bestrookie
 * @version 1.0
 * @date 2021/12/5 17:18
 */
public class TestApi {
    public static void main(String[] args) {
        LotteryService lotteryService = new LotteryServiceImpl();
        LotteryResult re = lotteryService.draw("23212");
        System.out.println("result: "+JSON.toJSONString(re));
    }
}
