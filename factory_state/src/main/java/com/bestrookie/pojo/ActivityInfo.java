package com.bestrookie.pojo;

import com.bestrookie.Status;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

/**
 * @author bestrookie
 * @version 1.0
 * @date 2021/12/14 22:21
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class ActivityInfo {
    private String activityId;
    private String activityName;
    private Date beginTime;
    private Date endTime;
    private Enum<Status> status;
}
