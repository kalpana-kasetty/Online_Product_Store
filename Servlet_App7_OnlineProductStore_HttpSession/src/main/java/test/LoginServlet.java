package test;
import java.io.*;
import javax.servlet.*;
import javax.servlet.annotation.*;
import javax.servlet.http.*;
@SuppressWarnings("serial")
@WebServlet("/login")


	public class LoginServlet extends HttpServlet {
		protected void doPost(HttpServletRequest req,HttpServletResponse res)throws ServletException,IOException{
			UserBean ub=new LoginDAO().login(req);
			if(ub==null) {
				req.setAttribute("msg", "invalid login process...<br>");
				RequestDispatcher rd=req.getRequestDispatcher("Home.jsp");
			  rd.forward(req, res);
		}
			else {
				HttpSession hs=req.getSession();
				hs.setAttribute("ub", ub);
				RequestDispatcher rd=req.getRequestDispatcher("CustLogSuccess.jsp");
				rd.forward(req, res);
			}
	}
}
