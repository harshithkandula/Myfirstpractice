package com.cms.rowset;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import javax.sql.RowSet;
import javax.sql.RowSetEvent;
import javax.sql.RowSetListener;
import javax.sql.rowset.FilteredRowSet;
import javax.sql.rowset.RowSetProvider;
public class FilteredRowsetEventlistDemo {

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
		
		FilteredRowSet filterjdbcrowset;
		try(Connection connection = DriverManager.getConnection(jdbcUrl, username, password)) {
			connection.setAutoCommit(false);
			filterjdbcrowset = RowSetProvider.newFactory().createFilteredRowSet();
			filterjdbcrowset.setUrl(jdbcUrl);
			 filterjdbcrowset.setUsername(username);
			 filterjdbcrowset.setPassword(password);
			 filterjdbcrowset.setCommand("Select * from student");
			 filterjdbcrowset.execute();
			 filterjdbcrowset.addRowSetListener(new MyListener());
			 
			 while(filterjdbcrowset.next()) {
				 int id = filterjdbcrowset.getInt("student_id");
					String first_name = filterjdbcrowset.getString("first_name");
					String last_name = filterjdbcrowset.getString("last_name");
					String dob = filterjdbcrowset.getString("date_of_birth");
					String edate = filterjdbcrowset.getString("enrollment_date");
					String sname = filterjdbcrowset.getString("session_name");
					
					System.out.println("ID: "+id+", First Name: "+first_name+", Last Name: "+last_name+", Date Of Birth: "+dob+", Date Of Enrollment: "+edate+", Session Name: "+sname);
			 }
			 //filterjdbcrowset.writeXml(new FileWriter("E:\\Simplilearn\\Backend_fsd\\Java\\JdbcDemo\\student.xml"));
			 
			 //Predicate nameFilter = row -> ((RowSet)row.getString("first_name")).startsWith("G");
			 //filterjdbcrowset.beforeFirst();
			 //filterjdbcrowset.setFilter(new NameFilter());
			 
			 //System.out.println("After filtering");
			 
			 /*while(filterjdbcrowset.next()) {
				 int id = filterjdbcrowset.getInt("student_id");
					String first_name = filterjdbcrowset.getString("first_name");
					String last_name = filterjdbcrowset.getString("last_name");
					String dob = filterjdbcrowset.getString("date_of_birth");
					String edate = filterjdbcrowset.getString("enrollment_date");
					String sname = filterjdbcrowset.getString("session_name");
					
					System.out.println("ID: "+id+", First Name: "+first_name+", Last Name: "+last_name+", Date Of Birth: "+dob+", Date Of Enrollment: "+edate+", Session Name: "+sname);
			 }*/
			 
			 
			 filterjdbcrowset.close();
		} 
			 catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("Inside sql exception block");
			System.out.println(((SQLException) e).getErrorCode());
			System.out.println(e.getMessage());
		}
	}

}

class MyListener implements RowSetListener{

	@Override
	public void rowSetChanged(RowSetEvent event) {
		// TODO Auto-generated method stub
		System.out.println("RowSet Changed"+event);
	}

	@Override
	public void rowChanged(RowSetEvent event) {
		// TODO Auto-generated method stub
		System.out.println("Row Changed"+event);
	}

	@Override
	public void cursorMoved(RowSetEvent event) {
		// TODO Auto-generated method stub
		try {
			System.out.println("Cursor Moved"+((RowSet) event.getSource()).getInt("student_id") + "\n");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
}
