<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<jsp:useBean id="msg" class="java.lang.String" scope="request"/>
<body>
<a href='./home'>Home</a>
<a style="float:right" href="./logout">Logout</a>
<h4><%=msg%></h4>
	<fieldset align="center">
		<legend>Change password</legend>
		<form action="./changepassword" method="post">
			<table align="center">
				<tr>
					<td>New password:</td>
					<td><input name="password" type="password"></td>
				</tr>
				<tr>
					<td>Confirm password:</td>
					<td><input name="confirmpassword" type="password"></td>
				</tr>
				<tr>
					<td></td>
					<td><input type="submit" value="Change"></td>
					</tr>
				</form>
</body>
</html>