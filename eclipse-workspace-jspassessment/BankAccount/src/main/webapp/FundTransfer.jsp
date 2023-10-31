<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Fund Transfer</title>
</head>
<body>
<%if(session.getAttribute("userid")!=null){
	int userid=Integer.parseInt(session.getAttribute("userid").toString());
%>
<form action="FundTransferServlet" method="post">
Enter account id: <input type="text" name="fundid"/><br/><br/>
Enter amount: <input type="text" name="amount"/><br/><br/>
<input type="submit" value="Transfer"/>
</form>
<%} else {response.sendRedirect("Welcome.jsp");}%>
</body>
</html>