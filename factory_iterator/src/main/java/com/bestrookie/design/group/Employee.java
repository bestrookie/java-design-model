package com.bestrookie.design.group;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author bestrookie
 * @date 2021/11/22 3:44 下午
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Employee {
    private String uId;
    private String name;
    private String desc;
}
