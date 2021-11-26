package com.bestrookie.design.mediator;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.sql.Connection;
import java.util.Map;

/**
 * @author bestrookie
 * @date 2021/11/25 2:44 下午
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Configuration {
    protected Connection connection;
    protected Map<String, String> dataSource;
    protected Map<String,XNode> mapperElement;
}
