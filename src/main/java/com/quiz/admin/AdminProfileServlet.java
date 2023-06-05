package com.quiz.admin;

import java.io.IOException;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

public class AdminProfileServlet extends HttpServlet {

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        HttpSession session = request.getSession();
        String admin = (String) session.getAttribute("admin");
        // Retrieve admin profile information from the database and set it as request attributes
        request.setAttribute("adminUsername", admin);
        request.setAttribute("adminEmail", "admin@example.com");
        
        RequestDispatcher dispatcher = request.getRequestDispatcher("adminProfile.jsp");
        dispatcher.forward(request, response);
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String newPassword = request.getParameter("newPassword");
        // Update the admin's password in the database
        
        response.sendRedirect("adminProfile.jsp");
    }
}
