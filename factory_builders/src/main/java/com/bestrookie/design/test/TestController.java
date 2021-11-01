package com.bestrookie.design.test;

import com.bestrookie.design.DecorationPackgeController;

import java.math.BigDecimal;

/**
 * @author bestrookie
 * @date 2021/11/1 4:01 下午
 */
public class TestController {
    public static void main(String[] args) {
        DecorationPackgeController controller = new DecorationPackgeController();
        System.out.println(controller.getMatterList(new BigDecimal("135.52"), 1));
        System.out.println(controller.getMatterList(new BigDecimal("125"), 2));
        System.out.println(controller.getMatterList(new BigDecimal("185.52"), 3));
    }
}
