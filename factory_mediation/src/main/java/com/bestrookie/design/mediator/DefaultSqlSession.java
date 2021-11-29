package com.bestrookie.design.mediator;
import javax.xml.crypto.Data;
import java.lang.reflect.Method;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
 * @author bestrookie
 * @date 2021/11/23 4:41 下午
 */
public class DefaultSqlSession implements SqlSession{
    private Connection connection;
    private Map<String, XNode> mapperElement;
    public DefaultSqlSession(Connection connection,Map<String, XNode> mapperElement){
        this.connection = connection;
        this.mapperElement = mapperElement;
    }
    @Override
    public <T> T selectOne(String statement){
        XNode xNode = mapperElement.get(statement);
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(xNode.getSql());
            ResultSet resultSet = preparedStatement.executeQuery();

        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }

    @Override
    public <T> T selectOne(String statement, Object parameter) {
        return null;
    }

    @Override
    public <T> List<T> selectList(String statement, Object parameter) {
        return null;
    }

    @Override
    public <T> List<T> selectList(String statement) {
        return null;
    }

    private <T>List<T> resultSet2Obj(ResultSet resultSet,Class<?> clazz){
        List<T> list = new ArrayList<>();
        try {
            ResultSetMetaData metaData = resultSet.getMetaData();
            int columnCount = metaData.getColumnCount();
            while (resultSet.next()){
                T obj = (T)clazz.newInstance();
                for (int i = 1; i < columnCount; i++) {
                    Object value = resultSet.getObject(i);
                    String columnName = metaData.getColumnName(i);
                    String setMethod = "set"+columnName.substring(0,1).toUpperCase()+columnName.substring(1);
                    Method method;
                    if (value instanceof Timestamp){
                        method = clazz.getMethod(setMethod, Data.class);
                    }else {
                        method = clazz.getMethod(setMethod,value.getClass());
                    }
                    method.invoke(obj,value);
                }
                list.add(obj);
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
        return list;
    }
}
