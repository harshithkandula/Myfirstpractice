package com.cms;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class JdbcUpdateDemo {

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
			//step-4
			
			
			Scanner sc = new Scanner(System.in);
			
			while(true) {
				System.out.println("Enter row(Student ID) you want to update? Enter -1 to quit: ");
				int id =sc.nextInt();
				if(id == -1)
					break;
				System.out.println("Update First Name as: ");
				String fname =sc.next();
				
				//step-4
				String sqlCommand = "UPDATE STUDENT SET first_name='" +fname +  "' where student_id="+ id;
				
				
				int noOfRowsInserted = stmt.executeUpdate(sqlCommand);
				
				System.out.println("inserted "+noOfRowsInserted+" row(s) successfully");
				
				System.out.println("Update Another Row (Y/N): ");
				String ans = sc.next();
				
				if(!ans.equalsIgnoreCase("Y"))
					break;
			}
			sc.close();
			
			//Step-5
			
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
