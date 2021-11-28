package com.bestrookie.design.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

/**
 * @author bestrookie
 * @version 1.0
 * @date 2021/11/28 11:26
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class School {
    private Long id;
    private String name;
    private Date createTime;
    private Date updateTime;
}
