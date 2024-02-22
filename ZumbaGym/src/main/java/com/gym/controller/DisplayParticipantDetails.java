package com.gym.controller;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

import com.gym.db.Db;
import com.gym.model.Batch;
import com.gym.model.Participant;

/**
 * Servlet implementation class DisplayParticipantDetails
 */
public class DisplayParticipantDetails extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public DisplayParticipantDetails() {
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
	    Batch b = new Batch();
	    String batch_name = request.getParameter("bname");
	    Db d = new Db();
	    
	    ArrayList<Participant> pbb = d.displayParticipantByBatch(batch_name);
	    StringBuffer bf = new StringBuffer();
	    out.println("<h3>Participant Details in "+batch_name+"</h3>");
	    if(pbb.size()>0) {
	    	bf.append("<table>");
	    	bf.append("<tr>");
	    	bf.append("<th>ID</th>");
	    	bf.append("<th>NAME</th>");
	    	bf.append("<th>DATE OF BIRTH</th>");
	    	bf.append("<th>GENDER</th>");
	    	bf.append("<th>PROFESSION</th>");
	    	bf.append("<th>PHONE NUMBER</th>");
	    	bf.append("<th>ADDRESS</th>");
	    	bf.append("</tr>");
	    	for(Participant p: pbb) {
		    	bf.append("<tr>");
		    	bf.append("<td>"+p.id+"</td>");
		    	bf.append("<td>"+p.name+"</td>");
		    	bf.append("<td>"+p.dob+"</td>");
		    	bf.append("<td>"+p.gender+"</td>");
		    	bf.append("<td>"+p.profession+"</td>");
		    	bf.append("<td>"+p.phno+"</td>");
		    	bf.append("<td>"+p.address+"</td>");
		    	bf.append("</tr>");
	    	}
	    	bf.append("</table>");
	    }
	    
	}

}
