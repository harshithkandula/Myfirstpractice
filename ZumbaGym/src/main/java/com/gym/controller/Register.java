package com.gym.controller;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

import com.gym.db.Db;
import com.gym.model.Participant;

/**
 * Servlet implementation class Register
 */
public class Register extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Register() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		Participant p = new Participant();
		
		p.name = request.getParameter("pname");
		p.dob = request.getParameter("dob");
		p.gender = request.getParameter("gender");
		p.batchname = request.getParameter("bname");
		p.profession = request.getParameter("job");
		p.phno = request.getParameter("phno");
		p.address = request.getParameter("addr");
		
		
		Db db = new Db();
		int res = db.addParticipant(p);
		
		if(res > 0) {
			String htmlResponse = "Thank you "+p.name+" for joining Zumba classes in our gym";
			out.println(htmlResponse);
		}
		else {
			out.println("<h1>Participant not added. Please try Again</h1>");
		}
		
		
	}

}
