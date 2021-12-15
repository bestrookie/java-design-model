package com.bestrookie.design.event;

import com.bestrookie.ActivityService;
import com.bestrookie.Status;
import com.bestrookie.design.State;
import com.bestrookie.util.Result;

/**
 * @author bestrookie
 * @version 1.0
 * @date 2021/12/15 23:30
 */
public class CheckState extends State {
    @Override
    public Result arraignment(String activityId, Enum<Status> currentStatus) {
        return new Result("0001","待审批状态不可重复提审");
    }

    @Override
    public Result checkPass(String activityId, Enum<Status> currenStatus) {
        ActivityService.execStatus(activityId,currenStatus,Status.Pass);
        return new Result("0000","活动审批完成");
    }

    @Override
    public Result checkRefuse(String activityId, Enum<Status> currenStatus) {
        ActivityService.execStatus(activityId,currenStatus,Status.Refuse);
        return new Result("0000","活动拒绝完成");
    }

    @Override
    public Result checkRevoke(String activityId, Enum<Status> currentStatus) {
       ActivityService.execStatus(activityId,currentStatus,Status.Editing);
        return new Result("0000","活动审批撤销回到编辑中");
    }

    @Override
    public Result close(String activityId, Enum<Status> currentStatus) {
        ActivityService.execStatus(activityId,currentStatus,Status.Editing);
        return new Result("0000","活动审批关闭完成");
    }

    @Override
    public Result open(String activityId, Enum<Status> currentStatus) {
        return new Result("0001","非关闭活动不可开启");
    }

    @Override
    public Result doing(String activityId, Enum<Status> currentStatus) {
        return new Result("0001","待审批活动不可执行活动中变更");
    }
}
