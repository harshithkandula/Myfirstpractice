package com.cms;

import jakarta.servlet.ServletConfig;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(urlPatterns = {"/lcdemo"})
public class ServletLifecycleDemo extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
    public ServletLifecycleDemo() {
        super();
        // TODO Auto-generated constructor stub
    }

	public void init(ServletConfig config) {
		System.out.println("Inside init");
	}
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	
		System.out.println("Do get request");
		
		
	}

	public void destroy() {
		System.out.println("Request Destoryed");
	}
	
	/*protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}*/

}
