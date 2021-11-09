package com.bestrookie.design.domain.service.logic;

import com.bestrookie.design.domain.model.vo.TreeNodeLink;

import java.util.List;
import java.util.Map;

/**
 * @author bestrookie
 * @description  逻辑决策器
 * @date 2021/11/9 11:43 上午
 */
public interface LogicFilter {
    /**
     *  逻辑决策器
     * @param matterValue 决策值
     * @param treeNodeLinkList 决策节点
     * @return 下一个节点
     */
    Long filter(String matterValue, List<TreeNodeLink> treeNodeLinkList);

    /**
     * 获取决策值方法
     * @param treeId 决策物料
     * @return 决策值
     */
    String matterValue(Long treeId, String userId, Map<String, String> decisionMatter);
}
