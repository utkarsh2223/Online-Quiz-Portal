package com.quiz.model;

public class Question {
    private int id;
    private String content;
    private String optionA;
    private String optionB;
    private String optionC;
    private String optionD;
    private String correctAnswer;
    
    // Constructor, getters, and setters

    @Override
    public String toString() {
        return "Question [id=" + id + ", content=" + content + ", optionA=" + optionA + ", optionB=" + optionB
                + ", optionC=" + optionC + ", optionD=" + optionD + ", correctAnswer=" + correctAnswer + "]";
    }
}
