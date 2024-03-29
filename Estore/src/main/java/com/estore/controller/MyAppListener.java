package com.estore.controller;

import java.sql.Connection;
import java.sql.DriverManager;

import jakarta.servlet.ServletContext;
import jakarta.servlet.ServletContextEvent;
import jakarta.servlet.ServletContextListener;
import jakarta.servlet.http.HttpSession;
import jakarta.servlet.http.HttpSessionEvent;
import jakarta.servlet.http.HttpSessionListener;

/**
 * Application Lifecycle Listener implementation class MyAppListener
 *
 */
public class MyAppListener implements HttpSessionListener, ServletContextListener {

    /**
     * Default constructor. 
     */
	
	
    public MyAppListener() {
        // TODO Auto-generated constructor stub
    }

	/**
     * @see HttpSessionListener#sessionCreated(HttpSessionEvent)
     */
    public void sessionCreated(HttpSessionEvent se)  { 
         // TODO Auto-generated method stub
    	
    	HttpSessionListener.super.sessionCreated(se);
    	HttpSession session = se.getSession();
    	session.setAttribute("new Offer", "10% off on clothing");
    	System.out.println("[MyAppListener]- Session Created");
    }

	/**
     * @see HttpSessionListener#sessionDestroyed(HttpSessionEvent)
     */
    public void sessionDestroyed(HttpSessionEvent se)  { 
         // TODO Auto-generated method stub
    	HttpSessionListener.super.sessionDestroyed(se);
    	System.out.println("[MyAppListener]- Session Destroyed");
    }

	/**
     * @see ServletContextListener#contextInitialized(ServletContextEvent)
     */
    public void contextInitialized(ServletContextEvent sce)  { 
         // TODO Auto-generated method stub
    	ServletContextListener.super.contextInitialized(sce);
    	
    	System.out.println("[MyAppListener] Context Initialized");
    	
    	
    	ServletContext context = sce.getServletContext();
    	String Driver = context.getInitParameter("drivername");
    	String url = context.getInitParameter("dbUrl");
    	String username = context.getInitParameter("userName");
    	String pwd = context.getInitParameter("Password");
    	
    	try {
    		
    		Class.forName(Driver);
    		
    		//Establishing connection to DB
    		
    		Connection connection = DriverManager.getConnection(url, username, pwd);
    		System.out.println("[MyAppListener]- param values: "+url+" "+username+" "+pwd);
    		
    		
    	}catch(Exception e) {
    		System.out.println("Something went wrong "+e);
    	}
    	
   }

	/**
     * @see ServletContextListener#contextDestroyed(ServletContextEvent)
     */
    public void contextDestroyed(ServletContextEvent sce)  { 
         // TODO Auto-generated method stub
    	ServletContextListener.super.contextDestroyed(sce);
    	System.out.println("[MyAppListener]- Context Destroyed");
    }
	
}
