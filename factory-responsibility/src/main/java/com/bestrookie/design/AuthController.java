package com.bestrookie.design;

import com.bestrookie.pojo.AuthInfo;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @author bestrookie
 * @date 2021/11/18 10:28 上午
 */
public class AuthController {
    private SimpleDateFormat f = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
    public AuthInfo doAuth(String uId, String orderId, Date authDate) throws ParseException {
        Date date = AuthService.queryAuthInfo("1000013",orderId);
        if (null == date){
            return new AuthInfo("0001","单号: ",orderId,"状态：待三级负责人审批 ","王工");
        }
        if (authDate.after(f.parse("2020-06-11 00:00:00")) && authDate.before(f.parse("2020-06-25 23:59:59"))){
            date = AuthService.queryAuthInfo("1000012",orderId);
            if (null == date){
                return new AuthInfo("0001","单号: ",orderId,"状态：待二级负责人审批 ","张经理");
            }
        }
        if (authDate.after(f.parse("2020-06-11 00:00:00")) && authDate.before(f.parse("2020-06-20 23:59:59"))){
            date = AuthService.queryAuthInfo("1000011",orderId);
            if (null == date){
                return new AuthInfo("0001","单号: ",orderId,"状态：待一级负责人审批 ","段总");
            }
        }
        return new AuthInfo("0001","单号: ",orderId,"状态：审核完成");
    }
}
