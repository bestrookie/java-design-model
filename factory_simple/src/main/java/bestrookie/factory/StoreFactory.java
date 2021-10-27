package bestrookie.factory;

import bestrookie.interfaces.ICommodity;
import bestrookie.pojo.AwardReq;
import bestrookie.service.CardCommodityService;
import bestrookie.service.CouponCommodityService;
import bestrookie.service.GoodCommodityService;

/**
 * @author bestrookie
 * @date 2021/10/27 3:35 下午
 */
public class StoreFactory {
    public ICommodity getCommodityService(AwardReq awardReq) {
        if (awardReq.getType() == 1){
            return new CouponCommodityService();
        }
        if (awardReq.getType() == 2){
            return new GoodCommodityService();
        }
        if (awardReq.getType() == 3){
            return new CardCommodityService();
        }
        throw new RuntimeException("不存在服务类型");
    }
    public ICommodity getCommodityService(Class<?extends ICommodity> clazz) throws InstantiationException, IllegalAccessException {
        if (clazz ==null){
            return null;
        }
        return clazz.newInstance();
    }
}
