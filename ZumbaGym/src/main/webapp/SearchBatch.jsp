<%@page import="com.gym.model.Batch"%>
<%@page import="com.gym.db.Db"%>
<%@page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Search Batch</title>
</head>
<body>

     <%
         ArrayList<String> batches = new ArrayList<String>();
         Db d = new Db();
         batches = d.fetchAllBatches();
     %>
     <form action="sb" method="post">
          <select name="bname">
                <option value="">--select--</option>
                <%
                   for(String batch: batches){
                	   %>
                <option value=<%=batch %>><%=batch%></option>
                <%
                   }
                %>
          </select>
          <input type="submit" value="search">
     </form>
     
     <a href="dab">Display All Batch Details</a>
     
</body>
</html>