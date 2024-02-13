package com.skyhigh.EasyFrieght.db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.ArrayList;
import java.util.Scanner;

import com.skyhigh.EasyFrieght.model.User;

public class DbPs implements DAO{

	Connection connection;
	PreparedStatement ps;
	final String tag = getClass().getSimpleName();
	
	public DbPs() {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println(tag+" Driver loaded");
		}catch(Exception e) {
			System.out.println("Error occurred "+e);
		}
	}
	@Override
	public void createConnection() {
		// TODO Auto-generated method stub
		try {
			String username = "root";
			String password = "Ias@2025";
			String url = "jdbc:mysql://localhost/harsh";
			
			connection = DriverManager.getConnection(url, username, password);
			
			System.out.println(tag+" Connection created");
			System.out.println("Connection created: "+connection.isValid(0));
		}catch(Exception e) {
			System.out.println("Exception occurred "+e);
		}
	}

	@Override
	public void closeConnection() {
		// TODO Auto-generated method stub
		try {
			connection.close();
			System.out.println(tag+" connection closed");
			System.out.println("Connection close status: "+connection.isClosed());
		}catch(Exception e){
			System.out.println("Exception occurred "+e);
		}
	}

	@Override
	public void createUser(User u) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
        System.out.println("Enter your name:");
        String name = sc.next();
        System.out.println("Enter your mobile number: ");
        String pno = sc.next();
        System.out.println("Enter your email: ");
        String email = sc.next();
        System.out.println("Enter your mailing address: ");
        String address = sc.next();
        System.out.println("Enter your past transaction");
        int nopt = sc.nextInt();
        System.out.println("Enter your country of residence: ");
        String country = sc.next();
        try {
        	String sqlcmd = "insert into User values(null, ?, ?, ?, ?, ?, ?)";
        	ps = connection.prepareStatement(sqlcmd);
        	
        	ps.setString(1, name);
        	ps.setString(2, pno);
        	ps.setString(3, email);
        	ps.setString(4, address);
        	ps.setInt(5, nopt);
        	ps.setString(6, country);
        	
        	int res = ps.executeUpdate();
        	String msg = res >0 ? "User created successfully in database" : "Something went wrong. Please try again";
        	System.out.println(tag+" "+msg);
        	
        }catch(Exception e) {
        	System.out.println("Error occurred "+e);
        }
		
	}

	@Override
	public void updateUser(User u) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the user id to be updated");
		int uid = sc.nextInt();
		System.out.println("Choose details of profile to be updated:");
		String dt = sc.next();
		
		if(dt.equalsIgnoreCase("Name")) {
			try {
				
				System.out.println("Enter the name");
				String cn = sc.next();
				
				String sqlcmd = "update User set name =? where uid =?";
				//System.out.println(sqlcmd);
				ps = connection.prepareStatement(sqlcmd);
				
				ps.setString(1, cn);
				ps.setInt(2, uid);
				
				int result = ps.executeUpdate(sqlcmd);
				String msg = result > 0 ? "User details updated registered successfully" : "Please Try Again";
				System.out.println(tag+" "+msg);
			}catch(Exception e) {
				System.out.println("Exception occured: "+e);
			}
		}
		
		else if(dt.equalsIgnoreCase("phone")) {
              try {
				
				System.out.println("Enter the Phone  number to update");
				String cpno = sc.next();
				
				String sqlcmd = "update User set phone = ? where uid = ?";
				//System.out.println(sqlcmd);
				ps = connection.prepareStatement(sqlcmd);
				ps.setString(1, cpno);
				ps.setInt(2, uid);
				int result = ps.executeUpdate(sqlcmd);
				String msg = result > 0 ? "User details updated registered successfully" : "Please Try Again";
				System.out.println(tag+" "+msg);
			}catch(Exception e) {
				System.out.println("Exception occured: "+e);
			}
		}
		
		else if(dt.equalsIgnoreCase("email")) {
              try {
				
				System.out.println("Enter the Email to update");
				String cmail = sc.next();
				
				String sqlcmd = "update User set email = ? where uid = ?";
				//System.out.println(sqlcmd);
				ps = connection.prepareStatement(sqlcmd);
				ps.setString(1, cmail);
				ps.setInt(2, uid);
				
				int result = ps.executeUpdate(sqlcmd);
				String msg = result > 0 ? "User details updated registered successfully" : "Please Try Again";
				System.out.println(tag+" "+msg);
			}catch(Exception e) {
				System.out.println("Exception occured: "+e);
			}
		}
		
		else if(dt.equalsIgnoreCase("address")){
              try {
				
				System.out.println("Enter the Address to update");
				String caddr = sc.next();
				
				String sqlcmd = "update User set address = ? where uid = ?";
				//System.out.println(sqlcmd);
				ps = connection.prepareStatement(sqlcmd);
				
				ps.setString(1, caddr);
				ps.setInt(2, uid);
				int result = ps.executeUpdate(sqlcmd);
				String msg = result > 0 ? "User details updated registered successfully" : "Please Try Again";
				System.out.println(tag+" "+msg);
			}catch(Exception e) {
				System.out.println("Exception occured: "+e);
			}
		}
		
		else if(dt.equalsIgnoreCase("NumberOfPastTransactions")) {
             try {
				
				System.out.println("Enter the No. of past transactions to update");
				int cnopt = sc.nextInt();
				
				String sqlcmd = "update User set NumberOfPastTransactions = ? where uid = ? ";
				//System.out.println(sqlcmd);
				ps = connection.prepareStatement(sqlcmd);
				ps.setInt(1, cnopt);
				ps.setInt(2, uid);
				int result = ps.executeUpdate(sqlcmd);
				String msg = result > 0 ? "User details updated registered successfully" : "Please Try Again";
				System.out.println(tag+" "+msg);
			}catch(Exception e) {
				System.out.println("Exception occured: "+e);
			}
		}
		
		else if(dt.equalsIgnoreCase("country")) {
             try {
				
				System.out.println("Enter the country name to update");
				String cnation = sc.next();
				
				String sqlcmd = "update User set country = ? where uid = ?";
				//System.out.println(sqlcmd);
				ps = connection.prepareStatement(sqlcmd);
				ps.setString(1, cnation);
				ps.setInt(2, uid);
				int result = ps.executeUpdate(sqlcmd);
				String msg = result > 0 ? "User details updated registered successfully" : "Please Try Again";
				System.out.println(tag+" "+msg);
			}catch(Exception e) {
				System.out.println("Exception occured: "+e);
			}
		}
		
		else {
			System.out.println("Please enter valid details to update");
		}
	}

	@Override
	public void deleteUser(int uid) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public ArrayList<User> getAllUsers() {
		// TODO Auto-generated method stub
		return null;
	}

}
