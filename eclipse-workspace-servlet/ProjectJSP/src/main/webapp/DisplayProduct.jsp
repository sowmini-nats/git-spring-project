<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ page import="com.demo.ProductQuery,java.util.*,com.demo.Product" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Product Details</title>
</head>
<body>
<%
if(session.getAttribute("role")!=null){
String role=session.getAttribute("role").toString();
if(role.equals("Admin")||role.equals("User")){
%>

<h4>List of all products</h4>
<%
ProductQuery pq = new ProductQuery(); 
List<Product> productList = pq.getProducts();
%>	
    <table>
    <thead>
    	<th>Product ID</th>
    	<th>Product Name</th>
    	<th>Product Price</th>
    </thead>
    <tbody>
    <% for(Product p:productList){  %>
    <tr>
    	<td><%=p.getPrdId()%></td>
    	<td><%=p.getPrdName()%></td>
    	<td><%=p.getPrdPrice()%></td>
    </tr>
    <%} %>
    </tbody>
    </table>
<%
} }else{response.sendRedirect("Login.html");}
%>
</body>
</html>