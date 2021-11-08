package com.bestrookie.design;

import java.math.BigDecimal;

/**
 * @author bestrookie
 * @date 2021/11/8 9:24 上午
 */
public class PayController {
    public Boolean dpPay(String uId, String tradeId, BigDecimal amount,int channelType,int modeType) {
        if (1 == channelType) {
            System.out.println("模拟微信渠道支付 uid: " + uId + " tradeId" + tradeId);
            if (modeType == 1) {
                System.out.println("密码支付");
            } else if (modeType == 2) {
                System.out.println("人脸支付");
            } else if (modeType == 3) {
                System.out.println("指纹支付");
            }
        } else if (2 == channelType) {
            System.out.println("模拟支付宝渠道支付 uid: " + uId + " tradeId" + tradeId);
            if (modeType == 1) {
                System.out.println("密码支付");
            } else if (modeType == 2) {
                System.out.println("人脸支付");
            } else if (modeType == 3) {
                System.out.println("指纹支付");
            }
        }
        return true;
    }
}
