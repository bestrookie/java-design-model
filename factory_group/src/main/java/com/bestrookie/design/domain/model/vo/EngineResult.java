package com.bestrookie.design.domain.model.vo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author bestrookie
 * @date 2021/11/9 2:45 下午
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class EngineResult {
    private boolean isSuccess;          //执行结果
    private String userId;              //用户ID
    private Long treeId;                //规则书ID
    private Long nodeId;                //果实节点ID
    private String nodeValue;           //果实节点值

    public EngineResult(String userId, Long treeId, Long treeNodeId, String nodeValue) {
        this.isSuccess = true;
        this.treeId = treeId;
        this.userId = userId;
        this.nodeId = treeNodeId;
        this.nodeValue = nodeValue;
    }
}
