<%@page import="com.companyname.entity.Employee"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<table border="1">
	<tr>
		<th>Employee Id</th>
		<th>Employee Name</th>
		<th>Email Id</th>
		<th>Contact Number</th>
		<th>Password</th>
	</tr>
	<tr>
		<td>${emp.employeeId}</td>
		<td>${emp.employeeName}</td>
		<td>${emp.emailId}</td>
		<td>${emp.contactNumber}</td>
		<td>${emp.password}</td>
	</tr>
</table>


<%-- <h3><%= request.getAttribute("employee") %></h3> --%>
</body>
</html>