package com.cms;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JdbcqueryPrepareStmt {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
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
			PreparedStatement pStmt = connection.prepareStatement("SELECT * FROM STUDENT where first_name=? or  session_name=?");
			
			//step-4
			pStmt.setString(1, "John");
			pStmt.setString(2, "Mathematics");
			ResultSet resultSet = pStmt.executeQuery();
			
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
