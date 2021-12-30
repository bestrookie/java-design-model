package com.bestrook.design.event;

import com.bestrook.design.ICouponDiscount;

import java.math.BigDecimal;

/**
 * @author bestrookie
 * @date 2021/12/28 5:46 下午
 */
public class NYGCouponDiscount implements ICouponDiscount<Double> {
    @Override
    public BigDecimal discountAmount(Double couponInfo, BigDecimal skuPrice) {
        return new BigDecimal(couponInfo);
    }
}
