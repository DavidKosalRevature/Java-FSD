package com.david;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class RegisterServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;
 
     
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
    {
    	
          String name = request.getParameter("name");
          String email = request.getParameter("email");
          String password = request.getParameter("password");
          String type = request.getParameter("type");
          
           
          Dao dao=new Dao(); 
          dao.saveDetails(name, email, password, type);
          
          RequestDispatcher rd = request.getRequestDispatcher("/index.html");
          rd.forward(request, response);
    }
 
}
