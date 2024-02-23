<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" import="java.util.*"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>JspStuff </title>
</head>
<body>
          
          <c:set var="x" value="200"></c:set>
          <h3>value of x is :<c:out value="${x}"></c:out></h3><br>
          <br>
          <h3></h3><c:if test="${x > 100}"> x is greater than 100</c:if></h3>
     
          <h3>JSTL looping tag demo</h3>
          <c:set var="fruits" value="${['apple','mango','orange','grapes','banana']}"/>
     
     <ul>
         <c:forEach var="fruit" items="${fruits}">
             <li>${fruit}</li>
         </c:forEach>
     </ul>
     <br>
     <br>
     
     <h3>JSP Formatting Tags</h3>
    
     <%! Date date1 = new Date(); %>
     <c:set var="date1" value="<%=new java.util.Date() %>"/>
     <p>Formatted Date:<fmt:formatDate value="${date1}" pattern="dd-MM-yyyy"/></p>
     <p>Formatted Date:<fmt:formatDate value="${date1}" pattern="dd-MMM-yy"/>
     
</body>
</html>