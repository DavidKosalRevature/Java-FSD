package com.david;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class Calculator extends HttpServlet {
	
	public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException {
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		out.println("<h1>Welcome to Calculator Servlet</h1>");

		double num1 = Double.parseDouble(request.getParameter("num1"));
		double num2 = Double.parseDouble(request.getParameter("num2"));
		double total;
		String operation = request.getParameter("operation");

		switch (operation) {
		case "add":
			total = num1 + num2;
			out.println("<h1>Your total is " + total + "</h1>");
			break;
		case "subtract":
			total = num1 - num2;
			out.println("<h1>Your total is " + total + "</h1>");
			break;
		case "multiply":
			total = num1 * num2;
			out.println("<h1>Your total is " + total + "</h1>");
			break;
		case "divide":
			total = num1 / num2;
			out.println("<h1>Your total is " + total + "</h1>");
			break;
		}
	}
}
