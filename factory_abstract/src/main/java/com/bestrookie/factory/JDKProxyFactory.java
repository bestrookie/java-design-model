package com.bestrookie.factory;
import com.bestrookie.adapter.ICacheAdapter;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

/**
 * @author bestrookie
 * @date 2021/10/28 3:04 下午
 */
public class JDKProxyFactory {
    public static <T> T getProxy(Class cacheClazz, Class<? extends ICacheAdapter> cacheAdapter) throws InstantiationException, IllegalAccessException {
        InvocationHandler handler = new JDKInvocationHandler(cacheAdapter.newInstance());
        ClassLoader classLoader = Thread.currentThread().getContextClassLoader();
        return (T)Proxy.newProxyInstance(classLoader,new Class[]{cacheClazz},handler);
    }
}
