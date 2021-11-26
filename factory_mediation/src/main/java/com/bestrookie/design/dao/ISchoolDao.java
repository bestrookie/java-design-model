package com.bestrookie.design.dao;

import com.bestrookie.design.pojo.School;

/**
 * @author bestrookie
 * @date 2021/11/26 11:44 上午
 */
public interface ISchoolDao {
    School querySchoolInfoById(Long id);
}
