package com.cms;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JdbcQueryDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Steps to connect to our mysql database named cms.
		//Step-1: Loading the JDBC Driver
		//Step-2: create a connection
		//Step-3: create a statement
		//Step-4: Execute the statement(Query) and get the results(rows of data from the table)
		//Step-5: Display the results data by looping through the results(rows)
		
		Connection connection = null;
		
		try {
			//Step-1
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			//Step-2
			connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/cms", "root", "Ias@2025");
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		//step-3
		try {
			Statement stmt = connection.createStatement();
			
			//step-4
			
			ResultSet resultSet = stmt.executeQuery("SELECT * FROM STUDENT");
			
			//Step-5
			
			while(resultSet.next()) {
				int id = resultSet.getInt("student_id");
				String first_name = resultSet.getString("first_name");
				String last_name = resultSet.getString("last_name");
				String dob = resultSet.getString("date_of_birth");
				String edate = resultSet.getString("enrollment_date");
				String sname = resultSet.getString("session_name");
				
				System.out.println("ID: "+id+", First Name: "+first_name+", Last Name: "+last_name+", Date Of Birth: "+dob+", Date Of Enrollment: "+edate+", Session Name: "+sname);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
