package com.ustglobal.employeewebapp.util;

import com.ustglobal.employeewebapp.dao.EmployeeDAO;
import com.ustglobal.employeewebapp.dao.EmployeeDAOJdbcImpl;

public class EmployeeDaoManager {
 private EmployeeDaoManager() {}
 
 public static EmployeeDAO getEmployeeDAO() {
	 return new EmployeeDAOJdbcImpl();
 }
}
