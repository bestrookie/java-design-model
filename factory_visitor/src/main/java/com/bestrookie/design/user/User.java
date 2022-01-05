package com.bestrookie.design.user;

import com.bestrookie.design.visitor.Visitor;
import lombok.AllArgsConstructor;
import lombok.Data;

/**
 * @author bestrookie
 * @date 2022/1/4 2:03 下午
 */
@AllArgsConstructor
public abstract class User {
    public String name;
    public String identity;
    public String clazz;
    public abstract void accept(Visitor visitor);
}
