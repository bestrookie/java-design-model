package com.bestrookie.design.dao;

import com.bestrookie.design.pojo.School;

/**
 * @author bestrookie
 * @version 1.0
 * @date 2021/11/28 11:28
 */
public interface ISchoolDao {
    School querySchoolInfoById(Long id);
}
