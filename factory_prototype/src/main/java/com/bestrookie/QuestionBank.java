package com.bestrookie;

import com.bestrookie.design.AnswerQuestion;
import com.bestrookie.design.ChoiceQuestion;
import com.bestrookie.util.Topic;
import com.bestrookie.util.TopicRandomUtil;
import lombok.Data;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Map;

/**
 * @author bestrookie
 * @date 2021/11/2 2:30 下午
 */
@Data
public class QuestionBank implements Cloneable{
    private String candidate;
    private String number;
    private ArrayList<AnswerQuestion> answerQuestionList = new ArrayList<AnswerQuestion>();
    private ArrayList<ChoiceQuestion> choiceQuestionList = new ArrayList<ChoiceQuestion>();
    public QuestionBank append(ChoiceQuestion choiceQuestion){
        choiceQuestionList.add(choiceQuestion);
        return this;
    }
    public QuestionBank append(AnswerQuestion answerQuestion){
        answerQuestionList.add(answerQuestion);
        return this;
    }
    @Override
    public Object clone() throws CloneNotSupportedException {
        QuestionBank questionBank = (QuestionBank) super.clone();
        questionBank.choiceQuestionList = (ArrayList<ChoiceQuestion>) choiceQuestionList.clone();
        questionBank.answerQuestionList = (ArrayList<AnswerQuestion>) answerQuestionList.clone();
        Collections.shuffle(questionBank.answerQuestionList);
        Collections.shuffle(questionBank.choiceQuestionList);
        ArrayList<ChoiceQuestion> choiceQuestionList = questionBank.choiceQuestionList;
        for (ChoiceQuestion choiceQuestion : choiceQuestionList) {
            Topic random = TopicRandomUtil.random(choiceQuestion.getOption(), choiceQuestion.getKey());
            choiceQuestion.setOption(random.getOption());
            choiceQuestion.setKey(random.getKey());
        }
        return questionBank;
    }

    @Override
    public String toString() {
        StringBuilder detail = new StringBuilder("考生："+candidate+"\r\n"+
                "考号："+number+"\r\n"+
                "--------------------------------------\r\n"+
                "一、选择题"+"\r\n\n");
        for (int idx = 0; idx < choiceQuestionList.size(); idx++) {
            detail.append("第").append(idx + 1).append("题：").append(choiceQuestionList.get(idx).getName()).append("\r\n");
            Map<String, String> option = choiceQuestionList.get(idx).getOption();
            for (String key : option.keySet()) {
                detail.append(key).append(":").append(option.get(key)).append("\r\n");
            }
            detail.append("答案：").append(choiceQuestionList.get(idx).getKey()).append("\r\n");

        }
        detail.append("二、简答题"+"\r\n");
        for (int idx = 0; idx < answerQuestionList.size(); idx++) {
            detail.append("第").append(idx+1).append("题: ").append(answerQuestionList.get(idx).getName()).append("\r\n");
            detail.append("答案："+answerQuestionList.get(idx).getKey()).append("\r\n\n");
        }
        return detail.toString();
    }
}
