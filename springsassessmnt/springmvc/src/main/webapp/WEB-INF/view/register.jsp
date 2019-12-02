<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>


<fieldset align:"center">
		<legend>Login</legend>
		<form action="./register" method="post">
			<table>

				<tr>
					<td>Name</td>
					<td><input name="name" type="text"></td>
				</tr>
				<tr>
					<td>Email</td>
					<td><input name="email" type="email"></td>
				</tr>
				<tr>
					<td>Password</td>
					<td><input name="password" type="password"></td>
				</tr>
				
				<tr> <td><input type ='reset' value ='Reset'> </td>
				      <td> <input value="Register" type="submit"></td>
				 </tr>
				
					
				
			</table>
		</form>
	</fieldset>
	<a href="./login">login here</a>

</body>
</html>