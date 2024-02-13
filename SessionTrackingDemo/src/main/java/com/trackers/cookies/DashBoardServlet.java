package com.trackers.cookies;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Servlet implementation class DashBoardServlet
 */
public class DashBoardServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public DashBoardServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		response.setContentType("text/html");
       PrintWriter out = response.getWriter();
		

       Cookie[] cookies= request.getCookies();
		boolean sessIdcookieExist = false;
		if(cookies!=null) {
			for(Cookie c: cookies) {
				String nameOfCookie = c.getName();
				
				if(nameOfCookie.equals("sessId")) {
					sessIdcookieExist = true;
					break;
				}
			}
		}
		
		
		if(sessIdcookieExist==true)
			out.print("<h5>Hey user, looks like you have visited morethan one page on this site. I am DashBoard Servlet</h5>");
		else
			out.println("<h5>I am Dashboard Servlet. Thank you for visiting our site for the first time and never visited our home servlet.</h5>");
		
		out.println("<p>Content from the Dashboard servlet</p>");
		out.close();
	}

}
