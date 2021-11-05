package com.bestrookie.ma;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.util.Date;

/**
 * @author bestrookie
 * @date 2021/11/4 2:14 下午
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class POPOrderDelivered {
    /**
     * 用户id
     */
    private String uId;
    /**
     * 订单号
     */
    private String orderId;
    /**
     * 订单时间
     */
    private Date orderTime;
    /**
     * 商品编号
     */
    private String sku;
    /**
     * 商品名称
     */
    private String skuName;
    /**
     * 商品金额
     */
    private BigDecimal decimal;
}
