package com.quiz.user;

import java.io.IOException;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class QuizAttemptServlet extends HttpServlet {

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String quizId = request.getParameter("quizId");
        
        // Retrieve the quiz details and questions from the database based on the quizId
        
        // Set the quiz details and questions as request attributes
        
        RequestDispatcher dispatcher = request.getRequestDispatcher("quizAttempt.jsp");
        dispatcher.forward(request, response);
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // Process the user's quiz submission
        
        response.sendRedirect("leaderboard.jsp");
    }
}
