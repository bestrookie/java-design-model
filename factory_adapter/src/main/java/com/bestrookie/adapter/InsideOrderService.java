package com.bestrookie.adapter;

import com.bestrookie.service.OrderService;

/**
 * @author bestrookie
 * @date 2021/11/4 4:51 下午
 */
public class InsideOrderService implements OrderAdapterService{
    private OrderService orderService;
    public boolean isFirst(String uId) {
        return orderService.queryUserOrderCount(uId) >= 1;
    }
}
