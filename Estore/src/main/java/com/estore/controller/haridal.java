package com.estore.controller;

import jakarta.servlet.ServletConfig;
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
 * Servlet implementation class haridal
 */
public class haridal extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private final String Email = "harshi121@eg.com";
	private final String PWD = "abcd1234";
       
	
	private final String NAME = "John";
	private final int Total_sales = 30000;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public haridal() {
        super();
        // TODO Auto-generated constructor stub
    }

    protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String email = request.getParameter("txtemail");
		String pwd = request.getParameter("txtpwd");
		
		System.out.println("[Haridal-LoginServlet]User Details: "+email+" "+pwd);
		
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		
		
		out.print("<center>");
		
		out.println("<p>Welcome to Home<br><a href='sdii'>Click to navigate to Home</a></p>");
		
		
		String LoginTimeStamp = new Date().toString();
		String htmlresponse = "<h3>Welcome "+email+". </h3><p>You Attempted to logged in at "+LoginTimeStamp+"</p><br><br>";
		
		out.print(htmlresponse);
		out.print("</center>");
	}

}
