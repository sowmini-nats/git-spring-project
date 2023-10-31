<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ page import="com.demo.ProductQuery,java.util.*" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<jsp:useBean id="prd" class="com.demo.Product" scope="page" />
<jsp:setProperty property="*" name="prd" />
<%
if(session.getAttribute("role")!=null){
String role=session.getAttribute("role").toString();
if(role.equals("Admin")){
ProductQuery pq = new ProductQuery();
int value = pq.insertProduct(prd);
if(value!=0){
%>
<h3>1 record inserted successfully</h3>
<ul>
<li>Prd Id :<jsp:getProperty property="prdId" name="prd"/>
<li>Prd Name :<jsp:getProperty property="prdName" name="prd"/>
<li>Prd Price :<jsp:getProperty property="prdPrice" name="prd"/>
</ul>
<h3><a href="LoginValidate.jsp">Click here for home page</a></h3>
<%
} else{ 
%>
<h4>Error</h4>
<%} }else if(role.equals("User")){ %>

<h4>Access denied. Only admin can add new products</h4>
<%} } else{response.sendRedirect("Login.html");}%>

</body>
</html>