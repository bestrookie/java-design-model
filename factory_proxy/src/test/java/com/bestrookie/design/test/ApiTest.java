package com.bestrookie.design.test;

import com.bestrookie.design.IUserDao;
import org.junit.Test;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author bestrookie
 * @date 2021/11/17 4:45 下午
 */
public class ApiTest {
    @Test
    public void test_IUserDao() {
        BeanFactory beanFactory = new ClassPathXmlApplicationContext("spring-config.xml");
        IUserDao userDao = beanFactory.getBean("userDao", IUserDao.class);
        String res = userDao.queryUserInfo("100001");
        System.out.println("result:"+res);
    }
}
