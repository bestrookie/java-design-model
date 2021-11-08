package com.bestrookie.design.pay.model;

/**
 * @author bestrookie
 * @date 2021/11/8 10:30 上午
 */
public class PayFingerprintMode implements IPayModel{
    public boolean security(String uId) {
        System.out.println("指纹支付======");
        return true;
    }
}
