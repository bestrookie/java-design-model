package com.bestrookie.design;

/**
 * @author bestrookie
 * @date 2021/11/9 9:01 上午
 */
public class EngineController {
    public String process(final String userId, final String userSex, final int userAge){
        System.out.println("if...else实现方式判断用户结果 userId: "+userId+" userSex: "+userSex+"userAge: "+userAge);
        if ("man".equals(userSex)){
            if (userAge < 25){
                return "果实A";
            }
            return "果实B";
        }
        if ("woman".equals(userSex)){
            if (userAge < 25){
                return "果实C";
            }
            return "果实D";
        }
        return null;
    }
}
