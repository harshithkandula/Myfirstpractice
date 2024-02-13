package com.cms;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class JdbcCreateTableDemo {

	public static void main(String[] args)  {
		// TODO Auto-generated method stub
		Connection connection = null;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/cms", "root", "Ias@2025");
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		try {
			Statement stmt = connection.createStatement();
			String sqlCmd = "CREATE TABLE instructor(id int, firstname varchar(80), lastname varchar(80))";
			
			stmt.execute(sqlCmd);
			
			System.out.println("Created table successfully");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
