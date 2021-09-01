package com.david;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class ServletDemo extends HttpServlet {
    private static final long serialVersionUID = 1L;
 
     
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
    {
         System.out.println("this is servlet");
            
          int employeeId=Integer.parseInt(request.getParameter("id").trim());
          String employeeName=request.getParameter("name").trim();
          int salary=Integer.parseInt(request.getParameter("salary").trim());
           
          Dao dao=new Dao(); 
          boolean b=dao.saveDetails(employeeId, employeeName, salary);
          response.setContentType("text/html");
          PrintWriter out=response.getWriter();
         if(b==true)
         {
           out.println("<h1>Employee details sucessfully saved.</h1>");
            
         }
          
         else
         {
             out.println("<h1>Employee details already existed.</h1>"); 
         }
         out.println("");
         out.close();
    }
 
}
