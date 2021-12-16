package com.bestrookie.design;

import com.alibaba.fastjson.JSON;
import com.bestrookie.ActivityService;
import com.bestrookie.Status;
import com.bestrookie.util.Result;

/**
 * @author bestrookie
 * @date 2021/12/16 8:07 下午
 */
public class TestApi {
    public static void main(String[] args) {
        String activityId = "100001";
        ActivityService.init(activityId, Status.Editing);
        StateHandler stateHandler = new StateHandler();
        Result result = stateHandler.arraignment(activityId,Status.Editing);
        System.out.println(JSON.toJSON(result));
        Result result1 = stateHandler.open(activityId,Status.Editing);
        System.out.println(JSON.toJSON(result1));
        System.out.println(JSON.toJSON(ActivityService.queryActivityInfo(activityId).getStatus()));
    }
}
