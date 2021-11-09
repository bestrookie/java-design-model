package com.bestrookie.design.domain.model.aggregates;

import com.bestrookie.design.domain.model.vo.TreeNode;
import com.bestrookie.design.domain.model.vo.TreeRoot;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Map;

/**
 * @author bestrookie
 * @date 2021/11/9 2:50 下午
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class TreeRich {
    private TreeRoot treeRoot;
    private Map<Long, TreeNode> treeNodeMap;
}
