package com.bestrookie.design.xiaoer;

import com.bestrookie.design.cuisine.ICuisine;

import java.util.ArrayList;
import java.util.List;

/**
 * @author bestrookie
 * @version 1.0
 * @date 2021/11/20 21:06
 */
public class XiaoEr {
    private List<ICuisine> cuisineList = new ArrayList<>();
    public void order(ICuisine cuisine){
        cuisineList.add(cuisine);
    }
    public synchronized void priceOrder(){
        for (ICuisine iCuisine : cuisineList) {
            iCuisine.cook();
        }
        cuisineList.clear();
    }
}
