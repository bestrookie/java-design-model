package com.bestrookie;

import com.alibaba.fastjson.JSON;
import com.bestrookie.adapter.MQAdapter;
import com.bestrookie.adapter.RebateInfo;
import com.bestrookie.ma.CreateAccount;

import java.lang.reflect.InvocationTargetException;
import java.util.Date;
import java.util.HashMap;

/**
 * @author bestrookie
 * @date 2021/11/4 5:01 下午
 */
public class test2 {
    public static void main(String[] args) throws InvocationTargetException, NoSuchMethodException, IllegalAccessException {
        CreateAccount createAccount = new CreateAccount();
        createAccount.setNumber("100001");
        createAccount.setAddress("山东省");
        createAccount.setAccountDate(new Date());
        createAccount.setDesc("在校开户");
        HashMap<String, String> link = new HashMap<String, String>();
        link.put("userId","number");
        link.put("bizId","number");
        link.put("bizTime","accountDate");
        link.put("desc","desc");
        RebateInfo filter = MQAdapter.filter(JSON.toJSONString(createAccount), link);
        System.out.println(JSON.toJSON(filter));
    }
}
