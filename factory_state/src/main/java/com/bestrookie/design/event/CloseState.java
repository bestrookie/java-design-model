package com.bestrookie.design.event;

import com.bestrookie.ActivityService;
import com.bestrookie.Status;
import com.bestrookie.design.State;
import com.bestrookie.util.Result;

/**
 * @author bestrookie
 * @date 2021/12/16 2:45 下午
 */
public class CloseState extends State {
    @Override
    public Result arraignment(String activityId, Enum<Status> currentStatus) {
        return new Result("0001", "活动关闭不可提审");
    }

    @Override
    public Result checkPass(String activityId, Enum<Status> currenStatus) {
        return new Result("0001", "活动关闭不可审核通过");
    }

    @Override
    public Result checkRefuse(String activityId, Enum<Status> currenStatus) {
        return new Result("0001", "活动关闭不可审核拒绝");
    }

    @Override
    public Result checkRevoke(String activityId, Enum<Status> currentStatus) {
        return new Result("0001", "活动关闭不可撤销审核");
    }

    @Override
    public Result close(String activityId, Enum<Status> currentStatus) {
        return new Result("0001", "活动关闭不可重复关闭");
    }

    @Override
    public Result open(String activityId, Enum<Status> currentStatus) {
        ActivityService.execStatus(activityId,currentStatus,Status.Open);
        return new Result("0000","活动开启完成");
    }

    @Override
    public Result doing(String activityId, Enum<Status> currentStatus) {
        return new Result("0001", "活动关闭不可关闭变更活动");
    }
}
