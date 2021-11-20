package com.bestrookie.design;

import com.bestrookie.design.cook.impl.GuangDongCook;
import com.bestrookie.design.cook.impl.JiangSuCook;
import com.bestrookie.design.cook.impl.ShanDongCook;
import com.bestrookie.design.cook.impl.SiChuanCook;
import com.bestrookie.design.cuisine.GuangDongCuisine;
import com.bestrookie.design.cuisine.JiangSuCuisine;
import com.bestrookie.design.cuisine.ShanDongCuisine;
import com.bestrookie.design.cuisine.SiChuangCuisine;
import com.bestrookie.design.xiaoer.XiaoEr;

/**
 * @author bestrookie
 * @version 1.0
 * @date 2021/11/20 22:05
 */
public class Test {
    public static void main(String[] args) {
        GuangDongCuisine guangDongCuisine = new GuangDongCuisine(new GuangDongCook());
        JiangSuCuisine jiangSuCuisine = new JiangSuCuisine(new JiangSuCook());
        ShanDongCuisine shanDongCuisine = new ShanDongCuisine(new ShanDongCook());
        SiChuangCuisine siChuangCuisine = new SiChuangCuisine(new SiChuanCook());
        XiaoEr xiaoEr = new XiaoEr();
        xiaoEr.order(guangDongCuisine);
        xiaoEr.order(jiangSuCuisine);
        xiaoEr.order(shanDongCuisine);
        xiaoEr.order(siChuangCuisine);
        xiaoEr.priceOrder();
    }
}
