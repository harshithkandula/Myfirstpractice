package com.trackers.hiddenformfields;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Random;

/**
 * Servlet implementation class HomeServletH
 */
public class HomeServletH extends HttpServlet {
	private static final long serialVersionUID = 1L;
	Random random = new Random();
    public HomeServletH() {
        super();
        // TODO Auto-generated constructor stub
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		
		int sessId = random.nextInt();
		
		out.println("Content from Home Servlet");
		out.println("<form action='dbsh' method='POST'>");
		out.println("<input type='hidden' name='sessId' value='"+sessId+"'>");
		out.println("<input type='submit' value='submit'>");
		out.println("</form>");
		out.println("<script>document.forms[0].submit();</script>");
		
		out.close();
	}

}
