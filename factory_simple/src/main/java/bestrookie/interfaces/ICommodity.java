package bestrookie.interfaces;

import bestrookie.pojo.AwardReq;

/**
 * @author bestrookie
 * @date 2021/10/27 3:26 下午
 */
public interface ICommodity {
    /**
     * 兑换奖品
     * @param awardReq 参数
     */
    void send(AwardReq awardReq);
}
