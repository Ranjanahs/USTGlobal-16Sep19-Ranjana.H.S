
<%@page import="com.ustglobal.springmvc.dto.Product"%>
<%@page import="com.ustglobal.springmvc.dto.Retailer"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%
Retailer bean = (Retailer) session.getAttribute("bean");
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<a href="./changepassword">Change password</a>
	<a href="./update">update profile</a>
	
	<a href="./logout">logout</a>
	<h3>
		Welcome :<%=bean.getName() %></h3>
	<fieldset>

		<legend>HOME</legend>
		<form action="./search">
			<table>
				<tr>

					<td>ID:</td>
					<td><input type="number" name="pid"></td>
					<td><input type="submit" name="search"></td>
				</tr>


			</table>
		</form>
	</fieldset>
	<%
	Product employeeBean = (Product) request.getAttribute("bean");
	%>
	<%
		if (employeeBean != null) {
		%>
	<table>
		<tr>
	        <th>pid</th>	
			<th>PName</th>
			<th>Price</th>
			<th></th>
			
		</tr>

		<tr>
		     <td><%=employeeBean.getPid()%></td>
			<td><%=employeeBean.getPName()%></td>
			<td><%=employeeBean.getPrice()%></td>
			<td><a href="./buy">buy</a>
			
		</tr>
	</table>
	<%} %>
	
	<h3>${msg}</h3>
</body>
</html>