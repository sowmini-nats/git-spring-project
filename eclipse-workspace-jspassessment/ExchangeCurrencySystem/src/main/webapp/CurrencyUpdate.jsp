<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Update Currency</title>
</head>
<body>
<% if(session.getAttribute("userId")!=null){ 
int id=Integer.parseInt(session.getAttribute("userId").toString());%>
<div>
<spring:form action="/updateRate" method="post" modelAttribute="exchange">
	Enter ID <input type="number" name="id"/><br/><br/>
	From currency <input type="text" name="fromCurrency"/><br/><br/>
	To currency <input type="text" name="toCurrency"/><br/><br/>
	Exchange Rate <input type="number" name="exchangeRate"/><br/><br/>
	<input type="submit" value="Update"/>
</spring:form>
</div>

<%} else{response.sendRedirect("HomePage.jsp");}%>
</body>
</html>