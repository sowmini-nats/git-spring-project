<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Product Page</title>
</head>
<body>
<%
if(session.getAttribute("role")!=null){
String role=session.getAttribute("role").toString();
if(role.equals("Admin")){
%>
	<h1>Enter Product Details</h1>
	<form action="Product.jsp" method="post">
	Product Id: <input type="text" name="prdId"/><br/>
	Prodcut Name: <input type="text" name="prdName"/><br/>
	Prodcut Price: <input type="text" name="prdPrice"/><br/>
	<input type="submit" value="Add"/>
	</form>
<%
} 
else if(role.equals("User")){
%>
<h4>Access Denied. Only admin can add product details.</h4>
<%
}} else{response.sendRedirect("Login.html");}
%>

</body>
</html>