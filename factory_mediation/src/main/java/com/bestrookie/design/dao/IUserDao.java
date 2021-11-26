package com.bestrookie.design.dao;

import com.bestrookie.design.pojo.User;

/**
 * @author bestrookie
 * @date 2021/11/26 11:24 上午
 */
public interface IUserDao {
    User queryUserInfo(Integer id);
}
