package com.bestrookie.design;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Map;

/**
 * @author bestrookie
 * @date 2021/11/2 10:24 上午
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class ChoiceQuestion {
    private String name;
    private Map<String,String> option;
    private String key;

}
