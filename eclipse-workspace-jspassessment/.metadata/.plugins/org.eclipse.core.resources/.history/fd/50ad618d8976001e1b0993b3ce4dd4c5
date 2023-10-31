<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
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
    height: 100vh;
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
<div class="container">
    <h1>Customer Insurance Application Form</h1>
    <form action="form" method="post">
        First Name: <input type="text" name="first_name" required><br>
        Last Name: <input type="text" name="last_name" required><br>
        Email: <input type="email" name="email" required><br>
        Phone: <input type="text" name="phone" required><br>
        Date of Birth: <input type="date" name="dob" required><br>
        Type Of Insurance:
        <select name="insurance_type" required>
            <option value="Life">Life Insurance</option>
            <option value="Health">Health Insurance</option>
            <option value="Vehicle">Vehicle Insurance</option>
            <option value="Child Care">Child Care Insurance</option>
            <option value="Home Care">Home Insurance</option>
            
            
            <!-- Add more options as needed -->
        </select><br>
        <input type="submit" value="Submit">
    </form>
    </div>
</body>
</html>
