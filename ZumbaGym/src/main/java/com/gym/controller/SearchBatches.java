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

/**
 * Servlet implementation class SearchBatches
 */
public class SearchBatches extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public SearchBatches() {
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
		
		String batch_name = request.getParameter("bname");
		
		//Batch b = new Batch();
		Db dbs = new Db();
		ArrayList<Batch> b = dbs.fetchBatchDetails(batch_name);
		out.println("<h4>Batch Details</h4>");
		if(b.size()>0) {
			for(Batch bat: b) {
				out.println("<p>Batch ID: "+bat.batchId+"</p>");
				out.println("<p>Batch Name: "+bat.batchName+"</p>");
				out.println("<p>Timings: "+bat.timings+"</p>");
				out.println("<p>Strength: "+bat.strength+"</p>");
				out.println("<p>Start Date: "+bat.startdate+"</p>");
			}
		}
		else {
			out.println("<h4>Batch Details Not Found</h4>");
		}
		out.close();
	}

}
