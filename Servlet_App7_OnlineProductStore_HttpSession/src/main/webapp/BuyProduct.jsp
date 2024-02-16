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
UserBean ub=(UserBean)session.getAttribute("ub"); 
  ProductBean pb=(ProductBean)request.getAttribute("pb"); 
  out.println("page of "+ub.getFname()+"<br>"); 
%> 
<form action="pbill" method="post"> 
<input type="text" name="code" value=<%=pb.getpCode()%>> 
ProductName:<input type="text" name="prname" value=<%=pb.getpName()%>> 
ProductPrice:<input type="text" name="price" value=<%=pb.getpPrice()%>> 
ProductQty:<input type="text" name="qty" value=<%=pb.getpQty()%>> 
RequiredQty:<input type="text" name="rqty"> 
<input type="submit" value="BuyProduct"> 
</form> 
  
</body>
</html>