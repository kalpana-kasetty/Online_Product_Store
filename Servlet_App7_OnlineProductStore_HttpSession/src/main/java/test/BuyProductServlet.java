package test;
import java.io.*;
import java.util.*;
import javax.servlet.*;
import javax.servlet.annotation.*;
import javax.servlet.http.*;
@SuppressWarnings("serial")
@WebServlet("/buyProduct")
public class BuyProductServlet extends HttpServlet{
 
	@SuppressWarnings("unchecked") 
	public void doGet(HttpServletRequest req,HttpServletResponse res)throws ServletException,IOException{  	HttpSession hs=req.getSession(false);  	if(hs==null)  
	 	{ 
	 	 	req.setAttribute("msg", "Session Expired...<br>"); 
	 	 	req.getRequestDispatcher("Home.jsp").forward(req, res); 
	 	 	 
	 	} 
	 	else { 
	 	 	String pCode=req.getParameter("pcode"); 
	 	 	ArrayList<ProductBean> 
	al=(ArrayList<ProductBean>)hs.getAttribute("al");  	 	Iterator<ProductBean>it=al.iterator();  	 	while(it.hasNext()) { 
	 	 	 	ProductBean pb=(ProductBean)it.next(); 
	 	 	 	if(pCode.equals(pb.getpCode())&& pb.getpQty()>0) 
	{ 	  
	 	 	 	 	 req.setAttribute("pb", pb); 
	 	 	 	 	 
	 	 	 	} 
	 	 	} 
	        req.getRequestDispatcher("BuyProduct.jsp").forward(req, res); 
	 	} 
	} 

}
