<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
       <h1>Hail Republic Of India</h1>
       <%
         int age = 24; 
         if(age>=18){ %>
        	 <h4>You are eligible to vote</h4>
       <%   }
         else{ %>
        	 <h4>Sorry, Your age is below permissable age to vote</h4>
       <%   }
       %>
      
</body>
</html>