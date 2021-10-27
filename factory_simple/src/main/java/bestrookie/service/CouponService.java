package bestrookie.service;

import bestrookie.pojo.AwardReq;

/**
 * @author bestrookie
 * @date 2021/10/27 3:07 下午
 */
public class CouponService {
    public void send(AwardReq awardReq){
        System.out.println("发放优惠券====》"+awardReq.getUserName());
    }
}
