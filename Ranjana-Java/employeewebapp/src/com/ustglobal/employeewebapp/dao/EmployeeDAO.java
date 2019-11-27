package com.ustglobal.employeewebapp.dao;

import com.ustglobal.employeewebapp.dto.Employee_info;

public interface EmployeeDAO {
   public Employee_info auth(int id ,String password);
   public Employee_info searchEmployee(int id);
   public boolean changePassword(int id,String password);
   public boolean registerEmployee(Employee_info info);
}
