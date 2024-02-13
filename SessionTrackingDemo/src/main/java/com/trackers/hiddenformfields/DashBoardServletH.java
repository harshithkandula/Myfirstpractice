package com.trackers.hiddenformfields;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Servlet implementation class DashBoardServletH
 */
public class DashBoardServletH extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public DashBoardServletH() {
        super();
        // TODO Auto-generated constructor stub
    }

	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		
		String sessIdentifier = request.getParameter("sessId");
		
		if(sessIdentifier!=null)
			out.print("<h5>Hey user, looks like you have visited morethan one page on this site. I am DashBoard Servlet</h5>");
		else
			out.println("<h5>I am Dashboard Servlet. Thank you for visiting our site for the first time and never visited our home servlet.</h5>");
		
		
		out.close();
	}

	
    
}


