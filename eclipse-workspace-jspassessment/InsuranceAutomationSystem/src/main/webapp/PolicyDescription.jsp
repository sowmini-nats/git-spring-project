<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ page import="com.example.demo.model.Policy"%>
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
Policy policy=(Policy)request.getAttribute("policy");
String name = policy.getPolicyStatus();
%>
    <div class="container">
        <h1>Policy Details</h1>

        <div class="policy-detail">
            <span class="label">Policy ID:</span> <%= policy.getPolicyId() %>
        </div>

        <div class="policy-detail">
            <span class="label">Policy Name:</span> <%= policy.getPolicyName() %>
        </div>

        <div class="policy-detail">
            <span class="label">Coverage Amount:</span> <%= policy.getCoverageAmt() %>
        </div>

        <div class="policy-detail">
            <span class="label">Premium Amount:</span> <%= policy.getPremiumAmt() %>
        </div>

        <div class="policy-detail">
            <span class="label">Policy Term:</span> <%= policy.getPolicyTerm() %>
        </div>

        <div class="policy-detail">
            <span class="label">Effective Date:</span> <%= policy.getEffectiveDate() %>
        </div>

        <div class="policy-detail">
            <span class="label">Payment Frequency:</span> <%= policy.getPaymentFrequency() %>
        </div>

        <div class="policy-detail">
            <span class="label">Beneficiary Name:</span> <%= policy.getBeneficiaryName() %>
        </div>

        <div class="policy-detail">
            <span class="label">Customer Name:</span> <%= policy.getCustomer().getCustFirstName()%> <%= policy.getCustomer().getCustLastName()%>
        </div>

        <div class="policy-detail">
            <span class="label">Agent Name:</span> <%= policy.getCustomer().getUser().getFirstName()%> <%= policy.getCustomer().getUser().getLastName()%>
        </div>

        <div class="policy-detail">
            <span class="label">Policy Status:</span> <%= policy.getPolicyStatus() %>
        </div>

        <div class="policy-detail">
            <span class="label">Policy Add-Ons:</span> <%= policy.getPolicyAddOns() %>
        </div>
        <%if(session.getAttribute("role")!=null){
        if(session.getAttribute("role").toString().equals("Manager")){
        if(name.equals("Pending")){ %>
        <a href="/manager-approve-policy/<%= policy.getPolicyId() %>">Approve</a>
        <a href="/manager-reject-policy/<%= policy.getPolicyId() %>">Reject</a>
        <%}}}%>
    </div>
</body>
</html>
