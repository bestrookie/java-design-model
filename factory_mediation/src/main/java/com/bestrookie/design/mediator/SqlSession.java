package com.bestrookie.design.mediator;

import java.util.List;

/**
 * @author bestrookie
 * @date 2021/11/23 4:16 下午
 */
public interface SqlSession {
    <T> T selectOne(String statement);
    <T> T selectOne(String statement,Object parameter);
    <T> List<T> selectList(String statement, Object parameter);
    <T> List<T> selectList(String statement);
}
