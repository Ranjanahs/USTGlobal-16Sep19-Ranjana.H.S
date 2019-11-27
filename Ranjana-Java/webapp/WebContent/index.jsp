<%@page import="java.util.Date"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
    <%!
 public void jspInit(){
	System.out.println("this is init phase");
   }
 public void jspDestroy(){
	 System.out.println("this is destroy phase");
 }
%>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>

   

<body>
<% Date date = new Date();
%>
<h1 style = 'color:blue'>Date and Time:<%=date%></h1>
</body>
</html>