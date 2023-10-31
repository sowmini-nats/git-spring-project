<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ page  import="com.example.demo.model.User,java.util.List"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Customer View</title>
    
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
        .animated-table {
            width: 100%;
            border-collapse: collapse;
            animation: fadeIn 1s;
        }
        
        .animated-table th, .animated-table td {
            border: 1px solid #dddddd;
            text-align: center;
            padding: 8px;
        }
        
        .animated-table th {
            background-color: #f2f2f2;
        }
        
        @keyframes fadeIn {
            from {
                opacity: 0;
            }
            to {
                opacity: 1;
            }
        }
         .astyle {
        display: inline-block;
        margin: 10px;
        padding: 10px 20px;
        background-color: #007bff;
        color: #fff;
        text-decoration: none;
        border: none;
        border-radius: 5px;
        font-weight: bold;
        text-align: center;
        text-decoretion:none;
    }
 
    a:hover {
        background-color: #0056b3;
    }
    </style>
<body>
<jsp:include page="navbar.jsp"/>
<center>
<H3>List of Customers</H3>
    <table >
        <thead>
            <tr>
                <th>Customer ID</th>
                <th>First Name</th>
                <th>Last Name</th>
                <th>DOB</th>
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
                <%if(session.getAttribute("role")!=null){
		if(session.getAttribute("role").toString().equals("Agent")){%>
                <th>Action</th>
                <%}} %>
            </tr>
        </thead>
        <tbody>
<c:forEach items="${customerAgentList}" var="item">
<tr>
		<td><c:out value="${item.custId}"/></td>
		<td><c:out value="${item.custFirstName}"/></td>
		<td><c:out value="${item.custLastName}"/></td>
		<td><c:out value="${item.custDob}"/></td>
		<td><c:out value="${item.custAge}"/></td>
		<td><c:out value="${item.custGender}"/></td>
		<td><c:out value="${item.custEmailId}"/></td>
		<td><c:out value="${item.custPhoneNumber}"/></td>
		<td><c:out value="${item.custAddress}"/></td>
		<td><c:out value="${item.custNationalId}"/></td>
		<td><c:out value="${item.custMaritalStatus}"/></td>
		<td><c:out value="${item.custOccupation}"/></td>
		<td><c:out value="${item.custSmokingStatus}"/></td>
		<td><c:out value="${item.custHealthInfo}"/></td>
		<%if(session.getAttribute("role")!=null){
		if(session.getAttribute("role").toString().equals("Agent")){%>
		<td><a class="astyle" href="/policy/add-policy/${item.custId}">Add Policy</a></td>
		<%}} %>
</tr>
</c:forEach>
</tbody>
</table>
<%if(session.getAttribute("role")!=null){
		if(session.getAttribute("role").toString().equals("Agent")){%>
<a class="astyle" href="/customer/add-customer">Add Customer</a>
<%}} %>
</center>
</body>
</html>