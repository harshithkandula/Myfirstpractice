<%@page import="java.util.ArrayList"%>
<%@page import="com.gym.db.Db"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>SearchParticipant</title>
</head>
<body>
       <%!String searchtype; 
          String participantvalue;
       %>
       <form action="SearchParticipant_v2.jsp" method="post">
           <select name="sortby" id="sb">
                <option value="batch">Batch</option>
                <option value="pp">Participant ID/Name</option>
           </select>
           
           <%
              String stype = request.getParameter("sortby");
             if(stype.equalsIgnoreCase("batch")){
            	 %>
            	 <%@ include file="SearchParticipantsByBatch.jsp"%>
            	 
            	 <% 
             }
             else {
            	 %>
            	 <select name="participantdetails" id="pv">
            	      <option value="">--select--</option>
            	      <option value="name">NAME</option>
            	      <option value="id">ID</option>
            	 </select>
            	 
            	 <% 
            	 String pd = request.getParameter("participantdetails");
            	 if(pd.equalsIgnoreCase("name")){
            		 %>
            		 <%@ include file="SearchParticipantByName.html" %>
            		 <%
            	 }
            	 else{
            		 %>
            		 <%@ include file="SearchParticipantById.jsp" %>
            		 <% 
            	 }
             }
           %>
           <input type="submit" value="search">
       </form>
       
       <%
        
       %>
</body>
</html>