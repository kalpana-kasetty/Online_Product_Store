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
ArrayList<ProductBean> 
al=(ArrayList<ProductBean>)session.getAttribute("al");
ProductBean pb=(ProductBean)request.getAttribute("pb"); 
out.println("Page Belongs to "+ub.getFname()+"<br>"); 
out.println(" product code :"+request.getParameter("code")); 
out.println("Product Price:"+Float.parseFloat(request.getParameter("price"))); 
out.println("Required quantity:"+Float.parseFloat(request.getParameter("rqty"))); 
out.println("Total Amount :"+(Float.parseFloat(request.getParameter("price")))*Float.parseFloat(request.getParameter("rqty"))); 
%> 
<form action="pay" method="post"> 
<input type="text" name="pcode" value=<%=request.getParameter("code")%>> 
<input type="text" name="rqty" value=<%=request.getParameter("rqty")%>> 
<input type="submit" value="Payment"> 
</form> 

</body>
</html>