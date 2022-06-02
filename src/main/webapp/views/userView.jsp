<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<h1><font color="green">${msg}</font></h1>
	<form:form action="user" method="POST" modelAttribute="user">
	Name: <form:input type="text" path="uname" />
			<br />
	Email: <form:input type="text" path="email" />
			<br />
	Phone: <form:input type="text" path="phno" />
			<br />
		<input type="submit" value="Submit">
	</form:form>

</body>
</html>