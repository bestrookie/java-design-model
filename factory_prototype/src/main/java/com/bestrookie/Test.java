package com.bestrookie;

import com.bestrookie.design.QuestionBankController;

/**
 * @author bestrookie
 * @date 2021/11/2 11:45 上午
 */
public class Test {
    private static void test(Integer sum, int countA) {

        sum += 1;
        countA++;
        int countB = 0;


        if (sum < 10) {
            test(sum, countA);
            countB++;
        }
        System.out.println("A =  " + countA);
        System.out.println("sum=  " + sum);
        System.out.println("B=  " + countB + "\n");

    }


    public static void main(String[] args) {
        test(1, 1);
    }
}
