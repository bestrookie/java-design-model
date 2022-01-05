package com.bestrookie.design.user.impl;

import com.bestrookie.design.user.User;
import com.bestrookie.design.visitor.Visitor;

import java.math.BigDecimal;
import java.math.RoundingMode;

/**
 * @author bestrookie
 * @date 2022/1/4 2:10 下午
 */
public class Teacher  extends User {
    public Teacher(String name, String identity, String clazz) {
        super(name, identity, clazz);
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }

    public double entranceRatio(){
        return BigDecimal.valueOf(Math.random() * 100).setScale(2, RoundingMode.HALF_UP).doubleValue();
    }
}
