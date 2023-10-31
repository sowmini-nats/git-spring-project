<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Policy Premium Form</title>
    <style>
        div {
            width: 400px;
            background-color: pink;
            border: 2px solid white;
            border-radius: 5px;
            margin: 20px;
            padding: 20px;
        }
        h1 {
            font-size: 24px;
            color: blue;
        }
        form {
            width: 80%;
            margin: 0 auto;
        }
        b {
            display: block;
            font-weight: bold;
            margin-top: 10px;
            color: white;
        }
        select, input[type="date"], input[type="text"], input[type="number"] {
            width: 50%;
            padding: 10px;
            margin: 5px 0;
            border: 1px solid #ccc;
            border-radius: 3px;
        }
        option {
            font-weight: bold;
        }
        select {
            appearance: none;
            -webkit-appearance: none;
            -moz-appearance: none;
            background-position: right center;
            background-repeat: no-repeat;
        }
    </style>
</head>
<body>
<jsp:include page="navbar.jsp"/>
<center>
    <h1>Premium Calculator</h1>
    <div>
        <form action="/premium" method="post">
            <b>YOUR AGE</b>
           <input type="number" id="age"/><br>
            <b>POLICY NAME</b>
            <select name="policyName" id="policyname" onchange="myPolicyFunction()">
                <option value="Life">Life Insurance</option>
                <option value="Health">Health Insurance</option>
                <option value="Vehicle">Vehicle Insurance</option>
            </select><br/>
            <b>COVERAGE AMOUNT</b>
            <select name="coverageAmt" id="coverageAmt">
                <option value="2000000">20 Lakhs</option>
                <option value="1500000">15 Lakhs</option>
                <option value="1000000">10 Lakhs</option>
            </select><br>
            <b>POLICY TERM</b>
            <select name="policyTerm" id="policyterm">
                <option value="3">3 Years</option>
            </select><br>
            <b>PAYMENT FREQUENCY</b>
            <select name="paymentFrequency" id="paymentFrequency">
                <option value="Monthly">Monthly</option>
                <option value="Annually">Annually</option>
            </select><br>
            <b>PREMIUM AMOUNT</b> <input id="premiumAmt" type="text" readonly/><br/>
            <input type="submit" value="Calculate" onclick="calculateValue(); return false;"/>
        </form>
    </div>
</center>
<script type="text/javascript">
    function calculateValue() {
    	var name = document.getElementById('policyname').value;
        var policyTerm = parseInt(document.getElementById('policyterm').value);
        var paymentFrequency = document.getElementById('paymentFrequency').value;
        var coverage = parseInt(document.getElementById('coverageAmt').value);
        var age = document.getElementById('age').value;
        var calculatedValue = 0;
 
        if((name == "Health")||(name == "Vehicle")){
        if (paymentFrequency == "Monthly") {
            calculatedValue = coverage / (policyTerm * 12);
        } else if (paymentFrequency == "Annually") {
            calculatedValue = coverage / policyTerm;
        } else {
            calculatedValue = 0;
        }
        }
        else{
      	  if(paymentFrequency=="Monthly"){
      	        calculatedValue=coverage/((60-age)*12);
      	    }
      	    else if(paymentFrequency=="Annually"){
      	        calculatedValue=coverage/(60-age);
      	    }else {
      	      calculatedValue = 0;
      	    }
        }
        calculatedValue = Math.round(calculatedValue * 100) / 100;
        document.getElementById('premiumAmt').value = calculatedValue;
    }
 
    function myPolicyFunction() {
        var age = document.getElementById("age").value;
        var name = document.getElementById('policyname').value;
        var selectElement = document.querySelector('#policyterm');
        selectElement.innerHTML = ''; // Clear existing options
 
        console.log(age);
        if (name == "Health") {
            if (age <= 65 && age >= 51) {
                let newOption1 = new Option('12 years', 12);
                let newOption2 = new Option('10 years', 10);
                let newOption3 = new Option('8 years', 8);
                selectElement.add(newOption1);
                selectElement.add(newOption2);
                selectElement.add(newOption3);
            } else if (age <= 50 && age >= 31) {
                let newOption1 = new Option('20 years', 20);
                let newOption2 = new Option('15 years', 15);
                let newOption3 = new Option('10 years', 10);
                selectElement.add(newOption1);
                selectElement.add(newOption2);
                selectElement.add(newOption3);
            } else if (age <= 30 && age >= 18) {
                let newOption1 = new Option('30 years', 30);
                let newOption2 = new Option('25 years', 25);
                let newOption3 = new Option('20 years', 20);
                selectElement.add(newOption1);
                selectElement.add(newOption2);
                selectElement.add(newOption3);
            }
        } else if (name == "Vehicle") {
            if (age <= 65 && age >= 51) {
                let newOption1 = new Option('11 years', 11);
                let newOption2 = new Option('9 years', 9);
                let newOption3 = new Option('7 years', 7);
                selectElement.add(newOption1);
                selectElement.add(newOption2);
                selectElement.add(newOption3);
            } else if (age <= 50 && age >= 31) {
                let newOption1 = new Option('20 years', 20);
                let newOption2 = new Option('15 years', 15);
                let newOption3 = new Option('10 years', 10);
                selectElement.add(newOption1);
                selectElement.add(newOption2);
                selectElement.add(newOption3);
            } else if (age <= 30 && age >= 18) {
                let newOption1 = new Option('35 years', 30);
                let newOption2 = new Option('30 years', 25);
                let newOption3 = new Option('25 years', 20);
                selectElement.add(newOption1);
                selectElement.add(newOption2);
                selectElement.add(newOption3);
            }
        } else if (name == "Life") {
            let newOption1 = new Option('Full term', 60);
            selectElement.add(newOption1);
        }
    }
</script>
</body>
</html>