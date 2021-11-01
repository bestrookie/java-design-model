package com.bestrookie.service;

/**
 * @author bestrookie
 * @date 2021/10/28 11:29 上午
 */
public interface CacheService {
    String get(String key);
    void set(String key,String value);
    void del(String key);
}
