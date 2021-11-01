package com.bestrookie.design.tile;

import com.bestrookie.interfaces.Matter;

import java.math.BigDecimal;

/**
 * @author bestrookie
 * @date 2021/11/1 2:48 下午
 */
public class DongPengTile implements Matter {
    public String scene() {
        return "地砖";
    }

    public String brand() {
        return "东鹏瓷砖";
    }

    public String model() {
        return "10001";
    }

    public BigDecimal price() {
        return new BigDecimal(102);
    }

    public String desc() {
        return "东鹏desc";
    }
}
