package com.bestrookie.design.pay.channel;

import com.bestrookie.design.pay.model.IPayModel;

import java.math.BigDecimal;

/**
 * @author bestrookie
 * @date 2021/11/8 10:37 上午
 */
public class ZfbPay extends Pay{
    public ZfbPay(IPayModel iPayModel) {
        super(iPayModel);
    }

    @Override
    public String transfer(String uId, String tradeId, BigDecimal amount) {
        System.out.println("模拟支付宝支付 uId: "+uId+" readeId: "+tradeId);
        boolean security = iPayModel.security(uId);
        System.out.println("安全验证====================");
        if (!security){
            System.out.println("安全验证未通过================");
            return "0001";
        }
        System.out.println("安全验证通过===============");
        return "0000";
    }
}
