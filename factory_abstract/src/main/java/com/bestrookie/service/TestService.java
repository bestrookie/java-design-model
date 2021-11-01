package com.bestrookie.service;

/**
 * @author bestrookie
 * @date 2021/10/28 5:20 下午
 */
public interface TestService {
    String get(String key);
    void set(String key,String value);
    void del(String key);
}
