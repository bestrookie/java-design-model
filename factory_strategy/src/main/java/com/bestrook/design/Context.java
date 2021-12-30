package com.bestrook.design;

import java.math.BigDecimal;

/**
 * @author bestrookie
 * @date 2021/12/29 9:17 上午
 */
public class Context <T>{
    private ICouponDiscount<T> couponDiscount;
    public Context(ICouponDiscount<T> couponDiscount){
        this.couponDiscount = couponDiscount;
    }

    public BigDecimal discountAmount(T couponInfo,BigDecimal skuPrice){
        return couponDiscount.discountAmount(couponInfo, skuPrice);
    }
}
