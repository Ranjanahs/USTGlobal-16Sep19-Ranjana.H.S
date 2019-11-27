package com.ustglobal.jdbcapp;

import com.mysql.jdbc.Driver;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.*;

public class DynamicSelectQuery {
     public static void main(String[] args) {
    	 String url ="jdbc:mysql://localhost:3306/ust_ty_db?user=root&password=root";
    	 String sql ="select * from employee_info where id=?";
    	 
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		
		try {
			 //Step-1
			Driver driver = new Driver();
			DriverManager.registerDriver(driver); 
			
			//step-2
			conn = DriverManager.getConnection(url);
			
			//step-3
			pstmt = conn.prepareStatement(sql);
			String empid = args[0];
			int id = Integer.parseInt(empid);
			pstmt.setInt(1, id);
			
			rs = pstmt.executeQuery();
			
			//step-4
			if(rs.next()) {
				int eid = rs.getInt("id");
				int sal = rs.getInt("sal");
				String name = rs.getString("name");
				String gender = rs.getString("gender");
				
				System.out.println("id:"+id);
				System.out.println("name:"+name);
				System.out.println("salary:"+sal);
				System.out.println("gender:"+gender);
				System.out.println("**************************************");
				
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
