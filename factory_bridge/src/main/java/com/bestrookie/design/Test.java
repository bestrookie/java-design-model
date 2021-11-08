package com.bestrookie.design;

import com.bestrookie.design.pay.channel.Pay;
import com.bestrookie.design.pay.channel.WxPay;
import com.bestrookie.design.pay.channel.ZfbPay;
import com.bestrookie.design.pay.model.PayFaceMode;

import java.math.BigDecimal;

/**
 * @author bestrookie
 * @date 2021/11/8 9:40 上午
 */
public class Test {
    public static void main(String[] args) {
        Pay pay = new WxPay(new PayFaceMode());
        pay.transfer("weixin000001","10010",new BigDecimal(20));
        System.out.println("切换场景==================");
        Pay zfbPay = new ZfbPay(new PayFaceMode());
        zfbPay.transfer("zfb0000002","10086",new BigDecimal(30));

    }
}
