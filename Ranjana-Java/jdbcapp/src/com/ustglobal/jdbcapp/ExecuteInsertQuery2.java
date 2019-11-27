package com.ustglobal.jdbcapp;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;

import com.mysql.jdbc.Driver;

public class ExecuteInsertQuery2 {
public static void main(String[] args) {
	Connection conn = null;
	Statement stmt = null;
	PreparedStatement pstmt = null;
	
	try {
		//step-1-load driver
		Driver driver = new Driver();
		DriverManager.registerDriver(driver);
		
		//step-2-get the connection
		String url="jdbc:mysql://localhost:3306/ust_ty_db?user=root&password=root";
		conn = DriverManager.getConnection(url);
		
		//step-3-issue SQL query
		//String sql = "insert into employee_info values(6,'priyanka',10000,'F')";
		//String sql = "insert into employee_info values("+args[0]+",'"+args[1]+"',"+args[2]+",'"+args[3]+"')";//passing arguments 
		String sql = "insert into employee_info values(?,?,?,?)";//dynamic sql query
		//stmt = conn.createStatement();
		pstmt = conn.prepareStatement(sql);
		
		String empid = args[0];
		int id = Integer.parseInt(empid);
        pstmt.setInt(1, id);
        
        String name = args[1];
        pstmt.setString(2, name);
        
        String empsal = args[2];
        int sal = Integer.parseInt(empsal);
        pstmt.setInt(3, sal);
        
        String gender = args[3];
        pstmt.setString(4, gender);
        
        int count = pstmt.executeUpdate();//executing query 
		
		 	
		//int count = stmt.executeUpdate(sql);
		
		//step-4-read the result
		System.out.println(count + "row(s) inserted");
	}catch(SQLException e) {
		e.printStackTrace();
	}finally {
		try {
			if(conn!=null) {
				conn.close();
			}
			//if(stmt!=null) {
			//	stmt.close();
			//}
			if(pstmt!=null) {
				pstmt.close();
			}
		}catch(SQLException e) {
			e.printStackTrace();
		}
	}
	
	}//end of main
}//end of ExecuteInsertQuery
