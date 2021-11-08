package com.bestrookie.design.pay.channel;

import com.bestrookie.design.pay.model.IPayModel;

import java.math.BigDecimal;

/**
 * @author bestrookie
 * @date 2021/11/8 10:25 上午
 */
public class WxPay extends Pay{
    public WxPay(IPayModel iPayModel) {
        super(iPayModel);
    }

    @Override
    public String transfer(String uId, String tradeId, BigDecimal amount) {
        System.out.println("微信支付开始  uId："+uId+" tradeId: "+tradeId);
        boolean security = iPayModel.security(uId);
        System.out.println("安全验证=========");
        if (!security){
            System.out.println("安全验证未通过============");
            return "0001";
        }
        System.out.println("安全验证通过===========");
        return "00000";
    }
}
