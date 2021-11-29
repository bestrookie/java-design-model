package com.bestrookie.design;

import com.alibaba.fastjson.JSON;
import com.bestrookie.design.mediator.Resources;
import com.bestrookie.design.mediator.SqlSession;
import com.bestrookie.design.mediator.SqlSessionFactory;
import com.bestrookie.design.mediator.SqlSessionFactoryBuilder;
import com.bestrookie.design.pojo.User;

import java.io.IOException;
import java.io.Reader;

/**
 * @author bestrookie
 * @version 1.0
 * @date 2021/11/28 21:51
 */
public class Test {
    public static void main(String[] args) {
        String resource = "mybatis-config-datasource.xml";
        Reader reader;
        try {
            reader = Resources.getResourceAsReader(resource);
            SqlSessionFactory sqlMapper = new SqlSessionFactoryBuilder().build(reader);
            SqlSession session = sqlMapper.openSession();
            try {
                User user = session.selectOne("com.bestrookie.design.dao.IUserDao.queryUserInfoById", 1);
                System.out.println("测试结果："+ JSON.toJSONString(user));
            }finally {
                session.close();
                reader.close();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
