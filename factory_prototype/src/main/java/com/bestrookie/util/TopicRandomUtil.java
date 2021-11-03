package com.bestrookie.util;

import java.util.*;

/**
 * @author bestrookie
 * @date 2021/11/2 1:56 下午
 */
public class TopicRandomUtil {
    static public Topic random(Map<String,String>option,String key){
        Set<String> keySet = option.keySet();
        ArrayList<String> keyList = new ArrayList<String>(keySet);
        Collections.shuffle(keyList);
        HashMap<String, String> optionNew = new HashMap<String, String>(16);
        int idx = 0;
        String newKey = "";
        for (String next : keySet) {
            String randomKey = keyList.get(idx++);
            if (key.equals(next)){
                newKey = randomKey;
            }
            optionNew.put(randomKey,option.get(next));
        }
        return new Topic(option,newKey);
    }
}
