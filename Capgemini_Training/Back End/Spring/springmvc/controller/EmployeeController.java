package com.capgemini.springmvc.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.capgemini.springmvc.beans.EmployeeInfoBean;
import com.capgemini.springmvc.dao.EmployeeDAO;
import com.capgemini.springmvc.dao.EmployeeDAOJpaImpl;
import com.capgemini.springmvc.service.EmployeeService;

@Controller
public class EmployeeController {
	@Autowired
	private EmployeeService service;

	@GetMapping("/empLoginForm")
	public String displayEmpLoginForm() {
		return "empLoginForm";
	}// end of display

	@PostMapping("/empLogin")
	public String emppLogin(int empId, String password, ModelMap modelMap, HttpServletRequest req) {
		EmployeeInfoBean employeeInfoBean = service.authenticate(empId, password);
		modelMap.addAttribute("msg", "Invalid Credetials..");
		if (employeeInfoBean != null) {
			// Valid Credential
			HttpSession session = req.getSession(true);
			session.setAttribute("employeeInfoBean", employeeInfoBean);
			return "empHomePage";
		} else {
			// Invalid Credential
			return "empLoginForm";
		}
	}

	@GetMapping("/addEmployeeForm")
	public String displayAddEmployee(HttpSession session, ModelMap modelMap) {
		if (session.isNew()) {
			modelMap.addAttribute("msg", "Please Login first!!");
			return "empLoginForm";
		} else {
			return "addEmployeeForm";
		}
	}// end of displayAddemp

	@PostMapping("/addEmployee")
	public String addEmployee(EmployeeInfoBean employeeInfoBean, HttpSession session, ModelMap modelMap) {
		if (session.isNew()) {
			modelMap.addAttribute("msg", "Please login First!!");
			return "empLoginForm";
		} else {
			if (service.addEmployee(employeeInfoBean)) {
				modelMap.addAttribute("msg", "Employee Added Successfully..");
			} else {
				modelMap.addAttribute("msg", "unable to Add Employee");
			}
		}
		return "addEmployeeForm";
	}// end

	@GetMapping("/logout")
	public String logout(HttpSession session, ModelMap modelMap) {
		session.invalidate();

		modelMap.addAttribute("msg", "Logged Out Successfully");
		return "empLoginForm";
	}

	@GetMapping("/updateEmployeeForm")
	public String displayUpdateEmpForm(HttpSession session, ModelMap modelMap) {
		if (session.isNew()) {
			modelMap.addAttribute("msg", "Please Login first");
			return "empLoginForm";
		} else {
			return "updateEmployeeForm";
		}
	}// end

	@PostMapping("/updateEmployee")
	public String updateEmployee(HttpSession session, ModelMap modelMap, EmployeeInfoBean employeeInfoBean) {
		if (session.isNew()) {
			modelMap.addAttribute("msg", "Please login First!!");
			return "empLoginForm";
		} else {
			if (service.updateEmployee(employeeInfoBean)) {
				modelMap.addAttribute("msg", "Employee Details Updated Successfully..");
			} else {
				modelMap.addAttribute("msg", "unable to Update Employee");
			}
			return "updateEmployeeForm";
		}
	}

}
