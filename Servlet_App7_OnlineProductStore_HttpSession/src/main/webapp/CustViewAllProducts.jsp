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
 ArrayList<ProductBean> al=(ArrayList<ProductBean>)session.getAttribute("al");  
 out.println("Welcome to "+ub.getFname()+"<br>");  
 if(al.size()==0){ 
 	 out.println("Products Not Available....<br>"); 
 } 
 else{ 
 	 Iterator<ProductBean> it=al.iterator();  	 	
 	 while(it.hasNext()){ 
 	 	 	ProductBean pb=(ProductBean)it.next(); 
 out.println(pb.getpCode()+"&nbsp&nbsp&nbsp"+
 	 	 	pb.getpName()+"&nbsp&nbsp&nbsp"+
		 pb.getpPrice()+"&nbsp&nbsp&nbsp"+
 	 	 	pb.getpQty()+" "+"<a href='buyProduct?pcode="+
		 pb.getpCode()+"'>Buy</a>"+"&nbsp&n bsp&nbsp"+"<br>");  
 	 	} 
 } 
 %> 
  
</body>
</html>