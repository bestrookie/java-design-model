package com.bestrookie.design.agent;

import org.springframework.beans.factory.FactoryBean;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

/**
 * @author bestrookie
 * @date 2021/11/17 2:35 下午
 */
public class MapperFactoryBean <T> implements FactoryBean<T> {
    private Class<T> mapperInterface;
    public MapperFactoryBean(Class<T> mapperInterface){
        this.mapperInterface = mapperInterface;
    }
    @Override
    public T getObject() throws Exception {
        InvocationHandler handler = (poxy,method,args)->{
            Select select = method.getAnnotation(Select.class);
            System.out.println("SQL:"+select.value().replace("#userId", args[0].toString()));
            return args[0] + ",我真的好菜啊";
        };
        return (T) Proxy.newProxyInstance(this.getClass().getClassLoader(), new Class[]{mapperInterface},handler);
    }

    @Override
    public Class<?> getObjectType() {
        return mapperInterface;
    }

    @Override
    public boolean isSingleton() {
        return true;
    }
}
