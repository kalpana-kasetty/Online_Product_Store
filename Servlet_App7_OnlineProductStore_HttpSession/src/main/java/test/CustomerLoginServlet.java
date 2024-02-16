package test;
import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
@SuppressWarnings("serial")
@WebServlet("/clogin")
public class CustomerLoginServlet extends HttpServlet
{
 @SuppressWarnings("unused")
@Override
 protected void doPost(HttpServletRequest req,HttpServletResponse res)throws ServletException,IOException{
	 CustomerBean cb=new CustomerLoginDAO().login(req);
	if(cb==null) 
	{
		req.setAttribute("msg", "Invalid login process...<br>");
		RequestDispatcher rd=req.getRequestDispatcher("Home.jsp");
	   rd.forward(req, res);
	}else {
		HttpSession hs = req.getSession();//Creation Session Object
		hs.setAttribute("cbean", cb);
		RequestDispatcher rd=req.getRequestDispatcher("CustLogSuccess.jsp");
	}
 }
}
