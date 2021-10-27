package bestrookie.controller;

import bestrookie.factory.StoreFactory;
import bestrookie.interfaces.ICommodity;
import bestrookie.pojo.AwardReq;

/**
 * @author bestrookie
 * @date 2021/10/27 3:43 下午
 */
public class StoreFactoryController {
    public static void main(String[] args) {
        AwardReq awardReq = new AwardReq(1,"bestrookie",2);
        StoreFactory storeFactory = new StoreFactory();
        ICommodity commodityService = storeFactory.getCommodityService(awardReq);
        commodityService.send(awardReq) ;
    }
}
