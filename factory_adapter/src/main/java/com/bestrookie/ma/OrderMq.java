package com.bestrookie.ma;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

/**
 * @author bestrookie
 * @date 2021/11/4 2:10 下午
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class OrderMq {
    /**
     * 用户id
     */
    private String uid;
    /**
     * 商品编号
     */
    private String sku;
    /**
     * 订单id
     */
    private String orderId;
    /**
     * 下单时间
     */
    private Date createOrderTime;
}
