package com.david;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class AddServlet extends HttpServlet{

	public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
		EmployeeDAO dao = EmployeeDAOFactory.getEmployeeDao();
		Employee employee = new Employee();
		
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		out.println("<h1>Add Servlet</h1>");
		
		String name = request.getParameter("user_name");
		String email = request.getParameter("user_email");
		String gender = request.getParameter("user_gender");
		String country = request.getParameter("user_country");
		
		employee.setName(name);
		employee.setEmail(email);
		employee.setCountry(country);
		employee.setGender(gender);
		
		try {
			dao.addEmployee(employee);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		RequestDispatcher rd = request.getRequestDispatcher("success");
		rd.forward(request, response);

		out.close();
		
	}
}
