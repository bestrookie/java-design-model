package bestrookie.controller;

import bestrookie.pojo.AwardReq;
import bestrookie.service.CouponService;
import bestrookie.service.GoodService;
import bestrookie.service.QiYiUserService;

/**
 * @author bestrookie
 * @date 2021/10/27 3:13 下午
 */
public class PrizeController {
    public static void main(String[] args) {
        AwardReq awardReq = new AwardReq(1,"bestrookie",1);
        if (awardReq.getType() == 1){
            CouponService couponService = new CouponService();
            couponService.send(awardReq);
        }else if (awardReq.getType() == 2){
            GoodService goodService = new GoodService();
            goodService.send(awardReq);
        }else if (awardReq.getType() == 3){
            QiYiUserService qiYiUserService = new QiYiUserService();
            qiYiUserService.send(awardReq);
        }
        System.out.println("========发放完成=========");
    }
}
