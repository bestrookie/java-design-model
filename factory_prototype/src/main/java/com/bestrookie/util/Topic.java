package com.bestrookie.util;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Map;

/**
 * @author bestrookie
 * @date 2021/11/2 1:54 下午
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Topic {
    private Map<String,String> option;
    private String key;
}
