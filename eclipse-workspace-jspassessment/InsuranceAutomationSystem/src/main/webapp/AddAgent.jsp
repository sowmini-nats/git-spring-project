<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@taglib prefix="spring" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insurance Agent Form</title>
<style>
   body {
    font-family: Arial, sans-serif;
    background-color: #f4f4f4;
    margin: 0;
    padding: 0;
    align-items: center;
}
 
form {
    background-color: #fff;
    border: 1px solid #ccc;
    border-radius: 5px;
    box-shadow: 0 0 10px rgba(0, 0, 0, 0.2);
    padding: 20px;
    max-width: 400px;
    width: 100%;
    text-align: left;
}
 
h1 {
    text-align: center;
    color: #0056b3;
}
 
label {
    font-weight: bold;
    display: block;
    margin-bottom: 8px;
}
 
input[type="text"],
input[type="password"] {
    width: 90%;
    padding: 10px;
    margin-bottom: 10px;
    border: 1px solid #ccc;
    border-radius: 5px;
    font-size: 16px;
}
 
input[type="submit"] {
    background-color: #007BFF;
    color: #fff;
    border: none;
    border-radius: 5px;
    padding: 10px 20px;
    cursor: pointer;
    font-size: 16px;
}
 
input[type="submit"]:hover {
    background-color: #0056b3;
}
 
</style>
</head>
<body>
 <jsp:include page="navbar.jsp"/>
<h1>Insurance Agent Form</h1>
 
<spring:form action="/add-agent" method="post" modelAttribute="user">
 
    <label>Agent First Name:</label>
    <spring:input path="firstName"/><br/><br/>
 
    <label>Agent Last Name:</label>
    <spring:input path="lastName"/><br/><br/>
 
    <label>Age:</label>
    <spring:input path="age"/><br/><br/>
 
    <label>Email ID:</label>
    <spring:input path="emailId"/><br/><br/>
 
    <label>Address:</label>
    <spring:input path="address"/><br/><br/>
 
    <label>Phone Number:</label>
    <spring:input path="phoneNumber"/><br/><br/>
    
    <label>Password:</label>
    <spring:input path="password"/><br/><br/>
    <spring:input path="role" value="Agent" type="hidden"/><br/><br/>
    <spring:input path="status" value="Active" type="hidden"/><br/><br/>
 
    <input type="submit" value="Add Agent">
</spring:form>
 
</body>
</html>