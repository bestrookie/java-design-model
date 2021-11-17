package com.bestrookie.design.agent;


import java.lang.annotation.*;

/**
 * @author bestrookie
 * @date 2021/11/17 11:42 上午
 */
@Documented
@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.METHOD})
public @interface Select {
    String value() default " ";
}
