package com.ustglobal.jdbcapp;

import java.io.FileReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;

import com.mysql.jdbc.Driver;

public class DeleteQuerywtProperties {
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
		String sql = prop.getProperty("delete-query");
		
		
	
//		stmt = conn.createStatement();
//		int count = stmt.executeUpdate(sql);
		pstmt = conn.prepareStatement(sql);
		
		//pstmt.setInt(1,Integer.parseInt(args[0]));
		String empid = args[0];
		int id = Integer.parseInt(empid);
		pstmt.setInt(1, id);
		
		
		int count = pstmt.executeUpdate();
		
		
		//step-4-read the result
		System.out.println(count + "row(s) deleted");
	}catch(Exception e) {
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
	}
	
	}//end of main
}//end of ExecuteInsertQuery


