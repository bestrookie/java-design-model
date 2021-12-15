package com.bestrookie.design.event;

import com.bestrookie.ActivityService;
import com.bestrookie.Status;
import com.bestrookie.design.State;
import com.bestrookie.util.Result;


/**
 * @author bestrookie
 * @version 1.0
 * @date 2021/12/15 22:55
 */
public class EditingState extends State {
    @Override
    public Result arraignment(String activityId, Enum<Status> currentStatus) {
        ActivityService.execStatus(activityId,currentStatus,Status.Check);
        return new Result("0000","活动提审成功");
    }

    @Override
    public Result checkPass(String activityId, Enum<Status> currenStatus) {
        return new Result("0001","编辑中不可审批通过");
    }

    @Override
    public Result checkRefuse(String activityId, Enum<Status> currenStatus) {
        return new Result("0001","编辑中不可审批拒绝");
    }

    @Override
    public Result checkRevoke(String activityId, Enum<Status> currentStatus) {
        return new Result("0001","编辑中不可撤销审批");
    }

    @Override
    public Result close(String activityId, Enum<Status> currentStatus) {
        ActivityService.execStatus(activityId,currentStatus,Status.Close);
        return new Result("0000","活动关闭成功");
    }

    @Override
    public Result open(String activityId, Enum<Status> currentStatus) {
        return new Result("0001","非关闭活动不可开启");
    }

    @Override
    public Result doing(String activityId, Enum<Status> currentStatus) {
        return new Result("0001","编辑中活动不渴执行活动中变更");
    }
}
