package com.bestrookie;

import com.bestrookie.design.QuestionBankController;

/**
 * @author bestrookie
 * @date 2021/11/2 11:45 上午
 */
public class Test {
    public static void main(String[] args) throws CloneNotSupportedException {
        InitQuestionBank initQuestionBank = new InitQuestionBank();
        System.out.println(initQuestionBank.createPaper("rookie","10086"));
        System.out.println(initQuestionBank.createPaper("best","10010"));
    }
}
