package com.bestrookie.adapter;


import com.bestrookie.service.POPOrderService;

/**
 * @author bestrookie
 * @date 2021/11/4 4:53 下午
 */
public class POPOrderAdapterServiceImpl implements OrderAdapterService{
    private POPOrderService popOrderService = new POPOrderService();
    public boolean isFirst(String uId) {
        return popOrderService.isFirstOrder(uId);
    }
}
