package com.bestrookie.design.domain.service.engine;

import com.bestrookie.design.domain.model.aggregates.TreeRich;
import com.bestrookie.design.domain.model.vo.EngineResult;

import java.util.Map;

/**
 * @author bestrookie
 * @date 2021/11/9 2:31 下午
 */
public interface IEngine {
    EngineResult process(final Long treeId, final String userId, TreeRich treeRich, final Map<String, String> decisionMatter);
}
