package test;
import javax.servlet.*;
import javax.servlet.annotation.*;
import javax.servlet.http.*;
import java.io.*;
  
   @SuppressWarnings("serial")
@WebServlet("/reg")
   public class RegisterServlet extends HttpServlet{
	   public void doPost(HttpServletRequest req,HttpServletResponse res)throws IOException,ServletException {
		   UserBean ub = new UserBean();
		   ub.setUname(req.getParameter("uname"));  	 
		   ub.setPword(req.getParameter("pword"));  	
		   ub.setFname(req.getParameter("fname"));  	 
		   ub.setLname(req.getParameter("lname"));  	 
		   ub.setAddr(req.getParameter("addr"));  	
		   ub.setMid(req.getParameter("mid")); 
		   ub.setPhno(Long.parseLong(req.getParameter("phno")));
		   
		   int k = new RegisterDAO().register(ub);
		   
		   if(k>0) {
			   req.setAttribute("msg", "Registration Successfull...");
		      RequestDispatcher rd=req.getRequestDispatcher("RegSuccess");
		      rd.forward(req, res);
		   }
			   
	   }
   }
   

