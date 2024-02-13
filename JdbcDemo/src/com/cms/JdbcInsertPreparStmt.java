package com.cms;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class JdbcInsertPreparStmt {

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
			PreparedStatement pStmt = connection.prepareStatement(
					"INSERT INTO STUDENT("
							+ "student_id, first_name, last_name, date_of_birth, enrollment_date, session_name)"
							+ " VALUES(?, ?, ?, ?, ?, ?)");
			
			//step-4
			Scanner sc =new Scanner(System.in);
			while(true) {
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
				
				pStmt.setInt(1, id);
				pStmt.setString(2, fname);
				pStmt.setString(3, lname);
				pStmt.setString(4, dob);
				pStmt.setString(5, ed);
				pStmt.setString(6, sn);
				
				int noOfRowsInserted = pStmt.executeUpdate();
				pStmt.clearParameters();
				
				//Step-5
				
				
				
				System.out.println("inserted "+noOfRowsInserted+" row(s) successfully");
				
				System.out.println("Update Another Row (Y/N): ");
				String ans = sc.next();
				
				if(!ans.equalsIgnoreCase("Y"))
					break;
			}
			sc.close();
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
