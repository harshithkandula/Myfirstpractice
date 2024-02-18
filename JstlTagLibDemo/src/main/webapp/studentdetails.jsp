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
     <sql:query dataSource="${cms}" var="result">Select * from student where student_id =<%=request.getParameter("id") %> </sql:query>
    
    <table border=1>
        <tr>
              <th>student_id</th>
             <th>first_name</th>
             <th>last_name</th>
              <th>date_of_birth</th>
             <th>enrollment_date</th>
             <th>session_name</th>
        </tr>
        
        <c:forEach var="row" items="${result.rows}">
           <tr>  
               <td><c:out value="${row.student_id}"/></td>
               <td><c:out value="${row.first_name}"/></td>
               <td><c:out value="${row.last_name}"/></td>
                <td><c:out value="${row.date_of_birth}"/></td>
               <td><c:out value="${row.enrollment_date}"/></td>
               <td><c:out value="${row.session_name}"/></td>
           </tr>
        </c:forEach>
    </table>
</body>
</html>