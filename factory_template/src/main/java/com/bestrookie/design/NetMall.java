package com.bestrookie.design;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

/**
 * @author bestrookie
 * @date 2021/12/30 1:48 下午
 */
public abstract class NetMall {
    String uId;
    String uPwd;
    public NetMall(String uId,String uPwd){
        this.uId = uId;
        this.uPwd = uPwd;
    }
    public String generateGoodsPoster(String skuUrl) throws IOException {
        if(!logIn(uId,uPwd)){
            return null;
        }
        Map<String, String> reptile = reptile(skuUrl);
        return createBase64(reptile);
    }
    //模拟登陆
    protected abstract Boolean logIn(String uId,String uPwd);
    //爬取信息
    protected abstract Map<String, String> reptile(String skuUrl) throws IOException;
    //生成海报
    protected  abstract String createBase64(Map<String, String> goodsInfo);
}
