<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Register</title>
</head>
<body>
<h4>Register</h4>
<form action="RegisterValidateServlet" method="post">
Enter user id: <input type="text" name="id"/><br/><br/>
Enter user name: <input type="text" name="name"/><br/><br/>
Enter password: <input type="text" name="password"/><br/><br/>
Select account type: <select name="acctype">
<option>Savings</option>
<option>Current</option>
</select>
<br/><br/>
Enter branch name: <input type="text" name="branch"/><br/><br/>
<input type="submit" value="Register"/>
</form>
</body>
</html>