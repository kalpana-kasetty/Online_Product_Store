package test;
import java.io.*;
import java.util.*;
import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
@SuppressWarnings("serial")
@WebServlet("/pbill")
public class BillProductServlet extends HttpServlet{
	@SuppressWarnings({ "unused", "unchecked" }) 
	public void doPost(HttpServletRequest req,HttpServletResponse res)throws ServletException,IOException{  	HttpSession hs=req.getSession(false);  	if(hs==null) { 
	 	 	req.setAttribute("msg", "session expired <br>"); 
	 	 	req.getRequestDispatcher("Home.jsp").forward(req, res); 
	 	 	 
	 	} 
	 	else { 
	 	 	String pCode=req.getParameter("code"); 
	 	 	String prName=req.getParameter("prname");  	 	float pPrice=Float.parseFloat(req.getParameter("price"));  	 	float prqty=Float.parseFloat(req.getParameter("rqty"));  	 	req.setAttribute("pPrice", pPrice);  	 	req.setAttribute("prqty",prqty); 
	 	 	ArrayList<ProductBean> 
	al=(ArrayList<ProductBean>)hs.getAttribute("al");  	 	Iterator<ProductBean> it=al.iterator();  	 	while(it.hasNext()) { 
	 	 	 	ProductBean pb=it.next(); 
	 	 	 	 
	 	 	 	  req.setAttribute("pb", pb);  
	 	 	} 	 
	 	req.getRequestDispatcher("BillProducts.jsp").forward(req, res); 
	 	} 
	} 
}
