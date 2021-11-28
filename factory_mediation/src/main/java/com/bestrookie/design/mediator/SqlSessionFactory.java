package com.bestrookie.design.mediator;

/**
 * @author bestrookie
 * @version 1.0
 * @date 2021/11/28 11:03
 */
public interface SqlSessionFactory {
    SqlSession openSession();
}
