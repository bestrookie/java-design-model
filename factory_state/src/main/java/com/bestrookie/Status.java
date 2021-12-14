package com.bestrookie;

/**
 * @author bestrookie
 * @version 1.0
 * @date 2021/12/14 22:23
 */
public enum Status {
    //1 创建编辑，2、daishenpi 3、审批通过（任务扫描成活动中），4、审批拒绝（可以撤审到编辑状态），5、活动中 6、活动关闭 7、活动开启（任务扫描成活动中）
    Editing,
    Check,
    Pass,
    Refuse,
    Doing,
    Close,
    Open
}
