package com.cms;

import jakarta.servlet.ServletConfig;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Servlet implementation class ServletConfigDemo
 */
public class ServletConfigDemo extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
    public ServletConfigDemo() {
        super();
        // TODO Auto-generated constructor stub
    }
    @Override
	public void init(ServletConfig config) {
		System.out.println("Inside init");
		
		String dbpwd = config.getInitParameter("DB_PASSWORD");
		System.out.println("DB_PASSWORD that was set in init parameters is "+dbpwd);
	}
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		System.out.println("Inside do get");
	}
	
	public void destroy() {
		System.out.println("Inside destroy block");
	}

}
