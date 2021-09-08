package com.david;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

public class ViewServlet extends HttpServlet{

	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		Dao dao = new Dao();
		HttpSession session = request.getSession();
		String nameFromSession = (String) session.getAttribute("name");
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		
		List<Ticket> list = dao.getEmployeeTickets(nameFromSession);
		out.println("<!DOCTYPE html>");
		out.println("<HTML>");
		out.println("<Head>");
		out.println("<Title>Ticket List</Title>");
		out.println("<link rel=\"stylesheet\" href=\"https://cdn.jsdelivr.net/npm/bootstrap@4.6.0/dist/css/bootstrap.min.css\" integrity=\"sha384-B0vP5xmATw1+K9KRQjQERJvTumQW0nPEzvF6L/Z6nronJ3oUOFUFpCjEUQouq2+l\" crossorigin=\"anonymous\">\r\n");
		out.println("</Head>");
		out.println("<Body>");
		out.println("<div class=\"container p-3 my-3 border\">");
		out.println("<h1>Ticket List</h1>");
		out.println("<table class=\"table table-striped\">"); 
		out.println("<tr><th>Id</th>");
		out.println("<th>Name</th>");
		out.println("<th>Amount</th>");
		out.println("<th>Expense</th>");
		out.println("<th>Status</th>");
		out.println("<th>Descr</th>");
		out.println("<th>Timestamp</th></tr>");

		
			for(Ticket ticket : list) {
				int id = ticket.getId();
				String name = ticket.getName();
				Double amount = ticket.getAmount();
				String expense = ticket.getType();
				String status = ticket.getStatus();
				String descr = ticket.getDesc();
				String timestamp = ticket.getTimestamp();
				
				out.println("<tr><td>" + id + "</td>");
				out.println("<td>" + name + "</td>");
				out.println("<td>" + amount + "</td>");
				out.println("<td>" + expense + "</td>");
				out.println("<td>" + status + "</td>");
				out.println("<td>" + descr + "</td>");
				out.println("<td>" + timestamp + "</td>");
			}
		
		out.println("</table>");
		out.println("<br>");
		out.println("<a class=\"btn btn-primary\" href=\"EmployeeMenu.html\" role=\"button\"><h5>Employee Menu</h5></a>");
		out.println("</div>");
		out.println("</body>");
		out.println("</html>");
		
		
		out.close();
	}
}
