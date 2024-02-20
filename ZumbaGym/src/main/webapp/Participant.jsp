<%@page import="java.util.ListIterator"%>
<%@page import="com.gym.db.Db"%>
<%@page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Add Participant</title>
</head>
<body>

      <%
        ArrayList<String> batch_names = new ArrayList<String>();
        Db db = new Db();
        batch_names = db.fetchAllBatches();
        
      %>
     <form action="register" method="post">
         <label>Candidate Name</label>
         <input type="text" name="pname"><br>
         <label>Date Of Birth</label>
         <input type="date" name="dob"><br>
         <label>Gender:</label>
         Male<input type="radio" name="gender" value="male">
         Female<Input type="radio" name="gender" value="female">
         <br>
         <label>Batch Name</label>
         <select name="bname">
             <%
                ListIterator l = batch_names.listIterator();
                 while(l.hasNext()){
                	 String dv = l.next().toString();
                	 %>
                <option value=<%=dv%>><%=dv %></option> 
                <%
                 }
             %>
         </select><br>
         <label>Profession</label>
         <input type="text" name="job"><br>
         <label>Contact Number</label>
         <input type="text" name="phno"><br>
         <label>Address</label>
         <textarea name="addr" rows="60" cols="40"></textarea>
         
         <br>
         <br>
         
         <input type="submit" value="register">
    </form>
</body>
</html>