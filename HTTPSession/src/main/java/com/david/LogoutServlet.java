package com.david;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

public class LogoutServlet extends HttpServlet{

	public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();

		request.getRequestDispatcher("navbar.html").include(request, response);
		
		HttpSession session = request.getSession(false);
		session.setAttribute("uname", "");
		
		//getting the value from the query string

		out.print("you logged out successfully");
		out.close();
	}
}

