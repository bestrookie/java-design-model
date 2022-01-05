package com.bestrookie.design.visitor.impl;

import com.bestrookie.design.user.impl.Student;
import com.bestrookie.design.user.impl.Teacher;
import com.bestrookie.design.visitor.Visitor;

/**
 * @author bestrookie
 * @date 2022/1/4 2:59 下午
 */
public class Principal implements Visitor {
    @Override
    public void visit(Teacher teacher) {
        System.out.println("老师信息："+teacher.name+" "+teacher.identity);
        System.out.println("升学率:"+teacher.entranceRatio());
    }

    @Override
    public void visit(Student student) {
        System.out.println("学生信息："+student.name+" "+student.clazz);
    }
}
