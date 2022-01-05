package com.bestrookie.design.visitor;

import com.bestrookie.design.user.impl.Student;
import com.bestrookie.design.user.impl.Teacher;

/**
 * @author bestrookie
 * @date 2022/1/4 2:01 下午
 */
public interface Visitor {
    void visit(Teacher teacher);
    void visit(Student student);
}
