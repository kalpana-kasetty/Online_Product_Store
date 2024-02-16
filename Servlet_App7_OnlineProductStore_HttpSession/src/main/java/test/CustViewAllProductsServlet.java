package test;
import java.util.*;
import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
@WebServlet("/view")
@SuppressWarnings("serial")
public class CustViewAllProductsServlet extends HttpServlet{

	public void doGet(HttpServletRequest req,HttpServletResponse res)throws ServletException,IOException{  	HttpSession hs=req.getSession(false);  	if(hs==null) { 
 	 	req.setAttribute("msg", "Session expired...<br>"); 
 	 	RequestDispatcher 
rd=req.getRequestDispatcher("Home.jsp");  	 	rd.forward(req, res); 
} else  
 	{ 
 	 	ArrayList<ProductBean> al=new 
CustViewAllProductsDAO().receive();  	 	hs.setAttribute("al", al); 
 
 	req.getRequestDispatcher("CustViewAllProducts.jsp").forward
(req, res); 
 	} 
 
} 

}
