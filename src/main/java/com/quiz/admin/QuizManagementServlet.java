package com.quiz.admin;

import java.io.IOException;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class QuizManagementServlet extends HttpServlet {

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String quizName = request.getParameter("quizName");
        String[] selectedQuestions = request.getParameterValues("selectedQuestions");
        
        // Save the quiz name and selected questions in the database

        response.sendRedirect("dashboard.jsp");
    }
}
