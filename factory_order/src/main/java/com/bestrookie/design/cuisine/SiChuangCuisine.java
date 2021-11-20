package com.bestrookie.design.cuisine;

import com.bestrookie.design.cook.ICook;

/**
 * @author bestrookie
 * @version 1.0
 * @date 2021/11/20 21:02
 */
public class SiChuangCuisine implements ICuisine {
    private ICook cook;
    public SiChuangCuisine(ICook cook){
        this.cook = cook;
    }
    @Override
    public void cook() {
        cook.doCook();
    }
}
