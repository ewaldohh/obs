package com.example;
import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class LoginServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        String username = request.getParameter("username");
        String password = request.getParameter("password");

        // Perform login validation logic here
        // You can check the username and password against a database or any other data source
        
        // For simplicity, let's assume the username is "admin" and password is "password"
        if (username.equals("admin") && password.equals("password")) {
            // Successful login
            request.setAttribute("username", username);
            request.getRequestDispatcher("welcome.jsp").forward(request, response);
            response.sendRedirect("welcome.jsp");
        } else {
            // Invalid credentials, redirect back to login page with an error message
            response.sendRedirect("login.jsp?error=1");
        }
    }
}
