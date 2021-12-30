package com.bestrook.design;

import java.math.BigDecimal;

/**
 * @author bestrookie
 * @date 2021/12/28 4:27 下午
 */
public interface ICouponDiscount<T> {
    BigDecimal discountAmount(T couponInfo,BigDecimal skuPrice);
}
