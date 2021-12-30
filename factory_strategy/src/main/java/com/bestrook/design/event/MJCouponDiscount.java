package com.bestrook.design.event;

import com.bestrook.design.ICouponDiscount;

import java.math.BigDecimal;
import java.util.Map;

/**
 * @author bestrookie
 * @date 2021/12/28 4:46 下午
 */
public class MJCouponDiscount implements ICouponDiscount<Map<String, String>> {
    @Override
    public BigDecimal discountAmount(Map<String, String> couponInfo, BigDecimal skuPrice) {
        String x = couponInfo.get("x");
        String o = couponInfo.get("o");
        if (skuPrice.compareTo(new BigDecimal(x)) < 0) return skuPrice;

        BigDecimal discountAmount = skuPrice.subtract(new BigDecimal(o));
        if (discountAmount.compareTo(BigDecimal.ZERO) < 1) return BigDecimal.ONE;
        return discountAmount;
    }
}
