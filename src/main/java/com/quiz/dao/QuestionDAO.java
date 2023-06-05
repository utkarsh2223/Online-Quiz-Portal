package com.quiz.dao;

import com.quiz.model.Question;

import java.util.List;

public interface QuestionDAO {
    Question getQuestionById(int id);
    List<Question> getQuestionsByQuizId(int quizId);
    void addQuestion(Question question);
    void updateQuestion(Question question);
    void deleteQuestion(int id);
}
