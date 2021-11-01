package com.bestrookie.adapter;

/**
 * @author bestrookie
 * @date 2021/10/28 2:35 下午
 */
public interface ICacheAdapter {
    void set(String key ,String value);
    String get(String key);
    void del(String key);
}
