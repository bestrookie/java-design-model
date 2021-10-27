package bestrookie.service;

import bestrookie.pojo.AwardReq;

/**
 * @author bestrookie
 * @date 2021/10/27 3:09 下午
 */
public class GoodService {
    public void send(AwardReq awardReq){
        System.out.println("发送实体商品===》"+awardReq.getUserName());
    }
}
