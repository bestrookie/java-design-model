package com.bestrookie.factory;

import com.bestrookie.pojo.Activity;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * @author bestrookie
 * @date 2021/11/16 2:11 下午
 */
public class ActivityFactory {
    static Map<Long,Activity> activityMap = new HashMap<Long, Activity>();
    public static Activity getActivity(Long id){
        Activity activity = activityMap.get(id);
        if (activity == null){
            //模拟从数据库查询
            activity = new Activity();
            activity.setId(10001L);
            activity.setName("iphone13");
            activity.setDesc("坑你没商量");
            activity.setStartTime(new Date());
            activity.setStopTime(new Date());
            activityMap.put(id,activity);
        }
        return activity;
    }
}
