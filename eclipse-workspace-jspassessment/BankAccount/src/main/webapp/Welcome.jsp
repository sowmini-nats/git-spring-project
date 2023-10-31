<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Welcome</title>
</head>
<body>
<%if(session.getAttribute("userid")!=null){ 
int id=Integer.parseInt(session.getAttribute("userid").toString());
%>
<h4>Welcome User </h4>
<h4>Select an option to continue</h4>
<ol>
<li><a href="Deposit.jsp">Deposit Amount</a></li>
<li><a href="Withdraw.jsp">Withdraw Amount</a></li>
<li><a href="FundTransfer.jsp">Fund Transfer</a></li>
<li><a href="BalanceServlet">Check Balance</a></li>
</ol>
<a href="Logout.jsp">Logout</a>
<%} else{%>
<h4>Welcome to our bank</h4>
<h4>Select an option to continue</h4>
<ol>
<a href="Login.jsp"><li>Sign-in</li></a>
<a href="Register.jsp"><li>Register</li></a>
</ol>
<%} %>
</body>
</html>