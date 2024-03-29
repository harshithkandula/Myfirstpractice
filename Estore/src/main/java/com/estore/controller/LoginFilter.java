package com.estore.controller;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.Filter;
import jakarta.servlet.FilterChain;
import jakarta.servlet.FilterConfig;
import jakarta.servlet.ServletException;
import jakarta.servlet.ServletRequest;
import jakarta.servlet.ServletResponse;
import jakarta.servlet.http.HttpFilter;

/**
 * Servlet Filter implementation class LoginFilter
 */
public class LoginFilter extends HttpFilter implements Filter {

	/**
	 * @see Filter#destroy()
	 */
	public void destroy() {
		// TODO Auto-generated method stub
		System.out.println("[Login Filter]- Destroy Executed");
		}

	/**
	 * @see Filter#doFilter(ServletRequest, ServletResponse, FilterChain)
	 */
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
		// TODO Auto-generated method stub
		// place your code here
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		out.print("<center>");
        out.println("<p>Pre Processing</p>");
        
        String email = request.getParameter("txtemail");
        String pwd = request.getParameter("txtpwd");
        
     // pass the request along the filter chain
        if(email.isEmpty() || pwd.isEmpty()) {
        	out.println("<h5>Sorry!! Email and Password Cannot be Blank</h5>");
        }
        else {
        	chain.doFilter(request, response);
        }
		
		
		out.println("<p>Post Processing</p>");
		out.print("</center>");
	}

	/**
	 * @see Filter#init(FilterConfig)
	 */
	public void init(FilterConfig fConfig) throws ServletException {
		// TODO Auto-generated method stub
		System.out.println("[Login Filter]- init executed");
	}

}
