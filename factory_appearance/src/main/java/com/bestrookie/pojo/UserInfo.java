package com.bestrookie.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author bestrookie
 * @date 2021/11/15 10:05 上午
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class UserInfo {
    private String code;
    private String info;
    private String name;
    private Integer age;
    private String address;
    public UserInfo(String name,Integer age,String address){
        this.name = name;
        this.age = age;
        this.address = address;
    }
    public UserInfo(String code, String info) {
        this.code = code;
        this.info = info;
    }
}
