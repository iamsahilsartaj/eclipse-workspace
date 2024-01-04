<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>About Page</title>
</head>
<body>
	<h1>This is my about page</h1>
	<h1>This about section is controlled by about controller</h1>

	<%
		String about = (String) request.getAttribute("about");
	%>
	<h1>I am a <%=about %></h1>

</body>
</html>