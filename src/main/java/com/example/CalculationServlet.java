package com.example;
import java.io.IOException;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class CalculationServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String username = request.getParameter("username");
        double sumpassDep1;
        double sumpassDep2;
        double sumpassDep3;
        double noOfStudent1 = 4;
        double noOfStudent2 = 1;
        double noOfStudent3 = 3;
        double passDep1 = 0;
        double passDep2 = 0;
        double passDep3 = 0;
        double dep11=Double.parseDouble(request.getParameter("dep11"));
        double dep12=Double.parseDouble(request.getParameter("dep12"));
        double dep13=Double.parseDouble(request.getParameter("dep13"));
        double dep14=Double.parseDouble(request.getParameter("dep14"));
        double dep2=Double.parseDouble(request.getParameter("dep2"));
        double dep31=Double.parseDouble(request.getParameter("dep31"));
        double dep32=Double.parseDouble(request.getParameter("dep32"));
        double dep33=Double.parseDouble(request.getParameter("dep33"));

        if(dep11 >= 40)
        {
            passDep1 = passDep1 + 1;
        }
        if(dep12 >= 40)
        {
            passDep1 = passDep1 + 1;
        }
        if(dep13 >= 40)
        {
            passDep1 = passDep1 + 1;
        }
        if(dep14 >= 40)
        {
            passDep1 = passDep1 + 1;
        }
        if(dep2 >= 40)
        {
            passDep2 = passDep2 + 1;
        }
        if(dep31 >= 40)
        {
            passDep3 = passDep3 + 1;
        }
        if(dep32 >= 40)
        {
            passDep3 = passDep3 + 1;
        }
        if(dep33 >= 40)
        {
            passDep3 = passDep3 + 1;
        }
        
        sumpassDep1 = passDep1 / noOfStudent1 * 100;
        sumpassDep2 = passDep2 / noOfStudent2 * 100;
        sumpassDep3 = passDep3 / noOfStudent3 * 100;
        request.setAttribute("pasDep1", sumpassDep1);
        request.setAttribute("pasDep2", sumpassDep2);
        request.setAttribute("pasDep3", String.format("%.2f", sumpassDep3));
        request.setAttribute("username", username);
        RequestDispatcher dispatcher = request.getRequestDispatcher("welcome.jsp");
        dispatcher.forward(request, response);
    }
}
