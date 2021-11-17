package com.bestrookie;

import com.bestrookie.design.IUserDao;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author bestrookie
 * @date 2021/11/17 3:52 下午
 */
public class Test {
    public static void main(String[] args) {
        BeanFactory beanFactory = new ClassPathXmlApplicationContext("spring-config.xml");
        IUserDao userDao = beanFactory.getBean("userDao", IUserDao.class);
        String s = userDao.queryUserInfo("10001");
        System.out.println("result: "+ s);
    }
}
