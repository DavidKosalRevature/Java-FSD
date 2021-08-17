package com.david;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.Servlet;
import jakarta.servlet.ServletConfig;
import jakarta.servlet.ServletException;
import jakarta.servlet.ServletRequest;
import jakarta.servlet.ServletResponse;


public class MyServlet implements Servlet{

ServletConfig config;
	
	@Override
	public void init(ServletConfig config) throws ServletException {
		this.config = config;
		System.out.println("creating object...");
	}
	
	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
		System.out.println("servicing  ...");
		res.setContentType("text/html");
		
		PrintWriter out = res.getWriter();
		out.print("<html><body>");
		out.print("<h1>Hello from Servlet</h1>");
		out.print("</body></html>");
		
	}
	
	@Override
	public void destroy() {
		System.out.println("going to destroy servlet object...");
		
	}

	@Override
	public ServletConfig getServletConfig() {
		return this.config;
	}

	@Override
	public String getServletInfo() {
		return "this servlet created by admin";
	}

}
