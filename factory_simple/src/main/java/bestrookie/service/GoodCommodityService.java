package bestrookie.service;

import bestrookie.interfaces.ICommodity;
import bestrookie.pojo.AwardReq;

/**
 * @author bestrookie
 * @date 2021/10/27 3:34 下午
 */
public class GoodCommodityService implements ICommodity {
    public void send(AwardReq awardReq) {
        System.out.println("获得实物商品====》"+awardReq.getUserName());
    }
}
