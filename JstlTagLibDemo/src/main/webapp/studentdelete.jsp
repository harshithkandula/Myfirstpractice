<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://java.sun.com/jstl/core" prefix="c" %>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/sql" prefix="sql" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
    <sql:setDataSource var="cms" url="jdbc:mysql://localhost:3306/cms" driver="com.mysql.cj.jdbc.Driver" user="root" password="Ias@2025"/>
    <sql:update dataSource="${cms}" var="result">delete from student where student_id =<%=request.getParameter("id") %> </sql:update>
</body>
</html>