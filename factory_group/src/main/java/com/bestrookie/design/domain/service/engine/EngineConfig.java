package com.bestrookie.design.domain.service.engine;

import com.bestrookie.design.domain.service.logic.LogicFilter;
import com.bestrookie.design.domain.service.logic.impl.UserAgeFilter;
import com.bestrookie.design.domain.service.logic.impl.UserGenderFilter;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * @author bestrookie
 * @date 2021/11/9 2:57 下午
 */
public class EngineConfig {
    static Map<String, LogicFilter> logicFilterMap;
    static {
        logicFilterMap = new ConcurrentHashMap<String,LogicFilter>();
        logicFilterMap.put("userAge",new UserAgeFilter());
        logicFilterMap.put("userGender",new UserGenderFilter());
    }
    public Map<String, LogicFilter> getLogicFilterMap(){
        return logicFilterMap;
    }
    public void setLogicFilterMap(Map<String,LogicFilter> logicFilterMap){
        EngineConfig.logicFilterMap = logicFilterMap;
    }
}
