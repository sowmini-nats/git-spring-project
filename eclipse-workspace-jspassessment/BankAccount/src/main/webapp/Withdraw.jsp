<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Withdraw amount</title>
</head>
<body>
<%if(session.getAttribute("userid")!=null){
	int userid=Integer.parseInt(session.getAttribute("userid").toString());
%>
<form action="WithdrawServlet" method="post">
Enter amount: <input type="text" name="amount"/><br/><br/>
<input type="submit" value="Withdraw"/>
</form>
<%} else {response.sendRedirect("Welcome.jsp");}%>
</body>
</html>