package com.bestrookie.service;

import com.bestrookie.redis.RedisUtils;
import com.bestrookie.redis.cluster.EGM;
import com.bestrookie.redis.cluster.IIR;

/**
 * @author bestrookie
 * @date 2021/10/28 11:32 上午
 */
public class CacheServiceImpl implements CacheService{
    private RedisUtils redisUtils = new RedisUtils();
    private EGM egm = new EGM();
    private IIR iir = new IIR();
    public String get(String key) {
        return redisUtils.get(key);
    }

    public void set(String key, String value) {
        redisUtils.set(key, value);
    }

    public void del(String key) {
        redisUtils.del(key);
    }
}
