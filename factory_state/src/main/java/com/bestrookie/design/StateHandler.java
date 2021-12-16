package com.bestrookie.design;

import com.bestrookie.Status;
import com.bestrookie.design.event.*;
import com.bestrookie.util.Result;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * @author bestrookie
 * @date 2021/12/16 3:10 下午
 */
public class StateHandler {
    private Map<Enum<Status>,State> stateMap = new ConcurrentHashMap<>();
    public StateHandler(){
        stateMap.put(Status.Check,new CheckState());
        stateMap.put(Status.Close,new CloseState());
        stateMap.put(Status.Doing,new DoingState());
        stateMap.put(Status.Editing,new EditingState());
        stateMap.put(Status.Open,new OpenState());
        stateMap.put(Status.Pass,new PassState());
        stateMap.put(Status.Refuse,new RefuseState());
    }
    public Result arraignment(String activityId, Enum<Status> currentStatus) {
        return stateMap.get(currentStatus).arraignment(activityId, currentStatus);
    }

    public Result checkPass(String activityId, Enum<Status> currentStatus) {
        return stateMap.get(currentStatus).checkPass(activityId, currentStatus);
    }

    public Result checkRefuse(String activityId, Enum<Status> currentStatus) {
        return stateMap.get(currentStatus).checkRefuse(activityId, currentStatus);
    }

    public Result checkRevoke(String activityId, Enum<Status> currentStatus) {
        return stateMap.get(currentStatus).checkRevoke(activityId, currentStatus);
    }

    public Result close(String activityId, Enum<Status> currentStatus) {
        return stateMap.get(currentStatus).close(activityId, currentStatus);
    }

    public Result open(String activityId, Enum<Status> currentStatus) {
        return stateMap.get(currentStatus).open(activityId, currentStatus);
    }

    public Result doing(String activityId, Enum<Status> currentStatus) {
        return stateMap.get(currentStatus).doing(activityId, currentStatus);
    }
}
