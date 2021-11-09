package com.bestrookie.design.domain.service.engine;

import com.bestrookie.design.domain.model.aggregates.TreeRich;
import com.bestrookie.design.domain.model.vo.EngineResult;
import com.bestrookie.design.domain.model.vo.TreeNode;
import com.bestrookie.design.domain.model.vo.TreeRoot;
import com.bestrookie.design.domain.service.logic.LogicFilter;

import java.util.Map;

/**
 * @author bestrookie
 * @date 2021/11/9 3:06 下午
 */
public abstract class EngineBase extends EngineConfig implements IEngine{
    @Override
    public abstract EngineResult process(Long treeId, String userId, TreeRich treeRich, Map<String, String> decisionMatter);
    protected TreeNode engineDecisionMaker(TreeRich treeRich,Long treeId,String userId,Map<String, String> decisionMatter){
        TreeRoot treeRoot = treeRich.getTreeRoot();
        Map<Long,TreeNode> treeNodeMap = treeRich.getTreeNodeMap();
        //规则树根id
        Long rootNodeId = treeRoot.getTreeRootNodeId();
        TreeNode treeNodeInfo = treeNodeMap.get(rootNodeId);
        //节点类型【NodeType】 1 叶子 2 果实
         while (treeNodeInfo.getNodeType().equals(1)){
             String ruleKey = treeNodeInfo.getRuleKey();
             LogicFilter logicFilter = logicFilterMap.get(ruleKey);
             String matterValue = logicFilter.matterValue(treeId, userId, decisionMatter);
             Long nextNode = logicFilter.filter(matterValue, treeNodeInfo.getTreeNodeLinkList());
             treeNodeInfo = treeNodeMap.get(nextNode);
             System.out.println("决策树引擎 userId:"+userId+" treeId: "+treeId+" treeNode: "+ruleKey+"matterValue: "+matterValue);
         }
         return treeNodeInfo;
    }

}
