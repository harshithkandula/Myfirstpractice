package com.gym.db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import com.gym.model.Batch;
import com.gym.model.Participant;

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
	
	public int addParticipant(Participant p) {
		int res = 0;
		try {
			String sql = "insert into participant values(null, ?, ?, ?, ?, ?, ?, ?)";
			ps = connection.prepareStatement(sql);
			ps.setString(1, p.name);
			ps.setString(2, p.dob);
			ps.setString(3, p.gender);
			ps.setString(4, p.batchname);
			ps.setString(5, p.profession);
			ps.setString(6, p.phno);
			ps.setString(7, p.address);
			
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
