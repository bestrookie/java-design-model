package com.bestrook.design;

import com.bestrook.design.event.MJCouponDiscount;

import java.math.BigDecimal;
import java.util.HashMap;
import java.util.Map;

/**
 * @author bestrookie
 * @date 2021/12/29 9:21 上午
 */
public class TestApi {
    public static void main(String[] args) {
        //满减优惠
        Context<Map<String, String>> mJContext = new Context<>(new MJCouponDiscount());
        Map<String, String> mapReq = new HashMap<>();
        mapReq.put("x","100");
        mapReq.put("o","10");
        System.out.println("减慢优惠:"+mJContext.discountAmount(mapReq,new BigDecimal(100)));

    }
}
