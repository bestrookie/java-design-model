package com.bestrookie.design.domain.model.vo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author bestrookie
 * @date 2021/11/9 9:56 上午
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class TreeNodeLink {
    private Long nodeIdFrom;        //节点From
    private Long nodeIdTo;          // 节点To
    private Integer ruleLimitType;  //限定类型
    private String ruleLimitValue;  //限定值
}
