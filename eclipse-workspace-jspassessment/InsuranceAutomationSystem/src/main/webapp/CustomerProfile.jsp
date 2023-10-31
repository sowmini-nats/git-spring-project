<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ page import="com.example.demo.model.Customer"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Policy Report</title>
    <style>
        body {
            font-family: Arial, sans-serif;
            background-color: #f5f5f5;
            margin: 0;
            padding: 20px;
        }

        .policy-detail {
            margin: 10px;
        }

        .label {
            font-weight: bold;
            color: #333;
        }

        .policy-detail span {
            font-weight: normal;
        }

        .policy-detail a {
            text-decoration: none;
            color: #007bff;
            margin-left: 10px;
        }

        .policy-detail a:hover {
            text-decoration: underline;
        }

        h1 {
            font-size: 1.5em;
            text-align: center;
            margin-bottom: 20px;
            color: #333;
        }

        .container {
            background-color: #fff;
            border-radius: 10px;
            box-shadow: 0 4px 8px rgba(0, 0, 0, 0.1);
            padding: 20px;
            max-width: 600px;
            margin: 0 auto;
        }

    </style>
</head>
<body>
<jsp:include page="navbar.jsp"/>
<%
Customer customer=(Customer)request.getAttribute("customer");
%>
    <div class="container">
        <h1>Your Profile</h1>

        <div class="policy-detail">
            <span class="label">Customer ID:</span> <%= customer.getCustId() %>
        </div>

        <div class="policy-detail">
            <span class="label">Customer Name:</span> <%= customer.getCustFirstName() %> <%= customer.getCustLastName() %>
        </div>

        <div class="policy-detail">
            <span class="label">Date Of Birth:</span> <%=customer.getCustDob() %>
        </div>

        <div class="policy-detail">
            <span class="label">Age:</span> <%=customer.getCustAge() %>
        </div>

        <div class="policy-detail">
            <span class="label">Gender:</span> <%= customer.getCustGender() %>
        </div>

        <div class="policy-detail">
            <span class="label">Email ID:</span> <%= customer.getCustEmailId() %>
        </div>

        <div class="policy-detail">
            <span class="label">Phone Number:</span> <%= customer.getCustPhoneNumber() %>
        </div>

        <div class="policy-detail">
            <span class="label">Address:</span> <%= customer.getCustAddress() %>
        </div>

        <div class="policy-detail">
            <span class="label">National ID:</span> <%= customer.getCustNationalId() %>
        </div>

        <div class="policy-detail">
            <span class="label">Marital Status:</span> <%= customer.getCustMaritalStatus() %>
        </div>

        <div class="policy-detail">
            <span class="label">Occupation:</span> <%= customer.getCustOccupation() %>
        </div>

        <div class="policy-detail">
            <span class="label">Smoking Status:</span> <%= customer.getCustSmokingStatus() %>
        </div>
        
        <div class="policy-detail">
            <span class="label">Health Information:</span> <%= customer.getCustHealthInfo() %>
        </div>
    </div>
</body>
</html>
