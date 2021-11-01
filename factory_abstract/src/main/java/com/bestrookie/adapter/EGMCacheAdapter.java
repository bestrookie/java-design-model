package com.bestrookie.adapter;

import com.bestrookie.redis.cluster.EGM;

/**
 * @author bestrookie
 * @date 2021/10/28 2:36 下午
 */
public class EGMCacheAdapter implements ICacheAdapter{
    private EGM egm = new EGM();
    public void set(String key, String value) {
        egm.set(key, value);
    }

    public String get(String key) {
        return egm.gain(key);
    }

    public void del(String key) {
        egm.delete(key);
    }
}
