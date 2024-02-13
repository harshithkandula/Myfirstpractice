package com.skyhigh.EasyFrieght;

import java.util.ArrayList;
import java.util.Scanner;

import com.skyhigh.EasyFrieght.db.Db;
import com.skyhigh.EasyFrieght.db.DbPs;
import com.skyhigh.EasyFrieght.model.User;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Welcome to EasyFrieght" );
        /*Scanner sc = new Scanner(System.in);
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
        String country = sc.next();*/
        
        String name = null;
    	String pno = null;
    	String email = null;
    	String address = null;
    	int nopt = 0;
    	String country = null;
    	
        User u1 = new User(name, pno, email, address, nopt, country);
        User u2 = new User(name, pno, email, address, nopt, country);
        
        System.out.println("Connecting to DB");
        Db d = new Db();
        DbPs dps = new DbPs();
        //d.createConnection();
        //d.createUser(u1);
        //d.createUser(u2);
        //d.updateUser(u1);
        
        //d.deleteUser(12);
        
        //ArrayList<User> user = d.getAllUsers();
        //user.forEach(uref -> System.out.println(uref));
        
        //d.closeConnection();
        
        dps.createConnection();
        //dps.createUser(u1);
        dps.updateUser(u1);
        dps.closeConnection();
        
        
    }
}
