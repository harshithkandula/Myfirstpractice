<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/sql" prefix="sql"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Create Student</title>
</head>
<body>
     <sql:setDataSource var="cms" url="jdbc:mysql://localhost:3306/cms" driver="com.mysql.cj.jdbc.Driver" user="root" password="Ias@2025"/>
     <sql:update dataSource="${cms}" var="count">insert into student values(null,'<%=request.getParameter("first_name") %>','<%=request.getParameter("last_name") %>','<%=request.getParameter("date_of_birth") %>','<%=request.getParameter("enrollment_date") %>','<%=request.getParameter("session_name") %>')</sql:update>
     
     <h3>Inserted <c:out value="${count}"/>  students.</h3>
     <%response.sendRedirect("QueryDemo-v2.jsp"); %>
     
</body>
</html>