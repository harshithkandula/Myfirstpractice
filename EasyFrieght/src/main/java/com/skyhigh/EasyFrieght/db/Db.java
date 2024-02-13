package com.skyhigh.EasyFrieght.db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

import com.skyhigh.EasyFrieght.model.User;

public class Db implements DAO{
    Connection connection;
    Statement statement;
    final String tag = getClass().getSimpleName();
	public Db() {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println(tag+" Driver loaded");
		}catch(Exception e){
			System.out.println("Exception occurred "+e);
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
			
			SimpleDateFormat pt1 = new SimpleDateFormat("YYYY-MM-DD");
			SimpleDateFormat pt2 = new SimpleDateFormat("YYYY-MM-DD hh:mm:ss");
			
			Date date = new Date();
			String date1 = pt1.format(date);
			String date2 = pt2.format(date);
			
			
			//String sqlcmd = "insert into User values(null,'"+u.getName()+"', '"+u.getPno()+"', '"+u.getEmail()+"', '"+u.getAddress()+"', '"+u.getNopt()+"', '"+u.getCountry()+"')";
			//System.out.println(sqlcmd);
			String sqlcmd = "insert into User values(null,'"+name+"', '"+pno+"', '"+email+"', '"+address+"', '"+nopt+"', '"+country+"')";
			statement = connection.createStatement();
			int result = statement.executeUpdate(sqlcmd);
			String msg = result > 0 ? "User registered successfully" : "Please Try Again";
			System.out.println(tag+" "+msg);
		}catch(Exception e) {
			System.out.println("Exception occured: "+e);
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
				
				String sqlcmd = "update User set name = '"+cn+"' where uid ='"+uid+"'";
				//System.out.println(sqlcmd);
				statement = connection.createStatement();
				int result = statement.executeUpdate(sqlcmd);
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
				
				String sqlcmd = "update User set phone = '"+cpno+"' where uid ='"+uid+"'";
				//System.out.println(sqlcmd);
				statement = connection.createStatement();
				int result = statement.executeUpdate(sqlcmd);
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
				
				String sqlcmd = "update User set email = '"+cmail+"' where uid ='"+uid+"'";
				//System.out.println(sqlcmd);
				statement = connection.createStatement();
				int result = statement.executeUpdate(sqlcmd);
				String msg = result > 0 ? "User details updated registered successfully" : "Please Try Again";
				System.out.println(tag+" "+msg);
			}catch(Exception e) {
				System.out.println("Exception occured: "+e);
			}
		}
		
		else if(dt.equalsIgnoreCase("address")){
              try {
				
				System.out.println("Enter the Email to update");
				String caddr = sc.next();
				
				String sqlcmd = "update User set address = '"+caddr+"' where uid ='"+uid+"'";
				//System.out.println(sqlcmd);
				statement = connection.createStatement();
				int result = statement.executeUpdate(sqlcmd);
				String msg = result > 0 ? "User details updated registered successfully" : "Please Try Again";
				System.out.println(tag+" "+msg);
			}catch(Exception e) {
				System.out.println("Exception occured: "+e);
			}
		}
		
		else if(dt.equalsIgnoreCase("NumberOfPastTransactions")) {
             try {
				
				System.out.println("Enter the Email to update");
				String cnopt = sc.next();
				
				String sqlcmd = "update User set NumberOfPastTransactions = '"+cnopt+"' where uid ='"+uid+"'";
				//System.out.println(sqlcmd);
				statement = connection.createStatement();
				int result = statement.executeUpdate(sqlcmd);
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
				
				String sqlcmd = "update User set country = '"+cnation+"' where uid ='"+uid+"'";
				//System.out.println(sqlcmd);
				statement = connection.createStatement();
				int result = statement.executeUpdate(sqlcmd);
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
		try {
			String sql = "delete from User where uid = "+uid;
			statement = connection.createStatement();
			int res = statement.executeUpdate(sql);
			
			String msg = res > 0 ? "User profile deleted from database" : "Something went wrong";
			System.out.println(tag+" "+msg);
		}catch(Exception e) {
			System.out.println("Error occured "+e);
		}
	}

	@Override
	public ArrayList<User> getAllUsers() {
		// TODO Auto-generated method stub
		ArrayList<User> user = new ArrayList<User>();
		try {
			String sql = "select * from User";
			statement = connection.createStatement();
			
			ResultSet rs =statement.executeQuery(sql);
			
			while(rs.next()) {
				User u = new User();
					u.uid = rs.getInt(1);
					u.name = rs.getString(2);
					u.pno = rs.getString(3);
					u.email = rs.getString(4);
					u.address = rs.getString(5);
					u.nopt = rs.getInt(6);
					u.country = rs.getString(7);
					
					user.add(u);
					
					
				
			}
		}catch(Exception e){
			System.out.println("Error occured "+e);
		}
		/*for(User u: user) {
			System.out.println( u.toString());
		}*/
		return user;
		
	}
}
