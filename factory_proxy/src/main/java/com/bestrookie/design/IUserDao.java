package com.bestrookie.design;

import com.bestrookie.design.agent.Select;

/**
 * @author bestrookie
 * @date 2021/11/17 1:42 下午
 */
public interface IUserDao {
    @Select("select userName from user where id = #{userId}")
    String queryUserInfo(String userId);
}
