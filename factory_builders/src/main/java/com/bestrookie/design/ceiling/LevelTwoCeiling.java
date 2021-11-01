package com.bestrookie.design.ceiling;

import com.bestrookie.interfaces.Matter;

import java.math.BigDecimal;

/**
 * @author bestrookie
 * @date 2021/11/1 2:31 下午
 */
public class LevelTwoCeiling implements Matter {
    public String scene() {
        return "吊顶";
    }

    public String brand() {
        return "装修公司自带";
    }

    public String model() {
        return "二级顶";
    }

    public BigDecimal price() {
        return new BigDecimal(850);
    }

    public String desc() {
        return "两个层次的吊顶，二级吊顶高度一般往下吊20cm，如果层高很高，则可以增加每级的厚度";
    }
}
