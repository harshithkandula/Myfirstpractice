package com.estore.controller;

import jakarta.servlet.ServletConfig;
import jakarta.servlet.ServletContext;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;

/**
 * Servlet implementation class UserServlet
 */
public class UserServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public UserServlet() {
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
		
		ServletConfig config = getServletConfig();
		String appName = config.getInitParameter("appName");
		
		ServletContext context = getServletContext();
		String dbUrl = context.getInitParameter("dbUrl");
		
		StringBuffer responseText = new StringBuffer();
		responseText.append("<center>");
		responseText.append("<h5>"+appName+"</h5>");
		
		responseText.append("<h5>DataBase Url :"+dbUrl+"<h5>");
		
		Enumeration<String> paramNames = config.getInitParameterNames();
		while(paramNames.hasMoreElements()) {
			String name = paramNames.nextElement();
			String value = config.getInitParameter(name);
			responseText.append("<p>"+name+": "+value+"</p>");
		}
		
		responseText.append("<h5>Servlet Context Parameters</h5>");
		Enumeration<String> names = context.getInitParameterNames();
		while(names.hasMoreElements()) {
			String name = names.nextElement();
			String value = context.getInitParameter(name);
			responseText.append("<p>"+name+": "+value+"</p>");
		}
		
		
		
		responseText.append("</center>");
		
		out.println(responseText.toString());
	}

}
