package com.bestrookie.design.mediator;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Map;

/**
 * @author bestrookie
 * @date 2021/11/23 5:08 下午
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class XNode {
    private String namespace;
    private String id;
    private String parameterType;
    private String resultType;
    private String sql;
    private Map<Integer, String> parameter;

}
