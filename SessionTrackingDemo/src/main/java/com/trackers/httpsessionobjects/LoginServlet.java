package com.trackers.httpsessionobjects;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import java.io.IOException;
import java.io.PrintWriter;

/**
 * Servlet implementation class LoginServlet
 */
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public LoginServlet() {
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
		
		String uid = request.getParameter("user");
		String pass = request.getParameter("pwd");
		
		if(uid.startsWith("harshith") && pass.startsWith("abc123")) {
			HttpSession session = request.getSession(true);
			session.setAttribute("uid", uid);
			response.sendRedirect("DASHBOARD");
		}
		else {
			out.println("<h4>Invalid username or password. Please Try Again</h4>");
			out.println("<a href='login.html'>Login</a>");
		}
	}

}
