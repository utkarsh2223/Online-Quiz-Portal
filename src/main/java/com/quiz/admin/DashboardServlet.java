package com.quiz.admin;

import java.io.IOException;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class DashboardServlet extends HttpServlet {

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // Retrieve statistics from the database, such as total quizzes, total questions, and total users
        int totalQuizzes = 10;
        int totalQuestions = 50;
        int totalUsers = 100;

        request.setAttribute("totalQuizzes", totalQuizzes);
        request.setAttribute("totalQuestions", totalQuestions);
        request.setAttribute("totalUsers", totalUsers);

        RequestDispatcher dispatcher = request.getRequestDispatcher("dashboard.jsp");
        dispatcher.forward(request, response);
    }
}
