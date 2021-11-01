package com.bestrookie.builder;

import com.bestrookie.interfaces.Matter;

/**
 * @author bestrookie
 * @date 2021/11/1 4:15 下午
 */
public interface IMenu {
    IMenu appendCeiling(Matter matter);
    IMenu appendCoat(Matter matter);
    IMenu appendFloor(Matter matter);
    IMenu appendTile(Matter matter);
    String getDetail();
}
