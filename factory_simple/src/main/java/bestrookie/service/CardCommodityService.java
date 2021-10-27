package bestrookie.service;

import bestrookie.interfaces.ICommodity;
import bestrookie.pojo.AwardReq;

/**
 * @author bestrookie
 * @date 2021/10/27 3:31 下午
 */
public class CardCommodityService implements ICommodity {
    public void send(AwardReq awardReq) {
        System.out.println("三方兑换卡片=====》"+awardReq.getType());
    }
}
