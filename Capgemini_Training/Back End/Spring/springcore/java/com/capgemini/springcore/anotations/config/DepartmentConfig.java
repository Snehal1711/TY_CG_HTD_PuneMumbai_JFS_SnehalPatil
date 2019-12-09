package com.capgemini.springcore.anotations.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.capgemini.springcore.anotations.beans.DepartmentBean;

@Configuration
public class DepartmentConfig {
	@Bean(name="dev")
	public DepartmentBean getDevDept() {
		DepartmentBean departmentBean = new DepartmentBean();
		departmentBean.setDeptId(901);
		departmentBean.setDeptName("Developement");
		return departmentBean;
	}
	
	@Bean(name="test")
	public DepartmentBean getTestingDept() {
		DepartmentBean departmentBean = new DepartmentBean();
		departmentBean.setDeptId(902);
		departmentBean.setDeptName("Testing");
		return departmentBean;
	}
	
	@Bean(name="hr")
	//@Primary
	public DepartmentBean getHrDept() {
		DepartmentBean departmentBean = new DepartmentBean();
		departmentBean.setDeptId(903);
		departmentBean.setDeptName("HR");
		return departmentBean;
	}
}
