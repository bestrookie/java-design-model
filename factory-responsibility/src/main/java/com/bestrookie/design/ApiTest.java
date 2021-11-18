package com.bestrookie.design;

import com.alibaba.fastjson.JSON;
import com.bestrookie.design.impl.AuthLink;
import com.bestrookie.design.impl.LevelOneAuthLink;
import com.bestrookie.design.impl.LevelThreeLink;
import com.bestrookie.design.impl.LevelTwoAuthLink;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @author bestrookie
 * @date 2021/11/18 10:43 上午
 */
public class ApiTest {
    public static void main(String[] args) throws ParseException {
        AuthLink authLink = new LevelThreeLink("1000013","王工")
                .appendNext(new LevelTwoAuthLink("1000012","张经理")
                        .appendNext(new LevelOneAuthLink("1000011","段总")));
        SimpleDateFormat f = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Date currentDate = f.parse("2020-06-18 22:49:46");
        System.out.println("测试结果:"+JSON.toJSONString(authLink.doAuth("rookie","1000998004813441",currentDate)));

        AuthService.auth("1000013","1000998004813441");

        System.out.println("测试结果:"+JSON.toJSONString(authLink.doAuth("rookie","1000998004813441",currentDate)));

        AuthService.auth("1000012","1000998004813441");

        System.out.println("测试结果:"+JSON.toJSONString(authLink.doAuth("rookie","1000998004813441",currentDate)));
    }
}
