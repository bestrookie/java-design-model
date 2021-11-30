package com.bestrookie.design;

import com.alibaba.fastjson.JSON;

import java.util.Date;

/**
 * @author bestrookie
 * @version 1.0
 * @date 2021/11/30 21:57
 */
public class Test {
    public static void main(String[] args) {
        Admin admin = new Admin();
        ConfigOriginator configOriginator = new ConfigOriginator();
        configOriginator.setConfigFile(new ConfigFile("100001","配置内容1",new Date(),"rookie"));
        admin.append(configOriginator.saveMemento());
        configOriginator.setConfigFile(new ConfigFile("100002","配置内容2",new Date(),"rookie 1"));
        admin.append(configOriginator.saveMemento());
        configOriginator.setConfigFile(new ConfigFile("100003","配置内容3",new Date(),"rookie 2"));
        admin.append(configOriginator.saveMemento());
        configOriginator.setConfigFile(new ConfigFile("100004","配置内容4",new Date(),"rookie 3"));
        admin.append(configOriginator.saveMemento());

        for (int i = 0; i < 4; i++) {
            configOriginator.getMemento(admin.undo());
            System.out.println("回滚："+i+"次数"+ JSON.toJSONString(configOriginator.getConfigFile()));
        }

    }
}
