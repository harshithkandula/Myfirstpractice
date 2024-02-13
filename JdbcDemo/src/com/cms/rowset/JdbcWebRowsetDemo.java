package com.cms.rowset;

import java.io.FileWriter;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import javax.sql.rowset.RowSetProvider;
import javax.sql.rowset.WebRowSet;


public static void xml2WebRowSet() {
	
}

 public static void webRowSet2Xml() {
	
}
public class JdbcWebRowsetDemo {

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
		
		WebRowSet webjdbcrowset;
		try(Connection connection = DriverManager.getConnection(jdbcUrl, username, password)) {
			connection.setAutoCommit(false);
			webjdbcrowset = RowSetProvider.newFactory().createWebRowSet();
			webjdbcrowset.setUrl(jdbcUrl);
			 webjdbcrowset.setUsername(username);
			 webjdbcrowset.setPassword(password);
			 webjdbcrowset.setCommand("Select * from student");
			 webjdbcrowset.execute();
			 
			 while(webjdbcrowset.next()) {
				 int id = webjdbcrowset.getInt("student_id");
					String first_name = webjdbcrowset.getString("first_name");
					String last_name = webjdbcrowset.getString("last_name");
					String dob = webjdbcrowset.getString("date_of_birth");
					String edate = webjdbcrowset.getString("enrollment_date");
					String sname = webjdbcrowset.getString("session_name");
					
					System.out.println("ID: "+id+", First Name: "+first_name+", Last Name: "+last_name+", Date Of Birth: "+dob+", Date Of Enrollment: "+edate+", Session Name: "+sname);
			 }
			 webjdbcrowset.writeXml(new FileWriter("E:\\Simplilearn\\Backend_fsd\\Java\\JdbcDemo\\student.xml"));
			 webjdbcrowset.close();
		} 
			 catch (SQLException | IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("Inside sql exception block");
			System.out.println(((SQLException) e).getErrorCode());
			System.out.println(e.getMessage());
		}
	  
	}
}
