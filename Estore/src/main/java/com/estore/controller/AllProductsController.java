package com.estore.controller;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

import com.estore.db.Db;
import com.estore.model.Product;

/**
 * Servlet implementation class AllProductsController
 */
public class AllProductsController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.setContentType("text/html");
		PrintWriter out =response.getWriter();
		
		out.print("<center>");
		out.println("<h1>Cart</h1>");
		Db db = new Db();
		
		ArrayList<Product> products = db.fetchAllProducts();
		db.closeConnection();
		StringBuffer buffer = new StringBuffer();
		if(products.size()>0) {
			
			buffer.append("<table>");
			buffer.append("<tr>");
			buffer.append("<th>ID</th>");
			buffer.append("<th>CODE</th>");
			buffer.append("<th>NAME</th>");
			buffer.append("<th>PRICE</th>");
			buffer.append("<th>ACTION</th>");
			buffer.append("</tr>");
			
			
			for(Product prod: products) {
				buffer.append("<tr>");
				buffer.append("<td>"+prod.id+"</td>");
				buffer.append("<td>"+prod.code+"</td>");
				buffer.append("<td>"+prod.name+"</td>");
				buffer.append("<td>"+prod.price+"</td>");
				buffer.append("<td><a href='delete?id="+prod.id+"'>Remove</a> | <a>Update</a></td>");
				buffer.append("</tr>");
			}
			
			buffer.append("</table>");
			
		}
		else {
			buffer.append("No Products in the Cart");
		}
		
		out.println(buffer.toString());
		out.print("</center>");
		
	}

}
