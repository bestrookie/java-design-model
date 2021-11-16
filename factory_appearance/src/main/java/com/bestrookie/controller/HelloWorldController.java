package com.bestrookie.controller;

import com.bestrookie.pojo.UserInfo;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

/**
 * @author bestrookie
 * @date 2021/11/15 9:19 上午
 */
@RestController
public class HelloWorldController {
    @GetMapping("/query")
    public UserInfo queryUserInfo(@RequestParam String userId){
        List<String> userList = new ArrayList<>();
        userList.add("1001");
        userList.add("aaaa");
        userList.add("ccc");
        if (!userList.contains(userId)){
            return new UserInfo("1111","非白名单用户，已被拦截");
        }
        return new UserInfo("rookie:"+userId,19,"山东省");
    }
}
