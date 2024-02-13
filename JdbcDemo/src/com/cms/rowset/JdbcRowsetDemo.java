package com.cms.rowset;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import javax.sql.rowset.JdbcRowSet;
import javax.sql.rowset.RowSetProvider;

public class JdbcRowsetDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//JDBC url, username and password of mysql server
		String jdbcUrl = "jdbc:mysql://localhost:3306/cms";
		String username = "root";
		String password = "Ias@2025";
		
		Connection connection =null;
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		JdbcRowSet jdbcrowset;
		try {
			jdbcrowset = RowSetProvider.newFactory().createJdbcRowSet();
			jdbcrowset.setUrl(jdbcUrl);
			 jdbcrowset.setUsername(username);
			 jdbcrowset.setPassword(password);
			 jdbcrowset.setCommand("Select * from student");
			 jdbcrowset.execute();
			 
			 while(jdbcrowset.next()) {
				 int id = jdbcrowset.getInt("student_id");
					String first_name = jdbcrowset.getString("first_name");
					String last_name = jdbcrowset.getString("last_name");
					String dob = jdbcrowset.getString("date_of_birth");
					String edate = jdbcrowset.getString("enrollment_date");
					String sname = jdbcrowset.getString("session_name");
					
					System.out.println("ID: "+id+", First Name: "+first_name+", Last Name: "+last_name+", Date Of Birth: "+dob+", Date Of Enrollment: "+edate+", Session Name: "+sname);
			 }
			 
			 System.out.println("\n\n ");
				
				// Go to the 3rd row
				System.out.println(" Fetch the 3rd row \n " );
				jdbcrowset.absolute(3);
				int id  = jdbcrowset.getInt("student_id");
				String first_name  = jdbcrowset.getString("first_name");
				String last_name = jdbcrowset.getString("last_name");
	            String dob = jdbcrowset.getString("date_of_birth");
	            String edate = jdbcrowset.getString("enrollment_date");
	            String sname = jdbcrowset.getString("session_name");
	            
	            System.out.println(" ID: " + id +
	                    ", Name: " + first_name + " " + last_name +
	                    ", DOB: " + dob +
	                    ", Enrollment Date: " + edate +
	                    ", Session Name: " + sname
	                    );
	            
	            System.out.println("\n\n ");
	            
	            jdbcrowset.afterLast();
	            
	            while(jdbcrowset.previous()) {
	            	         id = jdbcrowset.getInt("student_id");
						     first_name = jdbcrowset.getString("first_name");
						 last_name = jdbcrowset.getString("last_name");
						 dob = jdbcrowset.getString("date_of_birth");
						 edate = jdbcrowset.getString("enrollment_date");
						 sname = jdbcrowset.getString("session_name");
						
						System.out.println("ID: "+id+", First Name: "+first_name+", Last Name: "+last_name+", Date Of Birth: "+dob+", Date Of Enrollment: "+edate+", Session Name: "+sname);
	            }
	            
	            System.out.println("Inserting a row");
	            /*jdbcrowset.clearParameters();
	            
	            jdbcrowset.moveToInsertRow();
	            jdbcrowset.updateInt("student_id", 17);
	            jdbcrowset.updateString("first_name", "Gayathri");
	            jdbcrowset.updateString("last_name", "Yugala");
	            jdbcrowset.updateString("date_of_birth", "1999-04-22");
	            jdbcrowset.updateString("enrollment_date", "2013-02-13");
	            jdbcrowset.updateString("session_name", "MBA");
	            jdbcrowset.insertRow();*/
	            
	            
	            System.out.println("Updating a row");
	           jdbcrowset.absolute(8);
	           jdbcrowset.moveToCurrentRow();
	           jdbcrowset.updateString("first_name", "Sowmya");
	           jdbcrowset.updateString("last_name", "Akula");
	           jdbcrowset.updateRow();
	           
	           
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("Inside sql exception block");
			System.out.println(e.getErrorCode());
			System.out.println(e.getMessage());
		}
		 
	}

}
