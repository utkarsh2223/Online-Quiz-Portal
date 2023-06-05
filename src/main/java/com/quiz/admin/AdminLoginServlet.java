package com.quiz.admin;

import java.io.IOException;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

public class AdminLoginServlet extends HttpServlet {

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String username = request.getParameter("username");
        String password = request.getParameter("password");

        // Check if the username and password match the admin credentials
        if (username.equals("admin") && password.equals("admin123")) {
            HttpSession session = request.getSession();
            session.setAttribute("admin", username);
            response.sendRedirect("dashboard.jsp");
        } else {
            request.setAttribute("error", "Invalid username or password");
            RequestDispatcher dispatcher = request.getRequestDispatcher("adminLogin.jsp");
            dispatcher.forward(request, response);
        }
    }
}
