package com.quiz.user;

import java.io.IOException;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class LeaderboardServlet extends HttpServlet {

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // Retrieve the leaderboard data from the database
        
        // Set the leaderboard data as a request attribute
        
        RequestDispatcher dispatcher = request.getRequestDispatcher("leaderboard.jsp");
        dispatcher.forward(request, response);
    }
}
