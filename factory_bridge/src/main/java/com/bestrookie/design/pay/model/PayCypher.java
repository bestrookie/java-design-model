package com.bestrookie.design.pay.model;

import javax.swing.tree.TreeNode;

/**
 * @author bestrookie
 * @date 2021/11/8 10:31 上午
 */
public class PayCypher implements IPayModel{
    public boolean security(String uId) {
        System.out.println("密码支付=======");

        return true;
    }
}
