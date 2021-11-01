package com.bestrookie.adapter;

import com.bestrookie.redis.cluster.IIR;

/**
 * @author bestrookie
 * @date 2021/10/28 2:38 下午
 */
public class IIRCacheAdapter implements ICacheAdapter{
    private IIR iir = new IIR();

    public void set(String key, String value) {
        iir.setData(key, value);
    }

    public String get(String key) {
        return iir.getData(key);
    }

    public void del(String key) {
        del(key);
    }
}
