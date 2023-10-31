<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
    <title>Bank Account Creation</title>
    
</head>
<style>@charset "ISO-8859-1";
.container {
    max-width: 400px;
    margin: 0 auto;
    padding: 20px;
    border: 1px solid #ccc;
    background-color: #ffffff;
    border-radius: 8px;
    box-shadow: 0 4px 8px rgba(0, 0, 0, 0.1);
}
 
/* Style for headings */
h1 {
    text-align: center;
    font-size: 24px;
}
 
.select-wrapper {
  position: relative;
  display: inline-block;
}
 
.select-wrapper select {
  padding: 10px;
  font-size: 16px;
  border: 1px solid #ccc;
  border-radius: 5px;
  background-color: #f8f8f8;
  color: #333;
  appearance: none;
  -webkit-appearance: none;
  -moz-appearance: none;
}
 
.select-wrapper select::-ms-expand {
  display: none;
}
 
.select-wrapper::after {
  content: '\25BC';
  position: absolute;
  top: 50%;
  right: 10px;
  transform: translateY(-50%);
  pointer-events: none;
}
 
/* Style for input fields and labels */
form input, form label {
    display: block;
    margin: 10px 0;
    width: 100%;
    padding: 10px;
    border: 1px solid #ccc;
    border-radius: 4px;
    box-sizing: border-box;
    font-size: 16px;
}
 
/* Style for submit button */
form input[type="submit"] {
    background-color: #4CAF50;
    color: white;
    padding: 10px 20px;
    border: none;
    border-radius: 4px;
    cursor: pointer;
    font-size: 16px;
}
 
form input[type="submit"]:hover {
    background-color: #45a049;
}
 
</style>
<body>
<div class=container>
    <h1>Welcome to the  BOI Insurance</h1>
    <form action="/login" method="post">
    <div class="select-wrapper">
  <select name="path">
    <option>Staff</option>
    <option>Customer</option>
  </select>
</div>
<br><br>
    
        User ID: <input type="text" name="userId" required><br>
        Password: <input type="password" name="password" required><br>
        <input type="submit" value="Submit">
    </form>
    </div>
</body>
</html>
 