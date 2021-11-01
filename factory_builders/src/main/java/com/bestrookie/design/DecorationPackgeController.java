package com.bestrookie.design;

import com.bestrookie.design.ceiling.LevelOneCeiling;
import com.bestrookie.design.ceiling.LevelTwoCeiling;
import com.bestrookie.design.coat.DuluxCoat;
import com.bestrookie.design.coat.LiBangCoat;
import com.bestrookie.design.floor.ShengXiangFloor;
import com.bestrookie.design.tile.DongPengTile;
import com.bestrookie.design.tile.MarcoPoloTile;
import com.bestrookie.interfaces.Matter;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

/**
 * @author bestrookie
 * @date 2021/11/1 2:58 下午
 */
public class DecorationPackgeController {
    public String getMatterList(BigDecimal area, Integer level){
        List<Matter> list = new ArrayList<Matter>();
        BigDecimal price = BigDecimal.ZERO;
        if (1 == level){
            //豪华欧式
            LevelOneCeiling levelOneCeiling = new LevelOneCeiling();// 吊顶： 二级顶
            DuluxCoat duluxCoat = new DuluxCoat(); //涂料： 多乐士
            ShengXiangFloor shengXiangFloor = new ShengXiangFloor(); //地板
            list.add(levelOneCeiling);
            list.add(duluxCoat);
            list.add(shengXiangFloor);
            price = price.add(area.multiply(new BigDecimal("0.2")).multiply(levelOneCeiling.price()));
            price = price.add(area.multiply(new BigDecimal("1.4")).multiply(duluxCoat.price()));
            price = price.add(area.multiply(shengXiangFloor.price()));
        }
        //轻奢田园
        if (2 == level){
            LevelTwoCeiling levelTwoCeiling = new LevelTwoCeiling();
            LiBangCoat liBangCoat = new LiBangCoat();
            MarcoPoloTile marcoPoloTile = new MarcoPoloTile();
            list.add(levelTwoCeiling);
            list.add(liBangCoat);
            list.add(marcoPoloTile);
            price = price.add(area.multiply(new BigDecimal("0.2")).multiply(levelTwoCeiling.price()));
            price = price.add(area.multiply(new BigDecimal("1.4")).multiply(liBangCoat.price()));
            price = price.add(area.multiply(marcoPoloTile.price()));
        }
        //现代简约
        if (3 == level){
            LevelOneCeiling levelOneCeiling = new LevelOneCeiling();
            LiBangCoat liBangCoat = new LiBangCoat();
            DongPengTile dongPengTile = new DongPengTile();
            list.add(levelOneCeiling);
            list.add(liBangCoat);
            list.add(dongPengTile);
            price = price.add(area.multiply(new BigDecimal("0.2")).multiply(levelOneCeiling.price()));
            price = price.add(area.multiply(new BigDecimal("1.4")).multiply(liBangCoat.price()));
            price = price.add(area.multiply(dongPengTile.price()));
        }
        StringBuilder detail = new StringBuilder("\r\n-------------------------------------\r\n" + "装修清单"+"\r\n" +
                "装修等级：" + level + "\r\n" +
                "装修价格：" + price.setScale(2,BigDecimal.ROUND_HALF_UP)+ "元"+"\r\n" +
                "房屋面积：" + area.doubleValue()+" 平方米"+ "\r\n" +
                "材料清单：\r\n");
        for (Matter matter : list) {
            detail.append(matter.scene()).append(": ").append(matter.brand()).append("、")
                    .append(matter.model()).append("、平方米价格：").append(matter.price()).append("元。 \n");
        }
        return detail.toString();
    }
}
