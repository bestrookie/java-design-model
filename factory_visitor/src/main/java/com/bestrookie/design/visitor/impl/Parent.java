package com.bestrookie.design.visitor.impl;

import com.bestrookie.design.user.impl.Student;
import com.bestrookie.design.user.impl.Teacher;
import com.bestrookie.design.visitor.Visitor;

/**
 * @author bestrookie
 * @date 2022/1/5 10:32 上午
 */
public class Parent implements Visitor {
    @Override
    public void visit(Teacher teacher) {
        System.out.println("老师信息："+teacher.name+" "+teacher.clazz+" "+teacher.identity);
    }

    @Override
    public void visit(Student student) {
        System.out.println("学生信息："+student.name+" "+student.clazz+" "+student.ranking());
    }
}
