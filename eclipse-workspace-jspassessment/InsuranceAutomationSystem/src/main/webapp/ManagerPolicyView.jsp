<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Customer Policy Details</title>
</head>
<style>
table {
        border-collapse: collapse;
        width: 80%;
        margin: 20px auto;
        box-shadow: 0 4px 8px rgba(0,0,0,0.1); /* Add shadow */
        border: 1px solid #ccc; /* Add border */
    }
    th, td {
        border: 1px solid #ccc;
        padding: 8px;
        text-align: center;
        transition: background-color 0.3s; /* Add transition */
    }
 
    tr:nth-child(even) {
        background-color: #f2f2f2;
    }
 
    th {
        background-color: #4CAF50;
        color: white;
    }
 
    th:hover, td:hover {
        background-color: #f9f9f9; /* Change color on hover */
    }
</style>

<body>
<jsp:include page="navbar.jsp"/>
<center>
<h3>List of Customers</h3>
	<table >
        <thead>
            <tr>
            	<th>Customer ID</th>
                <th>First Name</th>
                <th>Last Name</th>
                <th>Age</th>
                <th>Gender</th>
                <th>Email ID</th>
                <th>Phone Number</th>
                <th>Address</th>
                <th>National ID</th>
               	<th>Marital Status</th>
               	<th>Occupation</th>
               	<th>Smoking Status</th>
               	<th>Health Info</th>
               	<th>Action</th>
            </tr>
        </thead>
        <tbody>
<c:forEach items="${policyList}" var="item">
<tr>
		<td><c:out value="${item.customer.custId}"/></td>
		<td><c:out value="${item.customer.custFirstName}"/></td>
		<td><c:out value="${item.customer.custLastName}"/></td>
		<td><c:out value="${item.customer.custAge}"/></td>
		<td><c:out value="${item.customer.custGender}"/></td>
		<td><c:out value="${item.customer.custEmailId}"/></td>
		<td><c:out value="${item.customer.custPhoneNumber}"/></td>
		<td><c:out value="${item.customer.custAddress}"/></td>
		<td><c:out value="${item.customer.custNationalId}"/></td>
		<td><c:out value="${item.customer.custMaritalStatus}"/></td>
		<td><c:out value="${item.customer.custOccupation}"/></td>
		<td><c:out value="${item.customer.custSmokingStatus}"/></td>
		<td><c:out value="${item.customer.custHealthInfo}"/></td>
		<td><a href="/manager-customerpolicy/${item.policyId}">View Policy</a></td>
</tr>
</c:forEach>
</tbody>
</table>
</center>
</body>
</html>