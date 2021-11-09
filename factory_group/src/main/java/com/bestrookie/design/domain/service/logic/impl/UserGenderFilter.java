package com.bestrookie.design.domain.service.logic.impl;

import com.bestrookie.design.domain.service.logic.BaseLogic;

import java.util.Map;

/**
 * @author bestrookie
 * @date 2021/11/9 2:22 下午
 */
public class UserGenderFilter extends BaseLogic {
    @Override
    public String matterValue(Long treeId, String userId, Map<String, String> decisionMatter) {
        return decisionMatter.get("gender");
    }
}
