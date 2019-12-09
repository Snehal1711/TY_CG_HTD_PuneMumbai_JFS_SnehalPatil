package com.capgemini.springcore.anotations.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

import com.capgemini.springcore.anotations.beans.EmployeeBean;
import com.capgemini.springcore.anotations.config.DepartmentConfig;
import com.capgemini.springcore.anotations.config.EmployeeConfig;

public class EmployeeTest {
	public static void main(String[] args) {
		
		ApplicationContext context= new AnnotationConfigApplicationContext(EmployeeConfig.class);
		((AbstractApplicationContext)context).registerShutdownHook();
		EmployeeBean employeeBean = context.getBean(EmployeeBean.class);
		
		System.out.println("Employee Id     : " + employeeBean.getEmpId());
		System.out.println("Employee name   : " + employeeBean.getEmpName());
		System.out.println("******DEpartment Info**********");
		System.out.println("Department Id   : " + employeeBean.getDeptBean().getDeptId());
		System.out.println("Department Name : " + employeeBean.getDeptBean().getDeptName());
		//((AbstractApplicationContext)context).close();
	}//end of main
}//end of class
