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
 * Servlet implementation class Skyden
 */
public class Skyden extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Skyden() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @return 
	 * @throws ServletException 
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse response)
	 */
    
    public void init(ServletConfig config) throws ServletException {
    	super.init(config);
    	System.out.println("[Skyden]- init executed");
    }
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		System.out.println("Starting with Servlets");	
		response.setContentType("text/html");
		
		String htmlResponse = "<center><h3>Welcome to Harshith Corporation</h3>"
				+ "<p>request served at "+new Date().toString()+"</p>";
		
		PrintWriter out = response.getWriter();
		out.print(htmlResponse);
		//Session tracking cookies
		//Reading cookies
		out.print("<p>Cookies data</p>");
		Cookie[] array = request.getCookies();
		for(Cookie cookies: array) {
			out.print("<p>"+cookies.getName()+" - "+cookies.getValue()+"</p>");
		}
		
		//2.Session tracking by rewriting url
		//Reading data from url
		
		String name = request.getParameter("name");
		String sales = request.getParameter("sales");
		out.print("<p>url rewriting data</p>");
		out.print("<p>NAME: "+name+" | SALES: "+sales+"</p>");
		
		//3. Session tracking with hidden form fields
		//reading data from form
		
		String hiddenname = request.getParameter("txtname");
		String hiddensales = request.getParameter("txtsales");
		
		out.print("<p>Hidden Form Fields Data</p>");
		out.print("<p>NAME: "+hiddenname+" SALES: "+hiddensales+"</p>");
		
		
		//4. Session tracking using http session
		//reading data from http session objects
		out.println("<p>Http Session Objects</p>");
		HttpSession session = request.getSession();
		HashMap<String, String> data = (HashMap<String, String>) session.getAttribute("key_data");
		out.println("<p>NAME: "+data.get("name")+" SALES: "+data.get("sales")+"</p>");
		out.print("</center>");
		
		}

	@Override
	public void destroy() {
		// TODO Auto-generated method stub
		super.destroy();
		System.out.println("[skyden]- destroy executed");
	}
	
	

}
