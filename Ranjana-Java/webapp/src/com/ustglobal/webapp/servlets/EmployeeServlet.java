package com.ustglobal.webapp.servlets;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.mysql.jdbc.Driver;

public class EmployeeServlet extends HttpServlet{
  @Override
protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	 
	  PrintWriter out = resp.getWriter();
	  
	  String url ="jdbc:mysql://localhost:3306/ust_ty_db?user=root&password=root";
 	 String sql ="select * from employee_info where id=?";
 	 
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		
		try {
			 //Step-1
			Driver driver = new Driver();
			DriverManager.deregisterDriver(driver); 
			
			//step-2
			conn = DriverManager.getConnection(url);
			
			//step-3
			pstmt = conn.prepareStatement(sql);
			
			
			String s = req.getParameter("search");
			int id = Integer.parseInt(s);
			pstmt.setInt(1, id);
			
			rs = pstmt.executeQuery();
			
			//step-4
			if(rs.next()) {
				int eid = rs.getInt("id");
				int sal = rs.getInt("sal");
				String name = rs.getString("name");
				String gender = rs.getString("gender");
				
				out.println("id:"+id);
				out.println("name:"+name);
				out.println("salary:"+sal);
				out.println("gender:"+gender);
				
			}
			
			
		}catch(SQLException e) {
			e.printStackTrace();
		}finally {
			try {
			if(conn!=null) {
			conn.close();
			}
			if(pstmt!=null) {
				pstmt.close();
			}
	  }catch(SQLException e) {
		  e.printStackTrace();
	  }
	}//end of try,catch,finally
  
}

	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	 
	
	  
}

