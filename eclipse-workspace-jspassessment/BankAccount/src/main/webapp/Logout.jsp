<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%if(session.getAttribute("userid")!=null) {
session.invalidate();
response.sendRedirect("Welcome.jsp");
}
else {
	response.sendRedirect("Welcome.jsp");
} %>
</body>
</html>