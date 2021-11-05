package com.bestrookie;

import com.bestrookie.adapter.OrderAdapterService;
import com.bestrookie.adapter.POPOrderAdapterServiceImpl;

/**
 * @author bestrookie
 * @date 2021/11/4 4:55 下午
 */
public class test {
    public static void main(String[] args) {
        OrderAdapterService popOrderAdapterService = new POPOrderAdapterServiceImpl();
        boolean first = popOrderAdapterService.isFirst("100001");
        System.out.println("判断首单"+first);
    }
}
