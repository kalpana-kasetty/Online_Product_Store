package test;
import java.io.*;
import java.util.*;
import javax.servlet.*;
import javax.servlet.annotation.*;
import javax.servlet.http.*;
@SuppressWarnings("serial")
@WebServlet("/pay")
public class PaymentServlet extends HttpServlet{

	@SuppressWarnings("unchecked")
	protected void doPost(HttpServletRequest req,HttpServletResponse res)throws IOException,ServletException{  	
		HttpSession hs=req.getSession(false);  	if(hs==null) { 
 	 	req.setAttribute("msg","Session Expired"); 
 	 	req.getRequestDispatcher("Home.jsp").forward(req, res);; 
 	 	 
 	} 
else { 
 	 	String pcode=req.getParameter("pcode");  	 	
 	 	float rt=Float.parseFloat(req.getParameter("rqty")); 
 	 	ArrayList<ProductBean> al=(ArrayList<ProductBean>)hs.getAttribute("al");  	 	
 	 	Iterator<ProductBean> it=al.iterator();  	 	
 	 	while(it.hasNext()) { 
 	 	 	ProductBean pb=(ProductBean)it.next();  	 	 	
 	 	 	if(pcode.equals(pb.getpCode())) 
 	 	 	{ 
 	 	 	  pb.setpQty((int) (pb.getpQty()-rt));  	 	 	  
 	 	 	  int k=new PaymentSuccessDAO().reupdate(pb);  	 	 	 
 	 	 	  if(k>0) { 
 	 	 	   req.setAttribute("msg", "Payment Successful..<br>"); 
 	 	 	} 
 	 	  break; 
 	 	}  	 	 	 
 	} 
 
 	req.getRequestDispatcher("PaymentSuccess.jsp").forward(req, res); 
}  
} 
}
