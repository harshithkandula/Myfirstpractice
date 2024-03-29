package com.cms.filtersdemo.filters;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.Filter;
import jakarta.servlet.FilterChain;
import jakarta.servlet.ServletRequest;
import jakarta.servlet.ServletResponse;
import jakarta.servlet.http.HttpFilter;

/**
 * Servlet Filter implementation class VoteAgeCheckFilter
 */
public class VoteAgeCheckFilter extends HttpFilter implements Filter {
       
    /**
     * @see HttpFilter#HttpFilter()
     */
    public VoteAgeCheckFilter() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see Filter#destroy()
	 */
	public void destroy() {
		// TODO Auto-generated method stub
	}

	/**
	 * @throws jakarta.servlet.ServletException 
	 * @see Filter#doFilter(ServletRequest, ServletResponse, FilterChain)
	 */
	public void doFilter(jakarta.servlet.ServletRequest request, jakarta.servlet.ServletResponse response, jakarta.servlet.FilterChain chain) throws IOException, jakarta.servlet.ServletException {
		System.out.println("Inside Voting filter");
		PrintWriter pw = response.getWriter();
		
		String agestr = request.getParameter("age");
		
		int age = Integer.parseInt(agestr);
		
		if(age >= 18)
			chain.doFilter(request, response);
		else
			pw.println("<h4>You need atleast 18 years to vote</h4>");
		
		
		pw.close();
	}

	/**
	 * @see Filter#init(FilterConfig)
	 */
	

}
