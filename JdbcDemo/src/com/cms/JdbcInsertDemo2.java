package com.cms;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class JdbcInsertDemo2 {

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
			Statement stmt = connection.createStatement();
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter Student ID: ");
			int id =sc.nextInt();
			System.out.println("Enter First Name: ");
			String fname =sc.next();
			System.out.println("Enter Last Name: ");
			String lname = sc.next();
			System.out.println("Enter the Date Of Birth: ");
			String dob = sc.next();
			System.out.println("Enter the Enrollment Date: ");
			String ed = sc.next();
			System.out.println("Enter Session Name: ");
			String sn = sc.next();
			//step-4
			String sqlCommand = "INSERT INTO STUDENT("
					+ "student_id, first_name, last_name, date_of_birth, enrollment_date, session_name)"
					+ " VALUES("+id+", '"+fname+"', '"+lname+"', '"+dob+"', '"+ed+"', '"+sn+"')";
			
			int noOfRowsInserted = stmt.executeUpdate(sqlCommand);
			
			
			//Step-5
			
			System.out.println("inserted "+noOfRowsInserted+" row(s) successfully");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
