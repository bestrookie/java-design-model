package com.bestrookie.adapter;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

/**
 * @author bestrookie
 * @date 2021/11/4 3:37 下午
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class RebateInfo {
    /**
     * 用户Id
     */
    private String userId;
    /**
     * 业务id
     */
    private String bizId;
    /**
     * 业务时间
     */
    private String bizTime;
    /**
     * 业务描述
     */
    private String desc;
}
