package bestrookie.service;

import bestrookie.pojo.AwardReq;

/**
 * @author bestrookie
 * @date 2021/10/27 3:11 下午
 */
public class QiYiUserService {
    public void send(AwardReq awardReq){
        System.out.println("爱奇艺兑换码====》"+awardReq.getUserName());
    }
}
