package com.david;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

public class ProfileServlet extends HttpServlet{
	
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		request.getRequestDispatcher("navbar.html").include(request, response);
		
		String name = request.getParameter("name");
		out.println("Welcome " + name);
		
		HttpSession session = request.getSession();
		session.setAttribute("uname", name);
		
		if(name != null) {
			String username = (String)session.getAttribute("uname");
			
			if(!username.equals("") || username != null) {
				out.println("<h1>Welcome to Profile</h1>");
				out.println("<h1>Welcome, " + username + " </h1>");
			}
		} else {
			out.println("Please go to login page and login first!");
			request.getRequestDispatcher("/login.html").include(request, response);
		}
		out.close();
	}

}
