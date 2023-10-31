<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%
if(session.getAttribute("userid")!=null){
%>
<h4>Welcome User </h4>
<h4>Select an option to continue</h4>
<ol>
<li>Deposit Amount</li>
<li>Withdraw Amount</li>
<li>Check Balance</li>
</ol>

<%
} else{
	response.sendRedirect("Login.jsp");
}
%>
<h4>Hello</h4>
</body>
</html>