package com.bestrookie.lottery;

import com.alibaba.fastjson.JSON;

/**
 * @author bestrookie
 * @version 1.0
 * @date 2021/12/5 17:18
 */
public class TestApi {
    public static void main(String[] args) {
        LotteryService lotteryService = new LotteryServiceImpl();
        LotteryResult lotteryResult = lotteryService.doDraw("4444444");
        System.out.println(JSON.toJSONString(lotteryResult));
    }
}
