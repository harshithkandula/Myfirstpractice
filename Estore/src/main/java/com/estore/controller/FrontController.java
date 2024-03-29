package com.estore.controller;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Servlet implementation class FrontController
 */
public class FrontController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public FrontController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		out.println("<center>");
		
		out.println("<h2>Welcome to front controller</h2>");
		String typeOfRequest = request.getParameter("txtType");
		String url = "";
		if(typeOfRequest.equals("register")) {
			url="register";
		}
		else if(typeOfRequest.equals("login")) {
			
			url="login";
		}
		else {
			out.println("<h5>Request Cannot be Processed</h5>");
		}
		
		if(!url.isEmpty()) {
			RequestDispatcher dispatcher = request.getRequestDispatcher(url);
			//dispatcher.forward(request, response);
			dispatcher.include(request, response);
		}
		out.println("<center>");
		
	}

}
