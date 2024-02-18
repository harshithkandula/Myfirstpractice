<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
     <c:set var="x" value="200"></c:set>
     <h3>value of x is :<c:out value="${x}"></c:out></h3><br>
     <br>
     <h3></h3><c:if test="${x > 100}"> x is greater than 100</c:if></h3>
     
     <h3>JSTL looping tag demo</h3>
     <c:set var="fruits" value="${['apple', 'mango', 'orange', 'grapes', 'banana']}"/>
     
     <ul>
         <c:forEach var="fruit" items="${fruits}">
             <li>${fruit}</li>
         </c:forEach>
     </ul>
     
     
     <hr><br>
     <h3>JSTL Formatting examples</h3>
     <%@ taglib uri="http://java.sun.com/jstl/fmt" prefix="fmt" %>
     
     <c:set var="date1" value="<%=new java.util.Date() %>"/>
     <p>Formatted Date dd-mm-yyyy: <fmt:formatDate value="${date1}" pattern="dd-MM-yyyy"/></p>
     <p>Formatted Date dd-mm-yy:<fmt:formatDate value="${date1}" pattern="dd-MMM-yy"/></p>
     
</body>
</html>