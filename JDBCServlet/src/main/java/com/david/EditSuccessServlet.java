package com.david;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class EditSuccessServlet extends HttpServlet{
	
	public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		EmployeeDAO dao = EmployeeDAOFactory.getEmployeeDao();
		Employee employee = new Employee();
		
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		
		String name = request.getParameter("user_name");
		String email = request.getParameter("user_email");
		String gender = request.getParameter("user_gender");
		String country = request.getParameter("user_country");
		
		employee.setName(name);
		employee.setEmail(email);
		employee.setCountry(country);
		employee.setGender(gender);
		
		try {
			dao.updateEmployee(employee);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
