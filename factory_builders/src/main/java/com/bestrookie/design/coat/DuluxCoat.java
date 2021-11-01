package com.bestrookie.design.coat;

import com.bestrookie.interfaces.Matter;

import java.math.BigDecimal;

/**
 * @author bestrookie
 * @date 2021/11/1 2:38 下午
 */
public class DuluxCoat implements Matter {
    public String scene() {
        return "涂料";
    }

    public String brand() {
        return "多乐土";
    }

    public String model() {
        return "第二代";
    }

    public BigDecimal price() {
        return new BigDecimal(719);
    }

    public String desc() {
        return "多乐土描述";
    }
}
