<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@page isELIgnored="false" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Home Page</title>
</head>
<body>
	<h1>This is Home Page</h1>
	<h1>This page is called by home controller</h1>
	
	<!-- 	Scripted tag 	-->
	<%
		/* String name = (String) request.getAttribute("name");
		List<String> friends = (List<String>) request.getAttribute("f"); */
	%>
	
	<h1>My name is ${name }</h1>
	
	<h1>My friends are: </h1>
	<c:forEach var="item" items="${f }">
		<h2>${item }</h2>
	</c:forEach>



</body>
</html>