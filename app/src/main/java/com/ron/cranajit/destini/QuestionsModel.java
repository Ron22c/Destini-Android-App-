package com.ron.cranajit.destini;

public class QuestionsModel {
    private int mQuestion;
    private int mAnswerTop;
    private int mAnswerButtom;

    public QuestionsModel(int mQuestion,int mAnswerTop,int mAnswerButtom){
        this.mQuestion = mQuestion;
        this.mAnswerTop = mAnswerTop;
        this.mAnswerButtom = mAnswerButtom;
    }

    public int getQuestion() {
        return mQuestion;
    }

    public void setQuestion(int question) {
        mQuestion = question;
    }

    public int getAnswerTop() {
        return mAnswerTop;
    }

    public void setAnswerTop(int answerTop) {
        mAnswerTop = answerTop;
    }

    public int getAnswerButtom() {
        return mAnswerButtom;
    }

    public void setAnswerButtom(int answerButtom) {
        mAnswerButtom = answerButtom;
    }
}
