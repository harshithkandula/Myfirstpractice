package com.estore.db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import com.estore.model.Product;

public class Db {
     Connection connection;
     PreparedStatement preparedStatement;
     
	public Db() {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println("[DB}- Driver Loaded");
			
			connection = DriverManager.getConnection("jdbc:mysql://localhost/estore", "root", "Ias@2025");
			System.out.println("[DB]- connection created");
		}
		catch(Exception e) {
			System.out.println("Something went wrong "+e);
		}
	}
	
	public int addProduct(Product prod) {
		int result = 0;
		try {
			String sql ="insert into Product values(null, ?, ?, ?)";
			preparedStatement = connection.prepareStatement(sql);
			preparedStatement.setInt(1, prod.code);
			preparedStatement.setString(2, prod.name);
			preparedStatement.setInt(3, prod.price);
			
			result = preparedStatement.executeUpdate();
			
		}
		catch(Exception e) {
			System.out.println("Something went wrong "+e);
		}
		return result;
	}
	
	public ArrayList<Product> fetchAllProducts(){
		ArrayList<Product> p = new ArrayList<Product>();
		
		try {
			String sql ="select * from Product";
			preparedStatement = connection.prepareStatement(sql);
			ResultSet set = preparedStatement.executeQuery();
			
			while(set.next()) {
				Product product = new Product();
				product.id = set.getInt(1);
				product.code = set.getInt(2);
				product.name = set.getString(3);
				product.price = set.getInt(4);
				
				p.add(product);
			}
		}catch(Exception e) {
			System.out.println("Something went wrong "+e);	
			}
		return p;
	}
	
	public int delProduct(int id) {
		int result = 0;
		try {
			String sql = "delete from Product where id = ?";
			preparedStatement = connection.prepareStatement(sql);
			preparedStatement.setInt(1, id);
			result = preparedStatement.executeUpdate();
		}catch(Exception e) {
			System.out.println("Something went wrong "+e);
		}
		return result;
	}
	
	public void closeConnection() {
		try {
			connection.close();
			System.out.println("[DB]- Connection closed");
		}
		catch(Exception e) {
			System.out.println("Something went wrong "+e);
		}
	}
     
     
}
