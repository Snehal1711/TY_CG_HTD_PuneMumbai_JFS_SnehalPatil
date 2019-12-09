package com.capgemini.springrest.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.capgemini.springrest.beans.EmployeeInfoBean;
import com.capgemini.springrest.beans.EmployeeResponse;
import com.capgemini.springrest.service.EmployeeService;

//@Controller
@RestController
public class EmployeeRestController {
	
	@Autowired
	private EmployeeService service;
	
	@GetMapping("/getEmployee")
	public EmployeeResponse getEmployee(int empId) {
		EmployeeInfoBean empInfoBean =service.getEmployee(empId);
		EmployeeResponse response = new EmployeeResponse();
		if(empInfoBean!=null) {
			response.setStatusCode(201);
			response.setMessage("Success");
			response.setDescription("Employee Id Found ");
			response.setEmployeeInfoBean(empInfoBean);
		}else {
			response.setStatusCode(401);
			response.setMessage("Failed");
			response.setDescription("Employee Id "+empId+" not Found ");
		}
		return response;
	}//end of getEmployye
	
	@PutMapping(path ="/addEmployee", consumes = {MediaType.APPLICATION_JSON_VALUE, MediaType.APPLICATION_XML_VALUE}, 
			produces = MediaType.APPLICATION_JSON_VALUE)
	public EmployeeResponse addEmployee(@RequestBody EmployeeInfoBean employeeInfoBean) {
		boolean isAdded= service.addEmployee(employeeInfoBean);	
		EmployeeResponse response = new EmployeeResponse();
		if(isAdded) {
			response.setStatusCode(201);
			response.setMessage("Success");
			response.setDescription("Employee is added Successfully..");
		}else {
			response.setStatusCode(201);
			response.setMessage("Failed");
			response.setDescription("Unable to add employee!");
		}
		return response;
	}//end of addEmployee
	
	@DeleteMapping("/deleteEmployee")
	public EmployeeResponse deleteEmployee(int empId) {
		boolean isDeleted = service.deleteEmployee(empId);
		EmployeeResponse response = new EmployeeResponse();
		if(isDeleted) {
			response.setStatusCode(201);
			response.setMessage("Success");
			response.setDescription("Employee is deleted Successfully..");
		}else {
			response.setStatusCode(401);
			response.setMessage("Failed");
			response.setDescription("Unable to delete employee!");
		}
		return response;
	}
	
	@PostMapping("/updateEmployee")
	public boolean updateEmployee(@RequestBody EmployeeInfoBean employeeInfoBean) {
		return service.updateEmployee(employeeInfoBean);
	}
	
	@GetMapping("/getAll")
	public EmployeeResponse getAllEmployees() {
		List<EmployeeInfoBean> list = service.getAllEmployees();
		EmployeeResponse response = new EmployeeResponse();
		if(list != null && !list.isEmpty()) {
			response.setStatusCode(201);
			response.setMessage("Success");
			response.setDescription("Employees data Found");
			response.setEmployeeList(list);
		}else {
			response.setStatusCode(401);
			response.setMessage("Failed");
			response.setDescription("Data could not fetch");
		}
		return response;
	}
	
}//end of class
