package com.capgemini.empwebapp.dao;

import com.capgemini.empwebapp.beans.EmployeeInfoBean;

public interface EmployeeDAO {
	public EmployeeInfoBean getEmployee(int empId);
	public EmployeeInfoBean authenticate(int empId , String password);
	public boolean addEmployee(EmployeeInfoBean employee);
	public boolean updateEmployee(EmployeeInfoBean employee);

}
