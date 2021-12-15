package com.bestrookie.test;

import com.alibaba.fastjson.JSON;
import com.bestrookie.ActivityExecStatusController;
import com.bestrookie.ActivityService;
import com.bestrookie.Status;
import com.bestrookie.util.Result;

import java.sql.ResultSet;

/**
 * @author bestrookie
 * @version 1.0
 * @date 2021/12/15 22:31
 */
public class TestExecStatus {
    public static void main(String[] args) {
        //初始化数据
        String activityId = "100001";
        ActivityService.init(activityId, Status.Editing);
        ActivityExecStatusController activityExecStatusController = new ActivityExecStatusController();
        Result result = activityExecStatusController.execStatus(activityId,Status.Editing,Status.Refuse);
        System.out.println("测试 编辑中to审批拒绝: "+JSON.toJSONString(result));
        Result resultCheck = activityExecStatusController.execStatus(activityId,Status.Editing,Status.Check);
        System.out.println("测试 编辑中to提交审批："+JSON.toJSONString(resultCheck));
    }
}
