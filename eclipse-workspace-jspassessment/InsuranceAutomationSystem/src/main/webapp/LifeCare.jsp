<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Home</title>
<style>
    body {
        font-family: arial;
        background-color: #f4f4f4;
        margin: 0;
        padding: 0;
    }
 
    .container {
        max-width: 800px;
        margin: 0 auto;
        background-color:orange;
        border: 1px solid black;
        border-radius: 5px;
        box-shadow: 0 4px 6px rgba(0, 0, 0, 0.1);
        padding: 20px;
        font-size: 20px;
        text-align:justify;
        color:white;
    }
    .benefit {
        max-width: 800px;
        margin: 0 auto;
        background-color: orange;
        border: 1px solid black;
        border-radius: 5px;
        box-shadow: 0 4px 6px rgba(0, 0, 0, 0.1);
        padding: 20px;
        font-size: 20px;
        text-align:justify;
        color:white;
    }
    .feature {
        max-width: 800px;
        margin: 0 auto;
        background-color: orange;
        border: 1px solid black;
        border-radius: 5px;
        box-shadow: 0 4px 6px rgba(0, 0, 0, 0.1);
        padding: 20px;
        font-size: 20px;
        text-align:justify;
        color:white;
    }
 
    h1 {
        font-size: 28px;
        color:black;
        text-align: center;
    }
 
    .content {
        font-size: 20px;
        line-height: 1.6;
        color:white;
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
    }
 
    a:hover {
        background-color: #0056b3;
    }
    
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
</head>
<body>
<jsp:include page="navbar.jsp"/>
<center>
<div>
    <h1>Life Insurance</h1>
    </div>
    <div class="container">
    <p class="content">Life insurance is defined as a legally binding contract between a policyholder and an insurer in which the insurance company provides financial protection to the policyholder and pays a death benefit to the nominee when the insured dies. For a life insurance policy to remain in force, the policyholder must pay regular premiums over the period of time or pay a single premium upfront.</p>
</div>
<br>
<h1>Benefits</h1>
 
<h2 >Financial Security</h2>
<div class="benefit">All of us have some financial liabilities, but an adequate life insurance cover ensures that your debts or loved ones will be financially taken care of in the event of your death</div>
<h2>Wealth Creation </h2>
<div class="benefit">Some life insurance plans also offer you the opportunity to create wealth. Apart from life cover, these policies invest your premium in different investment classes to deliver superior risk-adjusted returns that beat inflation and grow your corpus</div>
<h2>Tax Savings </h2>
<div class="benefit">Life insurance plans offer dual tax benefits. The premiums paid offer tax deduction under Section 80C of the Income Tax Act. This means up to  1.5 lakh premium paid annually is deducted from your gross income, thus lowering your tax outgo.</div>
<h2>Buy Young, Save More</h2>
<div class="benefit">Life insurance plans give you the ability to lock in low premium rates while you are young. If you buy the same policy when you are older, you will be paying a much higher premium compared to if you bought the same plan when you were younger. For example, in case of the term insurance plan ICICI Pru iProtect Smart, a 20-year old male buying a 1 crore term plan for 30 years coverage will have to pay rup 7404 its for a regular income payout.</div>
<h2>Death benefit</h2>
<div class="benefit">In the unfortunate event of the demise of the policyholder, the policy nominee receives the entire sum assured amount as long as the premiums have been paid in full.</div>
 
<br>
 
<h1>Features</h1><br>
<h2>Policyholder</h2><div class="feature">Policyholder is the individual who pays the premium for the life insurance policy and signs a life insurance contract with a life insurance company.</div>
<h2>Maturity </h2><div class="feature">Maturity is the stage at which the policy term is completed and the life insurance contract ends.</div>
<h2>Insured</h2> <div class="feature">Insured is the individual whose life is secured via the life insurance.</div>
<h2>Sum Assured</h2> <div class="feature"></h2> The amount the insurance company pays the dependents of the insured if those events occur which are specified in the life insurance contract.</div>
<h2>Claim</h2> <div class="feature"> On the insured's demise, the nominees can file a claim with the insurance provider in order to receive the predetermined payout amount</div>
<h2>Premium</h2><div class="feature">A premium is the cost the policyholder pays the life insurance company for covering his/her life.</div>
</center>
 
 
 
<table>
    <tr>
    <th>Coverage Amount</th>
    <th>Age</th>
    <th>Policy Term</th>
    </tr>
    <tr>
    <td rowspan="3">10,00,000 - 20,00,000</td>
    <td>18 - 30</td>  
    <td rowspan="3">Full</td></tr>
    <tr><td>31 - 50</td></tr>
    <tr><td>51 - 65</td></tr>
    
</table>
</body>
</html>