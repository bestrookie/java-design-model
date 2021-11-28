package com.bestrookie.design.mediator;

import java.sql.Connection;
import java.util.Map;

/**
 * @author bestrookie
 * @version 1.0
 * @date 2021/11/28 11:09
 */
public class Configuration {
    protected Connection connection;
    protected Map<String, String> dataSource;
    protected Map<String, XNode> mapperElement;

    public void setConnection(Connection connection) {
        this.connection = connection;
    }

    public void setDataSource(Map<String, String> dataSource) {
        this.dataSource = dataSource;
    }

    public void setMapperElement(Map<String, XNode> mapperElement) {
        this.mapperElement = mapperElement;
    }
}
