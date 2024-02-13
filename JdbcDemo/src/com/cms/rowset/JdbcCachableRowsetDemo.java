package com.cms.rowset;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import javax.sql.rowset.CachedRowSet;
import javax.sql.rowset.JdbcRowSet;
import javax.sql.rowset.RowSetProvider;

public class JdbcCachableRowsetDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String jdbcUrl = "jdbc:mysql://localhost:3306/cms";
		String username = "root";
		String password = "Ias@2025";
		
		//Connection connection =null;
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		CachedRowSet cachedjdbcrowset;
		try(Connection connection = DriverManager.getConnection(jdbcUrl, username, password)) {
			connection.setAutoCommit(false);
			cachedjdbcrowset = RowSetProvider.newFactory().createCachedRowSet();
			cachedjdbcrowset.setUrl(jdbcUrl);
			 cachedjdbcrowset.setUsername(username);
			 cachedjdbcrowset.setPassword(password);
			 cachedjdbcrowset.setCommand("Select * from student");
			 cachedjdbcrowset.execute();
			 
			 while(cachedjdbcrowset.next()) {
				 int id = cachedjdbcrowset.getInt("student_id");
					String first_name = cachedjdbcrowset.getString("first_name");
					String last_name = cachedjdbcrowset.getString("last_name");
					String dob = cachedjdbcrowset.getString("date_of_birth");
					String edate = cachedjdbcrowset.getString("enrollment_date");
					String sname = cachedjdbcrowset.getString("session_name");
					
					System.out.println("ID: "+id+", First Name: "+first_name+", Last Name: "+last_name+", Date Of Birth: "+dob+", Date Of Enrollment: "+edate+", Session Name: "+sname);
			 }
			 
			 System.out.println("\n\n ");
				
				// Go to the 3rd row
				System.out.println(" Fetch the 3rd row \n " );
				cachedjdbcrowset.absolute(3);
				int id  = cachedjdbcrowset.getInt("student_id");
				String first_name  = cachedjdbcrowset.getString("first_name");
				String last_name = cachedjdbcrowset.getString("last_name");
	            String dob = cachedjdbcrowset.getString("date_of_birth");
	            String edate = cachedjdbcrowset.getString("enrollment_date");
	            String sname = cachedjdbcrowset.getString("session_name");
	            
	            System.out.println(" ID: " + id +
	                    ", Name: " + first_name + " " + last_name +
	                    ", DOB: " + dob +
	                    ", Enrollment Date: " + edate +
	                    ", Session Name: " + sname
	                    );
	            
	            System.out.println("\n\n ");
	            
	            cachedjdbcrowset.afterLast();
	            
	            while(cachedjdbcrowset.previous()) {
	            	         id = cachedjdbcrowset.getInt("student_id");
						     first_name = cachedjdbcrowset.getString("first_name");
						 last_name = cachedjdbcrowset.getString("last_name");
						 dob = cachedjdbcrowset.getString("date_of_birth");
						 edate = cachedjdbcrowset.getString("enrollment_date");
						 sname = cachedjdbcrowset.getString("session_name");
						
						System.out.println("ID: "+id+", First Name: "+first_name+", Last Name: "+last_name+", Date Of Birth: "+dob+", Date Of Enrollment: "+edate+", Session Name: "+sname);
	            }
	            
	            System.out.println("Inserting a row");
	            cachedjdbcrowset.clearParameters();
	            
	            cachedjdbcrowset.moveToInsertRow();
	            cachedjdbcrowset.updateInt("student_id", 18);
	            cachedjdbcrowset.updateString("first_name", "Anupama");
	            cachedjdbcrowset.updateString("last_name", "Kher");
	            cachedjdbcrowset.updateString("date_of_birth", "1970-04-22");
	            cachedjdbcrowset.updateString("enrollment_date", "1997-02-13");
	            cachedjdbcrowset.updateString("session_name", "Msc Physics");
	            cachedjdbcrowset.insertRow();
	            cachedjdbcrowset.moveToCurrentRow();
	            
	            
	            System.out.println("Updating a row");
	           cachedjdbcrowset.absolute(3);
	           cachedjdbcrowset.moveToCurrentRow();
	           cachedjdbcrowset.updateString("first_name", "Elisa");
	           //cachedjdbcrowset.updateString("last_name", "Akula");
	           cachedjdbcrowset.updateRow();
	           
	            cachedjdbcrowset.acceptChanges(connection);
	            
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("Inside sql exception block");
			System.out.println(e.getErrorCode());
			System.out.println(e.getMessage());
		}
	}

}
