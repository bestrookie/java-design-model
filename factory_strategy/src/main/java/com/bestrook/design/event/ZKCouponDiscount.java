package com.bestrook.design.event;

import com.bestrook.design.ICouponDiscount;

import java.math.BigDecimal;

/**
 * @author bestrookie
 * @date 2021/12/28 5:38 下午
 */
public class ZKCouponDiscount implements ICouponDiscount<Double> {
    @Override
    public BigDecimal discountAmount(Double couponInfo, BigDecimal skuPrice) {
        BigDecimal discountAmount = skuPrice.multiply(new BigDecimal(couponInfo)).setScale(2,BigDecimal.ROUND_HALF_UP);
        if (discountAmount.compareTo(BigDecimal.ZERO) < 1){
            return BigDecimal.ONE;
        }
        return discountAmount;
    }
}
