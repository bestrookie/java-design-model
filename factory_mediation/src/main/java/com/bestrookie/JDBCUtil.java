package com.bestrookie;

import java.sql.*;

/**
 * @author bestrookie
 * @date 2021/11/23 2:16 下午
 */
public class JDBCUtil {
    public static final  String URL = "jdbc:mysql://47.102.118.110:3306/yin";
    public static final  String USER = "remote";
    public static final  String PASSWORD = "123456";

    public static void main(String[] args) throws Exception {
        //加载驱动程序
        Class.forName("com.mysql.jdbc.Driver");
        //获得数据库连接
        Connection conn = DriverManager.getConnection(URL,USER,PASSWORD);
        //操作数据库
        Statement stmt =  conn.createStatement();
        ResultSet resultSet = stmt.executeQuery("select id, name,age,createTime,updateTime from user");
        while (resultSet.next()){
            System.out.println(resultSet.getString("name")+" 年龄："+resultSet.getInt("age"));
        }

    }

}
