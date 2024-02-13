package com.estore.controller;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;

/**
 * Servlet implementation class RegisterServlet
 */
public class RegisterServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public RegisterServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String name = request.getParameter("txtfn");
		String uname = request.getParameter("txtun");
		String pwd = request.getParameter("txtpwd");
		String gender = request.getParameter("gender");
		String age = request.getParameter("age");
		
		System.out.println("[RegisterServlet]User Profile: ");
		System.out.println("Name: "+name);
		System.out.println("UserName: "+uname);
		System.out.println("Password: "+pwd);
		System.out.println("Gender: "+gender);
		System.out.println("Age: "+age);
		
		response.setContentType("text/html");
		String LoginTimeStamp = new Date().toString();
		String htmlresponse = "<center><h3>Thank you "+name+" for registering with us.</h3><br><p>UserName: "+uname+" Time: "+LoginTimeStamp+"</p></center>";
		PrintWriter out = response.getWriter();
		out.print(htmlresponse);
	}

}
