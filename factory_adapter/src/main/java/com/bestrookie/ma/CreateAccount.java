package com.bestrookie.ma;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

/**
 * @author bestrookie
 * @date 2021/11/4 2:07 下午
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class CreateAccount {
    /**
     * 开户编号
     */
    private String number;
    /**
     * 开户地
     */
    private String address;
    /**
     * 开户时间
     */
    private Date accountDate;
    /**
     * 开户描述
     */
    private String desc;
}
