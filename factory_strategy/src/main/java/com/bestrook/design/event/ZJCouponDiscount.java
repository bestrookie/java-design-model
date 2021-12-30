package com.bestrook.design.event;

import com.bestrook.design.ICouponDiscount;

import java.math.BigDecimal;

/**
 * @author bestrookie
 * @date 2021/12/28 4:59 下午
 */
public class ZJCouponDiscount implements ICouponDiscount<Double> {
    @Override
    public BigDecimal discountAmount(Double couponInfo, BigDecimal skuPrice) {
        BigDecimal discountAmount = skuPrice.subtract(new BigDecimal(couponInfo));
        if (discountAmount.compareTo(BigDecimal.ZERO) < 1){
            return BigDecimal.ONE;
        }
        return discountAmount;
    }
}
