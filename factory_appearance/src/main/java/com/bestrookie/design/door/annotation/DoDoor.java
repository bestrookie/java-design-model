package com.bestrookie.design.door.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * @author bestrookie
 * @date 2021/11/15 1:42 下午
 */
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
public @interface DoDoor {
    String key() default " ";
    String returnJson() default " ";

}
