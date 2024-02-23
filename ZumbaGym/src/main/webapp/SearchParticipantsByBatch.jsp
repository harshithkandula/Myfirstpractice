<%@page import="com.gym.db.Db"%>
<%@page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>SearchParticipantsByBatch</title>
</head>
<body>
     <%
        Db d = new Db();
        ArrayList<String> batch = new ArrayList<String>();
        batch = d.fetchAllBatches();
     %>
     <form action="dppb" method="post">
         <select name="b_name">
              <option value="">--select batch--</option>
              <%
                if(batch.size()>0){
                	for(String b: batch){
                		%>
                		<option value=<%=b %>><%=b %></option>
                		<% 
                	}
                }
                
              %>
         </select>
         <input type="submit" value="proceed">
     </form>
</body>
</html>