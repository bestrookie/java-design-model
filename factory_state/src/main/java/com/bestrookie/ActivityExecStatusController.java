package com.bestrookie;

import com.bestrookie.pojo.ActivityInfo;
import com.bestrookie.util.Result;

/**
 * @author bestrookie
 * @date 2021/12/15 8:21 下午
 */
public class ActivityExecStatusController {
    /**
     * 活动状态变更
     * 1、编辑中->提审、活动关闭
     * 2、审批通过->拒绝、活动关闭、活动中
     * 3、审批拒绝->撤销、活动关闭
     * 4、活动中->活动关闭
     * 5、活动关闭->活动开启
     * 6、活动开启->活动关闭
     * @param activityId 活动id
     * @param beforeStatus 变更前的状态
     * @param afterStatus 变更后的状态
     * @return 返回结果
     */
    public Result execStatus(String activityId,Enum<Status> beforeStatus, Enum<Status> afterStatus){
        //  编辑中 -> 提审、关闭
        if (Status.Editing.equals(beforeStatus)){
            if (Status.Check.equals(afterStatus) || Status.Close.equals(afterStatus)){
                ActivityService.execStatus(activityId,beforeStatus,afterStatus);
                return new Result("0000","变更状态成功");
            }else {
                return new Result("0001","变更状态失败");
            }
        }
        //2、审批通过 ->拒绝、关闭、活动中
        if (Status.Pass.equals(beforeStatus)){
            if (Status.Refuse.equals(afterStatus) || Status.Close.equals(afterStatus) || Status.Doing.equals(afterStatus)){
                ActivityService.execStatus(activityId,beforeStatus,afterStatus);
                return new Result("0000","变更状态成功");
            }else {
                return new Result("0001","变更状态失败");
            }
        }
        //3、审批拒绝->撤销、关闭
        if (Status.Refuse.equals(beforeStatus)){
            if (Status.Editing.equals(afterStatus) || Status.Close.equals(afterStatus)){
                ActivityService.execStatus(activityId,beforeStatus,afterStatus);
                return new Result("0000","变更状态成功");
            }else {
                return new Result("0001","变更状态失败");
            }
        }
        //4、活动中 ->关闭
        if (Status.Doing.equals(beforeStatus)){
            if (Status.Close.equals(afterStatus)){
                ActivityService.execStatus(activityId,beforeStatus,afterStatus);
                return new Result("0000","变更状态成功");
            }else {
                return new Result("0001","变更状态失败");
            }
        }
        //5、活动关闭->开启
        if (Status.Close.equals(beforeStatus)){
            if (Status.Open.equals(afterStatus)){
                ActivityService.execStatus(activityId, beforeStatus, afterStatus);
                return new Result("0000","变更状态成功");
            }else {
                return new Result("0001","变更状态失败");
            }
        }
        //6、活动开启->关闭
        if (Status.Open.equals(beforeStatus)){
            if (Status.Close.equals(afterStatus)){
                ActivityService.execStatus(activityId, beforeStatus, afterStatus);
                return new Result("0000","变更状态成功");
            }else {
                return new Result("0001","变更状态失败");
            }
        }
        return new Result("0002","非可处理的活动状态变更");
    }
}
