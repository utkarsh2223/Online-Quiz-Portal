package com.quiz.user;

import java.io.IOException;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class QuizServlet extends HttpServlet {

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // Retrieve the list of available quizzes from the database
        
        // Set the list of quizzes as a request attribute
        
        RequestDispatcher dispatcher = request.getRequestDispatcher("quizList.jsp");
        dispatcher.forward(request, response);
    }
}
