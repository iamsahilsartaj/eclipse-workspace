<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@page isELIgnored="false" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Successful</title>
</head>
<body>
	
	<h1 class="text-center">${Header }</h1>
	<p class="text-center">${Desc }</p>
	
	<h1>Successfully account created</h1>
	
	<h1>Welcome, ${user.userName }</h1>
	<h1>Your email address is ${user.userEmail }</h1>
	
	<h1>Your password is ${user.password }, try to secure it</h1>
	

</body>
</html>