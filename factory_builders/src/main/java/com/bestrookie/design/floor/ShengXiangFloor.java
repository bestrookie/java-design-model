package com.bestrookie.design.floor;

import com.bestrookie.interfaces.Matter;

import java.math.BigDecimal;

/**
 * @author bestrookie
 * @date 2021/11/1 2:45 下午
 */
public class ShengXiangFloor implements Matter {
    public String scene() {
        return "地板";
    }

    public String brand() {
        return "圣象";
    }

    public String model() {
        return "一级";
    }

    public BigDecimal price() {
        return new BigDecimal(318);
    }

    public String desc() {
        return "圣象desc";
    }
}
