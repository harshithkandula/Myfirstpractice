package com.cms;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Servlet implementation class StudentDetails
 */
public class StudentDetails extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public StudentDetails() {
        super();
        // TODO Auto-generated constructor stub
    }

	
	

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		
		String stuid = request.getParameter("sid");
		String fname = request.getParameter("fn");
		String lname = request.getParameter("ln");
		String dob = request.getParameter("dob");
		String ed = request.getParameter("ed");
		String course =request.getParameter("c");
		
		out.println("<h2>Student Details</h2><br>");
		out.println("<p><b>Student ID:</b>"+stuid+"</p><br>");
		out.println("<p><b>First Name:</b>"+fname+"</p><br>");
		out.println("<p><b>LastName:</b>"+lname+"</p><br>");
		out.println("<p><b>Date Of Birth:</b>"+dob+"</p><br>");
		out.println("<p><b>Enrollment Date</b>"+ed+"</p><br>");
		out.println("<p><b>Course Enrolled:</b>"+course+"</p>");
		
	}
	
	/*protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}*/

}
