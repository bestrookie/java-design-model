package com.bestrookie.design;

import java.io.*;
import java.net.HttpURLConnection;
import java.net.URL;
import java.nio.charset.StandardCharsets;

/**
 * @author bestrookie
 * @date 2021/12/30 2:06 下午
 */
public class HttpClient {
    public static String doGet(String httpUrl) throws IOException {
        HttpURLConnection connection = null;
        InputStream is = null;
        BufferedReader br = null;
        String result = null;
        try {
            //远程url连接
            URL url = new URL(httpUrl);
            //通过远程url连接对象打开一个连接，强制转成httpURLConnection类
            connection = (HttpURLConnection) url.openConnection();
            //设置连接方式：get
            connection.setRequestMethod("GET");
            //设置连接主机服务器的超时时间
            connection.setConnectTimeout(15000);
            //设置读取远程返回的数据时间
            connection.setReadTimeout(60000);
            //发送请求
            connection.connect();
            //通过connection连接，获取输入流
            if (connection.getResponseCode() == 200){
                is = connection.getInputStream();
                //封装输入流is,并指定字符集
                br = new BufferedReader(new InputStreamReader(is, StandardCharsets.UTF_8));
                //存放数据
                StringBuilder sbf = new StringBuilder();
                String temp  = null;
                while ((temp = br.readLine()) != null){
                    sbf.append(temp);
                    sbf.append("\r\n");
                }
                result = sbf.toString();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }finally {
            //关闭资源
            if (null != br){
                br.close();
            }
            if (null != is){
                is.close();
            }
            assert connection != null;
            connection.disconnect();
        }
        return result;
    }
}
