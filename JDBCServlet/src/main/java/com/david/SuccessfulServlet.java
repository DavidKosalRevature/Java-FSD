package com.david;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class SuccessfulServlet extends HttpServlet{
	
	public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException {
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		
		out.println("<h1>Record saved successfully</h1>");
		out.println("<a href='list'/><button>View List</button></a>");
	}
}
