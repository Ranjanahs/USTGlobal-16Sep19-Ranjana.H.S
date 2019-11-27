package com.ustglobal.jdbcapp;

import java.io.FileReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;

import com.mysql.jdbc.Driver;

public class UpdateQuerywtproperties {
public static void main(String[] args) {
	Connection conn = null;
	PreparedStatement pstmt = null;
	FileReader reader = null;
	try {
		reader = new FileReader("db.properties");
		Properties prop = new Properties();
		prop.load(reader);
		//step-1-load driver
		Class.forName(prop.getProperty("driver-class-name"));
		
		
		//step-2-get the connection
		String url = prop.getProperty("url");
		conn = DriverManager.getConnection(url,prop);
		
		//step-3-issue SQL query
		String sql = prop.getProperty("update-query");
//		stmt = conn.createStatement();
//		int count = stmt.executeUpdate(sql);
		pstmt = conn.prepareStatement(sql);
		
		String empid = args[0];
		int id = Integer.parseInt(empid);
		
		String name = args[1];
		
		String empsal = args[2];
		int sal = Integer.parseInt(empsal);
		
		String gender = args[3];
		
		pstmt.setInt(4, id);
		pstmt.setString(1, name);
		pstmt.setInt(2, sal);
		pstmt.setString(3,gender);
		
		int count = pstmt.executeUpdate(); 
		
		
		//step-4-read the result
		System.out.println(count + "row(s) updated");
	}catch(Exception e) {
		e.printStackTrace();
	}finally {
		try {
			if(conn!=null) {
				conn.close();
			}
//			if(stmt!=null) {
//				stmt.close();
//			}
		    {
			if(pstmt!=null) {
			     pstmt.close();
			}
			}
		}catch(SQLException e) {
			e.printStackTrace();
		}
	}
	
	}//end of main
}//end of ExecuteInsertQuery



