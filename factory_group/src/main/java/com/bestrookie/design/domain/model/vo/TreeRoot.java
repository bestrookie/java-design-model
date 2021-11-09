package com.bestrookie.design.domain.model.vo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author bestrookie
 * @date 2021/11/9 11:23 上午
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class TreeRoot {
    private Long treeId;            //规则树ID
    private Long treeRootNodeId;    //规则树根ID
    private String treeName;        //规则树名称
}
