package com.estore.controller;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

import com.estore.db.Db;
import com.estore.model.Product;

/**
 * Servlet implementation class ProductController
 */
public class ProductController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		Product product = new Product();
		product.code = Integer.parseInt(request.getParameter("txtcode"));
		product.name = request.getParameter("txtname");
		product.price = Integer.parseInt(request.getParameter("txtnprice"));
		
		System.out.println("[Product Servlet] Product details: "+product);
		
		Db db = new Db();
		int result = db.addProduct(product);
		db.closeConnection();
		
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		out.print("<center");
		String message = "";
		if(result > 0)
			message = product.name+" Added to the database successfully.";
		else
			message = product.name+" Not added in database. Please try again";
		
		out.println("<p>"+message+"</p>");
		out.print("</center>");
	}

}
