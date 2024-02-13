package com.cms;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JdbcInsertDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Steps to connect to our mysql database named cms.
		//Step-1: Loading the JDBC Driver
		//Step-2: create a connection
		//Step-3: create a statement
		//Step-4: Execute the statement(insert) 
		//Step-5: Display success insert message
		
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
			String sqlCommand = "INSERT INTO STUDENT("
					+ "student_id, first_name, last_name, date_of_birth, enrollment_date, session_name)"
					+ " VALUES(10, 'Sri','Vidya','1995-03-15','1999-03-25','Chemistry')";
			
			int noOfRowsInserted = stmt.executeUpdate(sqlCommand);
			
			
			//Step-5
			
			System.out.println("inserted "+noOfRowsInserted+" row(s) successfully");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
