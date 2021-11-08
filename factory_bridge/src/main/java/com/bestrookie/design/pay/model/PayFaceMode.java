package com.bestrookie.design.pay.model;

/**
 * @author bestrookie
 * @date 2021/11/8 10:29 上午
 */
public class PayFaceMode implements IPayModel{
    public boolean security(String uId) {
        System.out.println("人脸支付=======");
        return true;
    }
}
