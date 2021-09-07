package com.david;

import java.io.IOException;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

public class AddTicketServlet extends HttpServlet{
	
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String expense = request.getParameter("expense");
		Double amount =  Double.parseDouble(request.getParameter("amount"));
		String descr = request.getParameter("descr");
		String timestamp = request.getParameter("timestamp");
		String status = "pending";
		
		HttpSession session = request.getSession();
		String name = (String) session.getAttribute("name");
		System.out.println(name);
		
		Dao dao = new Dao();
		dao.saveTicket(name, amount, expense, status, descr, timestamp);
		
		RequestDispatcher rd = request.getRequestDispatcher("/EmployeeMenu.html");
        rd.forward(request, response);
		
		
		
	}

}
