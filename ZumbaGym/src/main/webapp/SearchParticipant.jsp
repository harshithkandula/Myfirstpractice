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
      <form action="dpd"  method="post">
          <select name="sortby" id="sb">
               <option value="">--select--</option>
               <option value="batch">Batch</option>
               <option value="participant">Participant</option>
          </select>
          <script>
              String stype = document.getElementById("sb");
          </script>
          <c:if test="${stype.equals('participant')}">
                  <select  name="searchtypeparticipant" id="stp">
                        <option value="id">ID</option>
                        <option value="name">NAME</option>
                  </select>
                  <script>String pstype = document.getElementById("stp");</script>
                  <c:if test="${pstype.equals('id')}">
                       <label>ID</label>
                       <input type="number" name="pid">
                  </c:if>
                  <c:if test="${pstype.equals('name')}">
                       <label>NAME</label>
                       <input type="text" name="pname">
                  </c:if>
          </c:if>
          
          <c:if test="${stype.equals('batch')}">
               <select name="stb">
                   <option value="">--Select Batch--</option>
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
          </c:if>
        
          <input type="submit" value="search">
      </form>
     <a href="">Click to display list of Participants</a>
</body>
</html>