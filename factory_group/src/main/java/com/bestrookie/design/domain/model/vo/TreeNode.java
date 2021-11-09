package com.bestrookie.design.domain.model.vo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

/**
 * @author bestrookie
 * @date 2021/11/9 9:54 上午
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class TreeNode {
    private Long treeId;            //规则数ID;
    private Long treeNodeId;        //规则树节点ID；
    private Integer nodeType;       //节点类型；1、子叶 2、果实
    private String nodeValue;       //节点值【nodeType =2】果实值
    private String ruleKey;         //规则key
    private String ruleDesc;        //规则描述
    private List<TreeNodeLink> treeNodeLinkList; //节点链路
}
