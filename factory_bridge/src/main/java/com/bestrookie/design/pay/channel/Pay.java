package com.bestrookie.design.pay.channel;

import com.bestrookie.design.pay.model.IPayModel;

import java.math.BigDecimal;

/**
 * @author bestrookie
 * @date 2021/11/8 10:02 上午
 */
public abstract class Pay {
   protected IPayModel iPayModel;
   public Pay(IPayModel iPayModel){
       this.iPayModel = iPayModel;
   }
   public abstract String transfer(String uId, String tradeId, BigDecimal amount);
}
