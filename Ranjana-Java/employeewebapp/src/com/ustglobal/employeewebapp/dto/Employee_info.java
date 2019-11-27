package com.ustglobal.employeewebapp.dto;

import lombok.Data;
import lombok.ToString.Exclude;

@Data
public class Employee_info {
  private int  id;
  private String name;
  private String email;
  //@Exclude-password shd nt be visible
  private String password;
}
