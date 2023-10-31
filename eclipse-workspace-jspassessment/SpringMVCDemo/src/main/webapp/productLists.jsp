<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ page  import="com.example.demo.model.Product,java.util.List"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>List of products</title>
</head>
<body>
<%List<Product> list = (List<Product>)request.getAttribute("productList"); %>
<table>
   	<thead>
        <tr>
            <th>Product ID</th>
            <th>Product Name</th>
            <th>Product Price</th>
        </tr>
    </thead>
    <tbody>
        <% for(Product prd:list){%>
            <tr>
                <td><%=prd.getPrdId()%></td>
                <td><%=prd.getPrdName()%></td>
                <td><%=prd.getPrdPrice()%></td>
            </tr>
        <%} %>
    </tbody>
</table>
<table>
   	<thead>
        <tr>
            <th>Product ID</th>
            <th>Product Name</th>
            <th>Product Price</th>
        </tr>
    </thead>
    <tbody>
        <c:forEach items="${productList}" var="item">
                    <tr>
                        <td><c:out value="${item.prdId}"/></td>
                       	<td><c:out value="${item.prdName}"/></td>
                       	<td><c:out value="${item.prdPrice}"/></td>
                    </tr>
                </c:forEach>
    </tbody>
</table>
</body>
</html>