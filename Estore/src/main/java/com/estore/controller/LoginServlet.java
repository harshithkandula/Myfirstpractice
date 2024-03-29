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
 * Servlet implementation class LoginServlet
 */
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private final String Email = "harshi121@eg.com";
	private final String PWD = "abcd1234";
       
	
	private final String NAME = "John";
	private final int Total_sales = 30000;
    /**
     * @see HttpServlet#HttpServlet()
     */
    public LoginServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String email = request.getParameter("txtemail");
		String pwd = request.getParameter("txtpwd");
		
		System.out.println("[LoginServlet]User Details: "+email+" "+pwd);
		
		response.setContentType("text/html");
		String message;
		PrintWriter out = response.getWriter();
		out.print("<center>");
		if(email.equals(Email) && pwd.equals(PWD)) {
			
			//1. session tracking using cookies
			Cookie c1 = new Cookie("KEY_NAME", NAME);
			Cookie c2 = new Cookie("KEY_SALES", String.valueOf(Total_sales));
			//Writing cookies
			response.addCookie(c1);
			response.addCookie(c2);
			
			//2. session tracking by rewriting url
			
			
			String url = "Home?name="+NAME+"&sales="+Total_sales;
			
			message = "<p>Welcome to Home<br><a href='"+url+"'>Click to navigate to Home</a></p>";
			
			
			//3.session tracking with hidden form fields
			//writing the data in the form as hidden fields
			
			String form = "<form action='Home' method='post'>"
					+"<input type='hidden' value='"+NAME+"' name='txtname'>"
					+"<input type='hidden' value='"+Total_sales+"' name='txtsales'>"
					+"<input type='submit' value='NAVIGATE TO HOME'>"
					+"</form><br>";
			
			out.print(form);
			
			//4. Session tracking using http session
			// writing data in the session object
			
			HttpSession session = request.getSession();
			
			HashMap<String, String> data = new HashMap<String, String>();
			data.put("name", NAME);
			data.put("sales", String.valueOf(Total_sales));
			session.setAttribute("key_data", data);
			
			out.println("<p><a href='Home'>Click to get info of http session tracking</a></p>");
			
		}
		else {
			message = "<b>Invalid Username or Password</b>";
		}
		
		String LoginTimeStamp = new Date().toString();
		String htmlresponse = "<h3>Welcome "+email+". </h3><p>You Attempted to logged in at "+LoginTimeStamp+"</p><br><br>"+message+"";
		
		out.print(htmlresponse);
		out.print("</center>");
	}

}
