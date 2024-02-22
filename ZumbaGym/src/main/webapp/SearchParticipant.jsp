<%@page import="java.util.ArrayList"%>
<%@page import="com.gym.db.Db"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Search Participant</title>
</head>
<body>
      <form action="dpd"  method="post">
          <select name="sortby">
               <option value="">--select--</option>
               <option value="batch">Batch</option>
               <option value="participant">Participant</option>
          </select>
          
          <%
             String sb = request.getParameter("sortby");
             if(sb == "batch"){
            	 %>
            	 <select name="bname">
            	 <option value="">--batch--</option>
            	 <%
            	   Db d = new Db(); 
            	   ArrayList<String> batches = d.fetchAllBatches();
            	   for(String b: batches){
            		   %>
            		   <option value=<%=b %>><%=b %></option>
            		   <% 
            	   }
            	 %>
            	 </select>
            	 <% 
             }
             else{
            	 
             }
          %>
          <input type="submit" value="search">
      </form>
     <a href="">Click to display list of Participants</a>
</body>
</html>