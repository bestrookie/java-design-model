package main.java.com.bestrookie;

import com.sun.org.slf4j.internal.Logger;
import com.sun.org.slf4j.internal.LoggerFactory;
import main.java.com.bestrookie.model.AwardReq;

/**
 * @author bestrookie
 * @date 2021/10/27 2:14 下午
 * @description 按照类型发放奖品 1 优惠券 2 实物奖品 3 第三方兑换
 */
public class PrizeService {
    Logger logger = LoggerFactory.getLogger(PrizeService.class);
    public String awardToUser(AwardReq req){
        logger.debug("=====开始发放奖品=====");
        if (req.getType() == 1)
    }
}
