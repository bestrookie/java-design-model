package com.bestrookie.interfaces;

import java.math.BigDecimal;

/**
 * @author bestrookie
 * @date 2021/11/1 2:21 下午
 */
public interface Matter {
    String scene(); //场景：地板、地砖、涂料
    String brand(); //品牌
    String model(); //幸好
    BigDecimal price(); //价格
    String desc(); //描述
}
