package com.demo.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.demo.entities.Product;
import com.demo.models.ProductModel;

@WebServlet("/product")
public class ProductServlet extends HttpServlet {

	private static final long serialVersionUID = 1L;
	

	public ProductServlet() {
		super();
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		request.getRequestDispatcher("product/index.jsp").forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		ProductModel productModel = new ProductModel();
		Product product = new Product();
		
		String name = request.getParameter("name");
		String price = request.getParameter("price");
		String quantity = request.getParameter("quantity");
		
		out.println("<h1>Name " + name + "</h1>");
		out.println("<h1>Price " + price + "</h1>");
		out.println("<h1>Quantity " + quantity + "</h1>");
		
		
		product.setName(request.getParameter("name"));
		product.setPrice(Double.parseDouble(request.getParameter("price")));
		product.setQuantity(Integer.parseInt(request.getParameter("quantity")));
		boolean status = request.getParameter("status") != null;
		product.setStatus(status);
		if (productModel.create(product)) {
			request.setAttribute("msg", "Successful");
			System.out.println("product added");
		} else {
			request.setAttribute("msg", "Failed");
		}
		request.getRequestDispatcher("product/index.jsp").forward(request, response);
	}

}