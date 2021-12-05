package com.bestrookie;

/**
 * @author bestrookie
 * @version 1.0
 * @date 2021/12/5 16:53
 */
public class MinibusTargetService {
    public String lottery(String uId){
        return Math.abs(uId.hashCode()) % 2 == 0 ? "恭喜你，编码".concat(uId).concat("在本次摇号中中签")
                :"很遗憾，编码：".concat(uId).concat("在本次摇号中未中签或签好资格已过期");
    }
}
