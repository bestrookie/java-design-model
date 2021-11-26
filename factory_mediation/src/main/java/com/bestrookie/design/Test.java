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
 * @date 2021/11/26 3:16 下午
 */
public class Test {
    public static void main(String[] args) {
        String resource = "mybatis-config-datasource.xml";
        Reader reader;
        try {
            reader = Resources.getResourceAsReader(resource);
            SqlSessionFactory sqlMapper = new SqlSessionFactoryBuilder().build(reader);
            SqlSession session = sqlMapper.openSession();
            User user = session.selectOne("com.bestrookie.design.dao.IUserDao.queryUserInfo", 1);
            System.out.println(JSON.toJSONString(user));
            session.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
