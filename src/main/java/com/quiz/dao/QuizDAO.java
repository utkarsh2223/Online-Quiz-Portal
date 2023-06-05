package com.quiz.dao;

import com.quiz.model.Quiz;

import java.util.List;

public interface QuizDAO {
    Quiz getQuizById(int id);
    List<Quiz> getAllQuizzes();
    void addQuiz(Quiz quiz);
    void updateQuiz(Quiz quiz);
    void deleteQuiz(int id);
}
