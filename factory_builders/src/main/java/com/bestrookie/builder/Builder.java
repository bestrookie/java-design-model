package com.bestrookie.builder;

import com.bestrookie.design.ceiling.LevelOneCeiling;
import com.bestrookie.design.ceiling.LevelTwoCeiling;
import com.bestrookie.design.coat.DuluxCoat;
import com.bestrookie.design.coat.LiBangCoat;
import com.bestrookie.design.floor.ShengXiangFloor;
import com.bestrookie.design.tile.DongPengTile;
import com.bestrookie.design.tile.MarcoPoloTile;

/**
 * @author bestrookie
 * @date 2021/11/1 4:33 下午
 */
public class Builder {
    public IMenu levelOne(Double area){
        return new DecorationPackageMenu(area,"欧式豪华").appendCeiling(new LevelOneCeiling())
                .appendCoat(new DuluxCoat())
                .appendFloor(new ShengXiangFloor());
    }
    public IMenu levelTwo(Double area){
        return new DecorationPackageMenu(area,"轻奢田园").appendCeiling(new LevelTwoCeiling())
                .appendCoat(new LiBangCoat())
                .appendCoat(new MarcoPoloTile());
    }
    public IMenu levelThree(Double area){
     return new DecorationPackageMenu(area,"现代简约").appendCeiling(new LevelOneCeiling())
             .appendCoat(new LiBangCoat())
             .appendCoat(new DongPengTile());
    }

}
