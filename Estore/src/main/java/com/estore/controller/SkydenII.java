package com.estore.controller;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;
import java.util.HashMap;

/**
 * Servlet implementation class SkydenII
 */
public class SkydenII extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public SkydenII() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		System.out.println("Starting with Servlets");	
		response.setContentType("text/html");
		
		
		String htmlResponse = "<center><h3>Welcome to Harshith Corporation Home Admin</h3><p>Request Served at "+new Date().toString()+"</p><a href='addproduct.html'>ADD PRODUCT</a><br><a href='fetchproducts'>View Cart</a>";
		PrintWriter out = response.getWriter();
		out.print(htmlResponse);
		
		
		
		out.print("</center>");
	}

}
