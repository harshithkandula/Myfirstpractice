package com.gym.controller;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

import com.gym.db.Db;
import com.gym.model.Batch;

/**
 * Servlet implementation class Batch
 */
public class BatchServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public BatchServlet() {
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
		b.batchId = request.getParameter("bid");
		b.batchName = request.getParameter("bname");
		b.timings = request.getParameter("btiming");
		String strength = request.getParameter("strength");
		b.strength = Integer.valueOf(strength);
		b.startdate = request.getParameter("sdate");
		
		Db db = new Db();
		int res = db.addBatch(b);
		
		if(res > 0) {
			String htmlRes = "<h1>New Batch Starting Soon on "+b.startdate+"</h1><br><a href='Participant.html'>Click Here For Batch Details</a>";
			out.println(htmlRes);
			
			out.println("<h2>Batch Details</h2>");
			out.print("<table><tr>");
			out.print("<td>Name</td>");
			out.print("<td>"+b.batchName+"</td></tr>");
			out.print("<tr><td>ID</td>");
			out.print("<td>"+b.batchId+"</td></tr>");
			out.print("<tr><td>Timings</td>");
			out.print("<td>"+b.timings+"</td></tr>");
			out.print("<tr><td>Strength</td>");
			out.print("<td>"+b.strength+"</td></tr>");
			out.print("<tr><td>Start Date</td>");
			out.print("<td>"+b.startdate+"</td></tr>");
			
		}
		else {
			out.println("<h2>Batch not created</h2>");
		}
		
		
	}

}
