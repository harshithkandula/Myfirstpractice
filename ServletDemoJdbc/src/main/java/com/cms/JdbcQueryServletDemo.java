package com.cms;

import jakarta.servlet.ServletConfig;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

/**
 * Servlet implementation class JdbcQueryServletDemo
 */
public class JdbcQueryServletDemo extends HttpServlet {
	private static final long serialVersionUID = 1L;
	Connection connection;
    /**
     * @see HttpServlet#HttpServlet()
     */
    public JdbcQueryServletDemo() {
        super();
        // TODO Auto-generated constructor stub
    }
    
    public void init(ServletConfig config) {
    	try {
    		Class.forName("com.mysql.cj.jdbc.Driver");
			connection = DriverManager.getConnection(config.getInitParameter("url"),config.getInitParameter("username"), config.getInitParameter("password"));
    	}catch(Exception e) {
    		e.printStackTrace();
    	}
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		
		
		try {
			
			Statement stmt =  connection.createStatement();
			ResultSet resultSet = stmt.executeQuery("Select * from student");
			
			out.write("List Of Students <hr>");
			out.write("<table border=1>");
			out.write("<tr><th>Student Id</th><th>First Name</th><th>Last Name</th><th>Date Of Birth</th><th>Enrollment Date</th><th>Session Name</th></tr>");
			
			while(resultSet.next()) {
				int id  = resultSet.getInt("student_id");
				String first_name  = resultSet.getString("first_name");
				String lastName = resultSet.getString("last_name");
	            String dateOfBirth = resultSet.getString("date_of_birth");
	            String enrollmentDate = resultSet.getString("enrollment_date");
	            String session_name = resultSet.getString("session_name");
	            
	              out.println("<tr>"+"<td>"+ id +"</td>"+
	                    "<td>" + first_name +"</td><td>"+ lastName +
	                    "</td><td>" + dateOfBirth +
	                    "</td><td>" + enrollmentDate +
	                    "</td><td>" + session_name+
	                    "</td><tr>");
	              
	              out.write("</table>");
	              
	            
			}
			
			
			out.close();
		}catch(Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
