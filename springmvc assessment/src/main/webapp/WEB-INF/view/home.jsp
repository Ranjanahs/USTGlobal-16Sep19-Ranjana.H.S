<%@page import="com.ustglobal.springmvc.dto.RetailerBean"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%
	RetailerBean bean = (RetailerBean) session.getAttribute("bean");
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<a href="./changepassword">Change Password</a>
	<a href="./update">Update</a>
	<a href="./logout" style="float: right;">Logout</a>
	<h2>
		Welcome
		<%=bean.getName()%></h2>
	<fieldset>
		<legend>Search Employee</legend>
		<form action="./search">
			<table>
				<tr>
					<td>ID:</td>
					<td><input type="number" name="id"></td>
					<td><input type="submit" value="Search"></td>
				</tr>
			</table>
		</form>
	</fieldset>
	<%
		RetailerBean retailerBean = (RetailerBean) request.getAttribute("bean");
	%>
	<%
		if (retailerBean != null) {
	%>
	<table>
		<tr>
			<th>Name</th>
			<th>Id</th>
			<th>Email</th>
			<th>Password</th>
		</tr>
		<tr>
			<td><%=retailerBean.getName()%></td>
			<td><%=retailerBean.getEmail()%></td>
			<td><%=retailerBean.getPassword()%></td>
			<td><%=retailerBean.getId()%></td>
			
		</tr>
	</table>
	<%
		}
	%>
<h3>${msg}</h3>
</body>
</html>