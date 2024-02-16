<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"
    import="test.*,java.util.*"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<% 
UserBean ub=(UserBean)session.getAttribute("ub"); String msg=(String)request.getAttribute("msg"); out.println("page belongs to "+ub.getFname()+"<br>"); out.println(msg); 
%> 
<a href="view">ViewAllProducts</a> 
<a href="logout">Logout</a> 
</body>
</html>