<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Create Product</title>
</head>
<body>
    <jsp:useBean id="p1" class="com.ecommerce.Product" scope="session">
        <jsp:setProperty property="*"  name="p1"/>
        
    </jsp:useBean>
    
    <h3>New Product created successfully</h3>
    <h5>Name:<jsp:getProperty property="name" name="p1"/></h5>
    <h5>Price:<jsp:getProperty property="price" name="p1"/></h5>
</body>
</html>