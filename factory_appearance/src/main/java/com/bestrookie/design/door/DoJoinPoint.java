package com.bestrookie.design.door;


import com.alibaba.fastjson.JSON;
import com.bestrookie.design.door.annotation.DoDoor;
import com.bestrookie.design.door.config.StarterService;
import org.apache.commons.beanutils.BeanUtils;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.aspectj.lang.reflect.MethodSignature;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.lang.reflect.Method;
import java.security.Signature;

/**
 * @author bestrookie
 * @date 2021/11/15 1:49 下午
 */
@Aspect
@Component
public class DoJoinPoint {
    @Autowired
    private StarterService starterService;
    @Pointcut("@annotation(com.bestrookie.design.door.annotation.DoDoor)")
    public void aopPoint(){

    }
    @Around("aopPoint()")
    public Object doRouter(ProceedingJoinPoint jp) throws Throwable{
        //获取内容
        Method method = getMethod(jp);
        DoDoor door = method.getAnnotation(DoDoor.class);
        //获取字段值
        String keyValue = getFiledValue(door.key(), jp.getArgs());
        System.out.println("itstack door handler method："+method.getName()+"value: "+keyValue);
        if(null == keyValue || "".equals(keyValue)){
            return jp.proceed();
        }
        //配置内容
        String[] split = starterService.split(",");
        for (String str : split) {
            if (keyValue.equals(str)){
                return jp.proceed();
            }
        }
        return returnObject(door,method);

    }
    private Method getMethod(JoinPoint jp) throws NoSuchMethodException{
        Signature sig = (Signature) jp.getSignature();
        MethodSignature methodSignature = (MethodSignature) sig;
        return getClass(jp).getMethod(methodSignature.getName(),methodSignature.getParameterTypes());
    }

    private Class<? extends Object> getClass(JoinPoint jp) throws NoSuchMethodException {
        return jp.getTarget().getClass();
    }
    //返回对象
    private Object returnObject(DoDoor doGate,Method method) throws InstantiationException, IllegalAccessException {
        Class<?> returnType = method.getReturnType();
        String returnJson = doGate.returnJson();
        if ("".equals(returnJson)){
            return returnType.newInstance();
        }
        return JSON.parseObject(returnJson,returnType);
    }
    //获取属性值
    private String getFiledValue(String filed, Object[] args) {
        String filedValue = null;
        for (Object arg : args) {
            try {
                if (null == filedValue || "".equals(filedValue)) {
                    filedValue = BeanUtils.getProperty(arg, filed);
                } else {
                    break;
                }
            } catch (Exception e) {
                if (args.length == 1) {
                    return args[0].toString();
                }
            }
        }
        return filedValue;
    }
}
