package com.bestrookie.design;

import com.bestrookie.design.user.User;
import com.bestrookie.design.user.impl.Student;
import com.bestrookie.design.user.impl.Teacher;
import com.bestrookie.design.visitor.Visitor;

import java.util.ArrayList;
import java.util.List;

/**
 * @author bestrookie
 * @date 2022/1/5 1:50 下午
 */
public class DataView {
    List<User> userList = new ArrayList<>();
    public DataView(){
        userList.add(new Student("rookie","重点班","一年一班"));
        userList.add(new Student("小明","重点班","一年二班"));
        userList.add(new Student("小王","重点班","一年三班"));
        userList.add(new Teacher("bestrookie","特级教师","一年一班"));
        userList.add(new Teacher("老沈","普通教师","一年二班"));
        userList.add(new Teacher("小何","实习教师","一年三班"));
    }
    public void show(Visitor visitor){
        for (User user : userList) {
            user.accept(visitor);
        }
    }
}
