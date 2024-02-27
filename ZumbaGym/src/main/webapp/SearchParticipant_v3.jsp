<%@page import="java.util.ArrayList"%>
<%@page import="com.gym.db.Db"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Search Participant</title>
</head>
<body>
      <form action="DisplayParticipantDetails.jsp"  method="post">
          <select name="sortby" id="sb">
               <option value="">--select--</option>
               <option value="batch">Batch</option>
               <option value="participantid">Participant ID</option>
               <option value="pname">Participant Name</option>
          </select>
          
        
          <input type="submit" value="search">
      </form>
      <br>
      <br>
     <a href="ParticipantDetails.jsp">Click to display list of Participants</a>
</body>
</html>