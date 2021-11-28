package com.bestrookie.design.dao;

import com.bestrookie.design.pojo.User;

/**
 * @author bestrookie
 * @version 1.0
 * @date 2021/11/28 11:28
 */
public interface IUserDao {
    User queryUserInfoById(Integer id);
}
