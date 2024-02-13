package com.cms;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Arrays;
import java.util.Scanner;

public class JdbcInsertBatchProc {

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
			connection.setAutoCommit(false);
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
				
				
				pStmt.addBatch();
				
				System.out.println("Insert Another Row (Y/N): ");
				String ans = sc.next();
				
				if(!ans.equalsIgnoreCase("Y"))
					break;
				
				int noOfRowsInserted = pStmt.executeUpdate();
				pStmt.clearParameters();
				
				
				
				
			}
			sc.close();
			
			
			int[] noOfRowsInserted = pStmt.executeBatch();
			connection.commit();
			
			System.out.println("inserted "+Arrays.toString(noOfRowsInserted)+" row(s) successfully");
			
			pStmt.clearBatch();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
