package com.bestrookie.service;

/**
 * @author bestrookie
 * @date 2021/11/4 2:34 下午
 */
public class OrderService {
    public long queryUserOrderCount(String userId){
        System.out.println("内部商家，查询用户的下单数量: "+userId);
        return 10L;
    }
}
