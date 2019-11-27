package com.ustglobal.empapp;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.List;
import java.util.Scanner;

import com.ustglobal.empapp.dao.EmployeeDAO;
import com.ustglobal.empapp.dao.EmployeeDAOImpl;
import com.ustglobal.empapp.dto.EmployeeBean;
import com.ustglobal.empapp.util.EmployeeManager;

public class App {
	public static void main(String[] args) {
		System.out.println("Press 1 to get all employee data");
		System.out.println("Press 2 to insert all employee data");
		System.out.println("Press 3 to update all employee data");
		System.out.println("Press 4 to delete all employee data");
		System.out.println("Press 5 to search all employee data");

		Scanner scn = new Scanner(System.in);
		int ch = scn.nextInt();

		switch(ch) {
		case 1:
			EmployeeDAO dao = EmployeeManager.getEmployeeDAO();
			List<EmployeeBean> result = dao.getAllEmployeeData();
			for(EmployeeBean bean : result) {
				System.out.println("id:"+bean.getId());//v can entr ths in any order--loosely coupled
				System.out.println("name:"+bean.getName());
				System.out.println("salary:"+bean.getSal());
				System.out.println("gender:"+bean.getGender());
				}
			break;
			
		case 2:
			EmployeeDAO dao1 = EmployeeManager.getEmployeeDAO();
			System.out.println("enter details to insert");
			EmployeeBean bean = new EmployeeBean();
			bean.setId(scn.nextInt());
			bean.setName(scn.next());
			bean.setSal(scn.nextInt());
			bean.setGender(scn.next());
			int count = dao1.insertEmployeeData(bean);
			System.out.println(count+"rows inserted");
			break;
		
		case 3:
			EmployeeDAO dao2 = EmployeeManager.getEmployeeDAO();
			System.out.println("enter details to update");
			EmployeeBean bean1 = new EmployeeBean();
			bean1.setId(scn.nextInt());
			bean1.setName(scn.next());
			bean1.setSal(scn.nextInt());
			bean1.setGender(scn.next());
			int count1 = dao2.updateEmployeeData(bean1);
			System.out.println(count1+"rows upted");
			
			break;
		
		case 4:
			EmployeeDAO dao3 = EmployeeManager.getEmployeeDAO();
			System.out.println("enter id to delete");
			EmployeeBean bean2 = new EmployeeBean();
			bean2.setId(scn.nextInt());
//			bean2.setName(scn.next());
//			bean2.setSal(scn.nextInt());
//			bean2.setGender(scn.next());
			int delete= dao3.deleteEmployeeData(bean2);
			System.out.println(delete+"rows deleted");
			break;
		
		case 5:
			EmployeeDAO dao5 = EmployeeManager.getEmployeeDAO();
			System.out.println("Enter the data to search");
			List<EmployeeBean> result5 = dao5.getAllEmployeeData();
			int id = scn.nextInt();
			EmployeeBean bean3 = dao5.searchEmployeeData(id);
			dao5.searchEmployeeData(id);
			if(bean3!=null) {
				System.out.println("id:"+bean3.getId());//v can entr ths in any order--loosely coupled
				System.out.println("name:"+bean3.getName());
				System.out.println("salary:"+bean3.getSal());
				System.out.println("gender:"+bean3.getGender());
				
			}else {
				System.out.println("no data found");
			}

			break;
		}//end of switch
	}//end of main
}//end of app








