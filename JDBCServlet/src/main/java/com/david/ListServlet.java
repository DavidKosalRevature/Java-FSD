package com.david;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;
import java.util.List;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class ListServlet extends HttpServlet{

	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		EmployeeDAO dao = EmployeeDAOFactory.getEmployeeDao();
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		
		try {
			List<Employee> list = dao.getEmployees();
			out.println("<!DOCTYPE html>");
			out.println("<HTML>");
			out.println("<Head>");
			out.println("<Title>Employee List</Title>");
			out.println("</Head>");
			out.println("<Body>");
			out.println("<h1>Employee List</h1>");
			out.println("<table border=1 width=50% height=50%>"); 
			out.println("<tr><th>Id</th>");
			out.println("<th>Name</th>");
			out.println("<th>Email</th>");
			out.println("<th>Gender</th>");
			out.println("<th>Country</th>");
			out.println("<th>Edit</th>");
			out.println("<th>Delete</th></tr>");

			
			for(Employee employee : list) {
				int id = employee.getId();
				String name = employee.getName();
				String email = employee.getEmail();
				String gender = employee.getGender();
				String country = employee.getCountry();
				
				out.println("<tr><td>" + id + "</td>");
				out.println("<td>" + name + "</td>");
				out.println("<td>" + email + "</td>");
				out.println("<td>" + gender + "</td>");
				out.println("<td>" + country + "</td>");
				out.println("<td><a href='edit?id=" + id + "'/>Edit Employee</a></td>");
				out.println("<td><a href='delete?id=" + id + "'/>Delete Employee</a></td></tr>");
				
			}
			
			out.println("</table>");
			out.println("</body>");
			out.println("</html>");

			
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		out.close();
	}
}
