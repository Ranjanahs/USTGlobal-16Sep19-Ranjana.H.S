package com.ustglobal.jdbcapp;

import java.io.FileReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;

//import com.mysql.jdbc.Driver;

public class MyFirstJDBCwithProperties {
	public static void main(String[] args) {

		Connection conn = null;
		Statement stmt = null;
		ResultSet rs = null;
		FileReader reader = null;

		try {
			reader = new FileReader("db.properties");
			Properties prop = new Properties();
			prop.load(reader);

			//step-1:load driver
			Class.forName(prop.getProperty("driver-class-name"));

			//step-2-get connection
			String url = prop.getProperty("url");
			conn = DriverManager.getConnection(url,prop);

			//step-3-issue sql query
		    
			stmt = conn.createStatement();
			rs = stmt.executeQuery(prop.getProperty("select-query"));


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
		}catch(Exception e) {
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
				if(reader!=null) {
					reader.close();
				}}catch(Exception e) {
					e.printStackTrace();

				}
		}
	}//end of main
}
