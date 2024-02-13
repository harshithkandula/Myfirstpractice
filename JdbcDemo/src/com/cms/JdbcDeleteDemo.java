package com.cms;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class JdbcDeleteDemo {

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
				System.out.println("Enter row(Student ID)  to delete? Enter -1 to quit: ");
				int id =sc.nextInt();
				if(id == -1)
					break;
				
				
				//step-4
				String sqlCommand = "DELETE FROM STUDENT where student_id="+ id;
				
				
				int noOfRowsDeleted = stmt.executeUpdate(sqlCommand);
				
				System.out.println("inserted "+noOfRowsDeleted+" row(s) successfully");
				
				System.out.println("Delete Another Row (Y/N): ");
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
