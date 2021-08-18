package com.david;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class LoginServlet extends HttpServlet{
	
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
		response.setContentType("text/html; charset=UTF-8");
		try(PrintWriter out = response.getWriter()){
			out.println("<!DOCTYPE html>");
			out.println("<HTML>");
			out.println("<Head>");
			out.println("<Title>Login Page</Title>");
			
			String username = "david";
			String password = "12345";
			
			//create a cookie
			Cookie usernameCookie = new Cookie("user_name", username);
			Cookie passwordCookie = new Cookie("user_password", password);
			response.addCookie(usernameCookie);
			response.addCookie(passwordCookie);
			
			
			out.println("</Body>");
			out.println("</HTML>");

		}
		
	}

}
