package com.david;

import java.io.IOException;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

public class LoginServlet extends HttpServlet{
	
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String email = request.getParameter("email");
		String password = request.getParameter("password");
		
		Dao dao = new Dao();
		Employee employee = dao.checkLogin(email, password);
		String name = employee.getEmployeeName();
		String type = employee.getType();
		
		HttpSession session = request.getSession();
		session.setAttribute("name", name);
		
		if(type.equals("employee")) {
			RequestDispatcher rd = request.getRequestDispatcher("/EmployeeMenu.html");
	        rd.forward(request, response);
		} else {
			RequestDispatcher rd = request.getRequestDispatcher("/ManagerMenu.html");
	        rd.forward(request, response);
		}
		
		
		
	}

}
