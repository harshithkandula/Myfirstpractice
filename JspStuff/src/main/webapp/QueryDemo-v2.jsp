<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/sql" prefix="sql" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
     <sql:setDataSource var="cms" url="jdbc:mysql://localhost:3306/cms" driver="com.mysql.cj.jdbc.Driver" user="root" password="Ias@2025"/>
    <sql:query dataSource="${cms}" var="result">Select * from student</sql:query>
    <table border=1>
        <tr>
             <th>first_name</th>
             <th>Show Details</th>
             <th>Delete</th>
             <th>Edit</th>
             
        </tr>
        
        <c:forEach var="row" items="${result.rows}">
           <tr>  
               <td><c:out value="${row.first_name}"/></td>
               <td><a href="StudentDetails.jsp?id=${row.student_id}">Show Details</a></td>
               <td><a href="DeleteStudent.jsp?id=${row.student_id}">DELETE</a></td>
               <td><a href="EditStudent.html?id=${row.student_id}">Edit</a></td>
               
           </tr>
        </c:forEach>
    </table>
</body>
</html>