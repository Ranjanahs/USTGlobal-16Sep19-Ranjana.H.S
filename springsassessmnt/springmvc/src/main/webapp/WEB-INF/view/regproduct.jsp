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
		<form action="./regpro" method="post">
			<table>
                     <tr>
					<td>pid</td>
					<td><input name="pid" type="number"></td>
				</tr>
				<tr>
					<td>PName</td>
					<td><input name="pname" type="text"></td>
				</tr>
				<tr>
					<td>price</td>
					<td><input name="price" type="number"></td>
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