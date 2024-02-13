package com.cms;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

import org.apache.catalina.tribes.util.Arrays;

/**
 * Servlet implementation class AddBatchServlet
 */

@WebServlet(urlPatterns = {"/addbatch"})
public class AddBatchServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AddBatchServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		
		String bname = request.getParameter("batch-name");
		String iname = request.getParameter("instructor-name");
		String sdate = request.getParameter("start-date");
		String edate = request.getParameter("end-date");
		String btype = request.getParameter("batch-type");
		String[] br = request.getParameterValues("requirements");
		
		out.print("<p>New Batch Starting soon</p>");
		out.printf("<p>Batch Details: <br> Batch name = %s <br> Instructor name = %s <br> Start date = %s <br> End Date = %s <br> Batch type = %s <br> Batch Requirements = %s</p>", bname, iname, sdate, edate, btype, Arrays.toString(br));
		out.close();
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
		/*response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		
		String bname = request.getParameter("batch-name");
		String iname = request.getParameter("instructor-name");
		String sdate = request.getParameter("start-date");
		String edate = request.getParameter("end-date");
		String btype = request.getParameter("batch-type");
		
		out.print("<p>New Batch Starting soon</p>");
		out.printf("<p>Batch Details: <br> Batch name = %s <br> Instructor name = %s <br> Start date = %s <br> End Date = %s <br> Batch type = %s</p>", bname, iname, sdate, edate, btype);
		out.close();*/
	}

}
