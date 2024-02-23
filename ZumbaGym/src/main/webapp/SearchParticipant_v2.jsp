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
       <form action="dpv" method="post">
           <select name="sortby" id="sb">
                <option value="batch">Batch</option>
                <option value="pp">Participant ID/Name</option>
           </select>
           <script>
                searchtype = document.getElementById("sb").value;
           </script>
           <%
        
             if(searchtype.equalsIgnoreCase("batch")){
            	 %>
            	 <select name="bn">
            	       <option>--select batch--</option>
            	       <%
            	         Db d = new Db();
            	         ArrayList<String> bl = d.fetchAllBatches();
            	         for(String b: bl){
            	        	 %>
            	        	 <option value=<%=b %>><%=b %></option>
            	        	 <%
            	         }
            	       %>
            	 </select>
            	 <% 
             }
             else {
            	 %>
            	 <select name="participantdetails" id="pv">
            	      <option value="">--select--</option>
            	      <option value="name">NAME</option>
            	      <option value="id">ID</option>
            	 </select>
            	 <script type="text/javascript">
            	 participantvalue = document.getElementById("pv").value;
            	 </script>
            	 <% 
            	 if(participantvalue.equalsIgnoreCase("name")){
            		 %>
            		 <label>NAME</label>
            		 <input type="text" name="pname" placeholder="Enter participant Name">
            		 <%
            	 }
            	 else{
            		 %>
            		 <label>ID</label>
            		 <input type="number" name="pid" placeholder="Enter Participant Id">
            		 <% 
            	 }
             }
           %>
       </form>
</body>
</html>