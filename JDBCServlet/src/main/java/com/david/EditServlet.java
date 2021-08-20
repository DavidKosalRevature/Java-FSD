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

	public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
		EmployeeDAO dao = EmployeeDAOFactory.getEmployeeDao();
		Employee employee = new Employee();
		
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		
		RequestDispatcher rd = request.getRequestDispatcher("edit.html");
		rd.forward(request, response);

		
		int id = Integer.parseInt(request.getParameter("id"));
		out.println("<h1>employee id = " + id + "</h1>");
		employee.setId(id);
		
		RequestDispatcher rd2 = request.getRequestDispatcher("editsuccess");
		rd2.forward(request, response);
		
		out.close();
		
	}
}
