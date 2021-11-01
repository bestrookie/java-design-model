package com.bestrookie.design.tile;

import com.bestrookie.interfaces.Matter;

import java.math.BigDecimal;

/**
 * @author bestrookie
 * @date 2021/11/1 2:50 下午
 */
public class MarcoPoloTile implements Matter {

    public String scene() {
        return "地砖";
    }

    public String brand() {
        return "马可波罗";
    }

    public String model() {
        return "默认";
    }

    public BigDecimal price() {
        return new BigDecimal(140);
    }

    public String desc() {
        return "马可波罗desc";
    }
}
