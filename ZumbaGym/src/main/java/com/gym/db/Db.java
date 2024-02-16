package com.gym.db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import com.gym.model.Batch;

public class Db {

	Connection connection;
	PreparedStatement ps;
	
	public Db() {
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			connection = DriverManager.getConnection("jdbc:mysql://localhost/icon","root","Ias@2025");
		}catch(Exception e) {
			System.out.println("Something went wrong "+e);
		}
	}
	
	public int addBatch(Batch b) {
		int res = 0;
		try {
			String sql = "insert into batch values(?, ?, ?, ?, ?)";
			ps = connection.prepareStatement(sql);
			ps.setString(1, b.batchId);
			ps.setString(2, b.batchName);
			ps.setString(3, b.timings);
			ps.setLong(4, b.strength);
			ps.setString(5, b.startdate);
			
			res = ps.executeUpdate();
			
		}catch(Exception e) {
			System.out.println("Something went wrong "+e);
		}
		
		return res;
	}
	
	public void connection() {
		try {
			connection.close();
		}catch(Exception e) {
			System.out.println("Something went wrong "+e);
		}
	}
	
	
}
