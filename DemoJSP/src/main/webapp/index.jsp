<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
        <h1>This is an example of forward action tag of jsp</h1>
        <h2>Forwarding to include-demo.jsp file which has included header.jsp page</h2>
       <jsp:forward page="include-demo.jsp"></jsp:forward>
</body>
</html>