<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"
    import="test.AdminBean"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<% AdminBean ab=(AdminBean)session.getAttribute("abean");
String ms=(String)request.getAttribute("msg");
out.println("Page belongs to "+ab.getfName()+"<br>");
out.println(ms);%>
<a href="product.html">Add Product</a>
<a href="viewProducts">View All Products</a>
<a href="logout">Logout</a>
</body>
</html>