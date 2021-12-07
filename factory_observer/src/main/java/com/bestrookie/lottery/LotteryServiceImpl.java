package com.bestrookie.lottery;

import com.bestrookie.MinibusTargetService;

import java.util.Date;

/**
 * @author bestrookie
 * @version 1.0
 * @date 2021/12/5 17:13
 */
public class LotteryServiceImpl implements LotteryService{
    private MinibusTargetService minibusTargetService = new MinibusTargetService();
    @Override
    public LotteryResult doDraw(String uId) {
        //摇号
        String lottery = minibusTargetService.lottery(uId);
        //发送通知短信
        System.out.println("给用户: "+uId+"发送短信"+lottery);
        //发送MQ消息
        return new LotteryResult(uId,lottery,new Date());

    }
}
