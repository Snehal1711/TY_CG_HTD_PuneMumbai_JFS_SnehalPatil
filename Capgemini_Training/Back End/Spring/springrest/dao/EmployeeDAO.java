package com.capgemini.springrest.dao;

import java.util.List;

import com.capgemini.springrest.beans.EmployeeInfoBean;

public interface EmployeeDAO {
	public EmployeeInfoBean getEmployee(int empId);
	public EmployeeInfoBean authenticate(int empId , String password);
	public boolean addEmployee(EmployeeInfoBean employee);
	public boolean updateEmployee(EmployeeInfoBean employee);
	public boolean deleteEmployee(int empId);
	public List<EmployeeInfoBean> getAllEmployees();


}
