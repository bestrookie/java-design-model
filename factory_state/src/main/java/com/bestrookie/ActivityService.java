package com.bestrookie;

import com.bestrookie.pojo.ActivityInfo;
import java.util.Date;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * @author bestrookie
 * @version 1.0
 * @date 2021/12/14 22:38
 */
public class ActivityService {
    private static Map<String, Enum<Status>> statusMap = new ConcurrentHashMap<>();
    public static void init(String activityId,Enum<Status> status){
        ActivityInfo activityInfo = new ActivityInfo();
        activityInfo.setActivityId(activityId);
        activityInfo.setActivityName("早起学习打卡啦");
        activityInfo.setStatus(status);
        activityInfo.setBeginTime(new Date());
        activityInfo.setEndTime(new Date());
        statusMap.put(activityId,status);
    }

    /**
     * 查询活动信息
     * @param activityId 活动id
     * @return 查询结果
     */
    public static ActivityInfo queryActivityInfo(String activityId){
        ActivityInfo activityInfo = new ActivityInfo();
        activityInfo.setActivityId(activityId);
        activityInfo.setActivityName("早起学习啊");
        activityInfo.setStatus(statusMap.get(activityId));
        activityInfo.setEndTime(new Date());
        activityInfo.setBeginTime(new Date());
        return activityInfo;
    }

    /**
     * 查询活动状态
     * @param activityId 活动id
     * @return 活动状态
     */
    public static  Enum<Status> queryActivityStatus(String activityId){
        return statusMap.get(activityId);
    }

    /**
     * 状态变更
     * @param activityId 活动id
     * @param beforeStatus 变更前状态
     * @param afterStatus 变更后状态
     */
    public static synchronized void execStatus(String activityId,Enum<Status> beforeStatus,Enum<Status> afterStatus){
        if (!beforeStatus.equals(statusMap.get(activityId))){
            return;
        }
        statusMap.put(activityId,afterStatus);
    }
}
