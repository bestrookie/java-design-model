package com.bestrookie.design.group;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author bestrookie
 * @date 2021/11/22 3:48 下午
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Link {
    private String formId;
    private String toId;
}
