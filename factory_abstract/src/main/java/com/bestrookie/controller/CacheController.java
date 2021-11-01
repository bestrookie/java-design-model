package com.bestrookie.controller;

import com.bestrookie.adapter.EGMCacheAdapter;
import com.bestrookie.factory.JDKProxyFactory;
import com.bestrookie.service.CacheService;


/**
 * @author bestrookie
 * @date 2021/10/28 2:16 下午
 */
public class CacheController {
    public static void main(String[] args) throws InstantiationException, IllegalAccessException {
        CacheService proxy = JDKProxyFactory.getProxy(CacheService.class, EGMCacheAdapter.class);
        proxy.set("1","000000");
    }
}
