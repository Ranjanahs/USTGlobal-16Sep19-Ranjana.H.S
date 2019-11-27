package com.ustglobal.filehandling;

import java.io.FileReader;
import java.util.Properties;

public class PropertiesFileReader {
 public static void main(String[] args) {
	String path ="db.properties";
	FileReader reader = null;
	try {
		reader = new FileReader(path);
		Properties p = new Properties();
		p.load(reader);
		
		String url = p.getProperty("url");
		String user = p.getProperty("user");
		String password = p.getProperty("password");
		
//		String name = p.getProperty("name");
//		String company = p.getProperty("company");
//		String bestie = p.getProperty("bestie");
//		
//		System.out.println("name   :"+name);
//		System.out.println("company:"+company);
//		System.out.println("bestie :"+bestie);
//		
	}catch(Exception e) {
		e.printStackTrace();
	}
}
}
