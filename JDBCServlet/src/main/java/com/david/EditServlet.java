package com.david;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class EditServlet extends HttpServlet{

	public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
		EmployeeDAO dao = EmployeeDAOFactory.getEmployeeDao();
		
		
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		
		

		
		int id = Integer.parseInt(request.getParameter("id"));
		out.println("<h1>employee id = " + id + "</h1>");
		Employee employee;
		try {
			employee = dao.employeeById(id);
			request.setAttribute("name", employee.getName());
			request.setAttribute("email", employee.getEmail());
			request.setAttribute("gender", employee.getGender());
			request.setAttribute("country", employee.getCountry());
			RequestDispatcher rd = request.getRequestDispatcher("edit.html");
			rd.forward(request, response);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		RequestDispatcher rd2 = request.getRequestDispatcher("success");
		rd2.include(request, response);
		
		out.close();
		
	}
}
