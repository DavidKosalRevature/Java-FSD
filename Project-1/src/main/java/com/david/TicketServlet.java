package com.david;

import java.io.IOException;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/addTicket")
public class TicketServlet extends HttpServlet{
	
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.getRequestDispatcher("addTicket.html").forward(request, response);
	}
	
	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		Ticket ticket = new Ticket();
		UserDao dao = new UserDaoImpl();
		ticket.setAmount(Double.parseDouble(request.getParameter("amount")));
		ticket.setDesc(request.getParameter("desc"));
		ticket.setExpense(request.getParameter("expense"));
		dao.addTicket(ticket);
		request.getRequestDispatcher("addTicket.html").forward(request, response);
	}

}
