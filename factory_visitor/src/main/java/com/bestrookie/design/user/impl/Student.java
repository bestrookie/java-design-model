package com.bestrookie.design.user.impl;

import com.bestrookie.design.user.User;
import com.bestrookie.design.visitor.Visitor;

/**
 * @author bestrookie
 * @date 2022/1/4 2:26 下午
 */
public class Student extends User {
    public Student(String name, String identity, String clazz) {
        super(name, identity, clazz);
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }

    public int ranking(){
        return (int) (Math.random() * 100);
    }
}
