package com.ustglobal.employeewebapp.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/login.html")
public class LoginPageServlet extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		PrintWriter out = resp.getWriter();
		
		String id="";
		Cookie[] cookies = req.getCookies();
		if(cookies!=null) {
		for (Cookie cookie : cookies) {
			if(cookie.getName().equals("alwaysRemember")) {
				id = cookie.getValue();
			}
		  }
		}
		
		out.println("<html>");
		out.println("<body>");
		out.println("<fieldset align='center'>");
		out.println("<legend>Login</legend>");
	    out.println("<form action='./login' method='post'>");
	    out.println("<table>");
	    out.println("<tr>");
	    out.println("<td>id</td>");
	    out.println("<td><input name='id' type='number' value='"+id+"'></td>");
	    out.println("</tr>");
	    out.println("<tr>");
	    out.println("<td>password</td>");
	    out.println("<td><input name='password' type='password'></td>");
	    out.println("</tr>");
	    out.println("<tr>");
	    out.println("<td>RememberMe</td>");
	    out.println("<td><input name='remember' type='checkbox' value='checked'></td>");
	    out.println("</tr>");
	    out.println("<tr>");
	    out.println("<td></td>");
	    out.println("<td><input type='submit'></td>");
	    out.println("</tr>");
	    out.println("<td></td>");
	    out.println("<td><input type='reset'></td>");
	    out.println("</tr>");
	    out.println("</table>");
	    out.println("</form>");
	    out.println("<a href='./Register.html'>Register</a>");
	    out.println("</fieldset>");
	    out.println("</body>");
	    out.println("</html>");
	 }//e o d
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		doGet(req,resp);
		}
}//e o lps
