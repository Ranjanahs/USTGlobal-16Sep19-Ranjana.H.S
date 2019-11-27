package com.ustglobal.jdbcapp;

import java.sql.*;

import com.mysql.jdbc.Driver;


public class MyFirstJDBC {
	public static void main(String[] args) {
		Connection conn = null;
		Statement stmt = null;
		ResultSet rs = null;
		try {
			//step-1:load driver
			Driver driver = new Driver();
			DriverManager.registerDriver(driver);
			
			//step-2-get connection
			String url = "jdbc:mysql://localhost:3306/ust_ty_db?user=root&password=root";
			conn = DriverManager.getConnection(url);
			
			//step-3-issue sql query
			stmt = conn.createStatement();
			String sql = "select * from employee_info";
			rs = stmt.executeQuery(sql);
			
			
			//step-4-read the result
			while(rs.next()) {
				int id=rs.getInt("id");
				String name = rs.getString("name");
				int sal = rs.getInt("sal");
				String gender = rs.getString("gender");

				System.out.println("Id:"+id);
				System.out.println("Name:"+name);
				System.out.println("Salary:"+sal);
				System.out.println("Gender:"+gender);
				System.out.println("*****************************************");
			}
		}catch(SQLException e) {
			e.printStackTrace();
		}finally {
			//step-5-close all the JDBC connections
			try {
                if(conn!=null) {
                	conn.close();
                }
                if(stmt!=null) {
                	stmt.close();
                }
                if(rs!=null) {
                	rs.close();
                }
			}catch(SQLException e) {
				e.printStackTrace();
				
			}
		}
	}//end of main
}//end of MyFirstJDBC
