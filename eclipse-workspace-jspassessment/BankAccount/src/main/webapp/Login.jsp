<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Bank Login</title>
</head>
<body>
<center>
<h3>ABC Bank</h3>
<form action="LoginValidateServlet" method="post">
User ID <input type="text" name="id"/><br/><br/>
Password <input type="password" name="password"/><br/><br/>
<input type="submit" value="Login"/>
</form>
</center>
</body>
</html>