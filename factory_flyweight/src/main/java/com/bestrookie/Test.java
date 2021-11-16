package com.bestrookie;

import com.bestrookie.pojo.Activity;

/**
 * @author bestrookie
 * @date 2021/11/16 2:46 下午
 */
public class Test {
    public static void main(String[] args) throws InterruptedException {
        Long id = 10001L;
        ActivityController activityController = new ActivityController();
        for (int i = 0; i < 10; i++) {
            Activity activity = activityController.queryActivityInfo(id);
            System.out.println(activity.toString());
            Thread.sleep(1200);

        }
    }
}
