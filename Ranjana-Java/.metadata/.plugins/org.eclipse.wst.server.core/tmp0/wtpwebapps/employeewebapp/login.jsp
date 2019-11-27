<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
	<%@page session="false" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<jsp:useBean id="msg" class="java.lang.String" scope="request"/>
<%
String id="";
Cookie[] cookies = request.getCookies();
if(cookies!=null) {
for (Cookie cookie : cookies) {
	if(cookie.getName().equals("alwaysRemember")) {
		id = cookie.getValue();
	}
  }
}
%>
<body>
  <h4><%=msg%></h4>
	<fieldset align='center'>
		<legend>Login</legend>
		<form action='./login' method='post'>
			<table>
				<tr>
					<td>id</td>
					<td><input name='id' type='number' value='<%=id%>'></td>
				</tr>
				<tr>
					<td>password</td>
					<td><input name='password' type='password'></td>
				</tr>
				<tr>
					<td>RememberMe</td>
					<td><input name='remember' type='checkbox' value='checked'></td>
				</tr>
				<tr>
					<td></td>
					<td><input type='submit'></td>
				</tr>
				<td></td>
				<td><input type='reset'></td>
				</tr>
			</table>
		</form>
		<a href='./Register.html'>Register</a>
	</fieldset>
</body>
</html>