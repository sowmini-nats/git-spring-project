<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<center><h1>Curreny Exchange System</h1></center>
<% if(session.getAttribute("userId")!=null){ 
int id=Integer.parseInt(session.getAttribute("userId").toString());%>
<h3>Select an option</h3>
<ul>
<li><a href="/add-rate">Add exchange rate</a></li>
<li><a href="/update-rate">Update exchange rate</a></li>
</ul><br/>
<a href="/logout">Logout</a>

<%} else{%>
<div>
	<button style="align:right"><a href="/login">Login</a></button>
<form action="/calculaterate" method="post">
	From currency <input type="text" name="from"/><br/><br/>
	To currency <input type="text" name="to"/><br/><br/>
	Enter Amount <input type="number" name="amount"/><br/><br/>
	<input type="submit" value="Calculate amount"/>
</form>
</div>
<%} %>
</body>
</html>