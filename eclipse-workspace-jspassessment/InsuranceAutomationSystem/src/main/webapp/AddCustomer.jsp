<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<%@taglib prefix="spring" uri="http://www.springframework.org/tags/form" %>
<!--<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %> --> 
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Insurance Application Form</title>
</head>
<style>
body {
    font-family: Arial, sans-serif;
    background-color: #f5f5f5;
    background-image: url('https://prod-sitefinity-library.kappro.com/images/default-source/career-corner/starting-career/whatdoeslifeinsagentdo_09.jpg?sfvrsn=46908fd9_6');
    display: flex;
    justify-content: center;
    align-items: center;
    height: 200vh;
    margin: 0;
}
 
.container {
    background-color: #fff;
    padding: 20px;
    border-radius: 10px;
    box-shadow: 0 4px 8px rgba(0,0,0,0.1);
    width: 400px;
    max-width: 100%;
    animation: fadeIn 1s;
}
 
h1 {
    font-size: 1.5em;
    text-align: center;
    margin-bottom: 20px;
    color: #333;
}
 
form {
    text-align: left;
}
 
input, select {
    width: 100%;
    padding: 8px;
    margin-bottom: 10px;
    border: 1px solid #ccc;
    border-radius: 5px;
    box-sizing: border-box;
    font-size: 16px;
}
 
select {
    appearance: none;
    -webkit-appearance: none;
    -moz-appearance: none;
    background-size: 12px;
    background-position: 100% 50%;
    background-repeat: no-repeat;
}
 
input[type="submit"] {
    background-color: #007bff;
    color: #fff;
    font-size: 16px;
    border: none;
    cursor: pointer;
    padding: 10px 20px;
    border-radius: 5px;
    transition: background-color 0.3s;
}
 
input[type="submit"]:hover {
    background-color: #0056b3;
}
 
@keyframes fadeIn {
    from {
        opacity: 0;
        transform: translateY(-20px);
    }
    to {
        opacity: 1;
        transform: translateY(0);
    }
}
</style>
<body>
<jsp:include page="navbar.jsp"/>
<%int id = Integer.parseInt(session.getAttribute("userId").toString()); %>
<div class="container">
    <h1>Customer Insurance Application Form</h1>
    <spring:form action="/customer/add-customer" method="post" modelAttribute="customer">
        First Name: <spring:input path="custFirstName"/><br>
        Last Name: <spring:input path="custLastName"/><br>
       
        Date of Birth: <spring:input type="date" path="custDob" />  <br>
          Age: <spring:input path="custAge" /><br>
          Gender:
           <form:select path="custGender">
            <form:option value="Male" label="Male"/>
            <form:option value="Female" label="Female"/>
            </form:select>
             
        Email:<spring:input type="email" path="custEmailId" />  <br>
        Phone: <spring:input path="custPhoneNumber" /><br>
        
         Address: <spring:input path="custAddress" /><br>
         National ID:<spring:input path="custNationalId" /><br>
         Marital Status:
            <form:select path="custMaritalStatus">
             <form:option value="Single" label="Single"/>
            <form:option value="Married" label="Married"/>
           
        </form:select><br>
         
          Occupation: <spring:input path="custOccupation"/><br>
         Smoking:
          <form:select path="custSmokingStatus">
             <form:option value="Yes" label="Yes"/>
            <form:option value="No" label="No"/>
            </form:select><br>
        Health Info:
        <spring:input path="custHealthInfo" /><br>
        <spring:input path="user" type="hidden" value="<%=id %>"/>
      <input type="submit" value="Add Customer">
    </spring:form>
    </div>
</body>
</html>