package com.bestrookie.design;

import com.bestrookie.MinibusTargetService;

import java.util.Date;

/**
 * @author bestrookie
 * @date 2021/12/7 3:22 下午
 */
public class LotteryServiceImpl extends LotteryService {
    private MinibusTargetService minibusTargetService = new MinibusTargetService();

    @Override
    protected LotteryResult doDraw(String uId) {
        //摇号
        String lottery = minibusTargetService.lottery(uId);
        //结果
        return new LotteryResult(uId,lottery,new Date());
    }
}
