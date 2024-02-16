<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"
    import="test.UserBean"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Log in</title>
</head>
<body>
  <%  
  UserBean ub=(UserBean)session.getAttribute("ub");
  out.println("Welcome User :"+ub.getFname()+"<br>"); 
%> 
<a href="view">ViewAllProducts</a><br> 
<a href="logout">Logout</a> 
</body>
</html>