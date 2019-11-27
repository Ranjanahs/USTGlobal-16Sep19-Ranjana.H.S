package com.ustglobal.employeewebapp.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.ustglobal.employeewebapp.dao.EmployeeDAO;
import com.ustglobal.employeewebapp.dto.Employee_info;
import com.ustglobal.employeewebapp.util.EmployeeDaoManager;

@WebServlet("/changepassword")
public class ChangePasswordServlet extends HttpServlet {
 @Override
protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	HttpSession session = req.getSession(false);
	if(session!=null) {
		String pass = req.getParameter("password");
		String confirmPass = req.getParameter("confirmpassword");
		
		if(pass.equals(confirmPass)) {
			Employee_info info = (Employee_info)session.getAttribute("info");
			EmployeeDAO dao = EmployeeDaoManager.getEmployeeDAO();
			dao.changePassword(info.getId(), pass);
			RequestDispatcher dispatcher = req.getRequestDispatcher("/home");
			dispatcher.forward(req, resp);
				
		}else{
			String msg = "password not matching";
			req.setAttribute("msg", msg);
//			PrintWriter out = resp.getWriter();
//			out.println("<html>");
//			out.println("<h4>Password not matching</h4>");
//			out.println("</html>");
			RequestDispatcher dispatcher = req.getRequestDispatcher("/changepassword.jsp");
			dispatcher.forward(req, resp);//dispatcher.include(req,resp)
		}
		
			}else {
				RequestDispatcher dispatcher = req.getRequestDispatcher("/login.jsp");
				dispatcher.forward(req, resp);
	}
}//e o dp
}//e o cp
