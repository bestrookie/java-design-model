package com.bestrookie.design.domain.service.engine.impl;

import com.bestrookie.design.domain.model.aggregates.TreeRich;
import com.bestrookie.design.domain.model.vo.EngineResult;
import com.bestrookie.design.domain.model.vo.TreeNode;
import com.bestrookie.design.domain.service.engine.EngineBase;

import java.util.Map;

/**
 * @author bestrookie
 * @date 2021/11/9 4:09 下午
 */
public class TreeEngineHandle extends EngineBase {
    @Override
    public EngineResult process(Long treeId, String userId, TreeRich treeRich, Map<String, String> decisionMatter) {
        TreeNode treeNode = engineDecisionMaker(treeRich, treeId, userId, decisionMatter);
        return new EngineResult(userId,treeId,treeNode.getTreeNodeId(),treeNode.getNodeValue());
    }
}
