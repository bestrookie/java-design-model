package bestrookie.service;

import bestrookie.interfaces.ICommodity;
import bestrookie.pojo.AwardReq;

/**
 * @author bestrookie
 * @date 2021/10/27 3:32 下午
 */
public class CouponCommodityService implements ICommodity {
    public void send(AwardReq awardReq) {
        System.out.println("获得优惠券=====>"+awardReq.getUserName());
    }
}
