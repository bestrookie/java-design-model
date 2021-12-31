package com.bestrookie.design.group;

import com.alibaba.fastjson.JSON;
import com.bestrookie.design.HttpClient;
import com.bestrookie.design.NetMall;
import lombok.SneakyThrows;
import sun.misc.BASE64Encoder;

import java.nio.charset.StandardCharsets;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @author bestrookie
 * @date 2021/12/30 2:59 下午
 */
public class JDNetMall extends NetMall {
    public JDNetMall(String uId, String uPwd) {
        super(uId, uPwd);
    }

    @Override
    protected Boolean logIn(String uId, String uPwd) {
        System.out.println("京东登录:"+ uId);
        return true;
    }

    @SneakyThrows
    @Override
    protected Map<String, String> reptile(String skuUrl) {
        String str = HttpClient.doGet(skuUrl);
        Pattern p9 = Pattern.compile("(?<=title\\>).*(?=</title)");
        Matcher m9 = p9.matcher(str);
        Map<String, String> map = new ConcurrentHashMap<>();
        if (m9.find()){
            map.put("name",m9.group());
        }
        map.put("price","5999.00");
        System.out.println("京东商城解析："+map.get("name")+":"+map.get("price")+":"+skuUrl);
        return map;
    }

    @Override
    protected String createBase64(Map<String, String> goodsInfo) {
        BASE64Encoder encoder = new BASE64Encoder();
        System.out.println("生成海报");
        return encoder.encode(JSON.toJSONString(goodsInfo).getBytes(StandardCharsets.UTF_8));
    }
}
