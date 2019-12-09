package com.capgemini.springboot.service;

import java.util.List;

import com.capgemini.springboot.beans.EmployeeInfoBean;

public interface EmployeeService {
	public EmployeeInfoBean getEmployee(int empId);
	public EmployeeInfoBean authenticate(int empId , String password);
	public boolean addEmployee(EmployeeInfoBean employee);
	public boolean updateEmployee(EmployeeInfoBean employee);
	public boolean deleteEmployee(int empId);
	public List<EmployeeInfoBean> getAllEmployees();


}
