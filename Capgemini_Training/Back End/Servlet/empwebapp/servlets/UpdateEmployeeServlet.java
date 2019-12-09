package com.capgemini.empwebapp.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.capgemini.empwebapp.beans.EmployeeInfoBean;
import com.capgemini.empwebapp.dao.EmployeeDAO;
import com.capgemini.empwebapp.dao.EmployeeDAOJpaImpl;

@WebServlet("/updateEmployee")
public class UpdateEmployeeServlet extends HttpServlet{

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		PrintWriter out=resp.getWriter();
		HttpSession session = req.getSession();
		if(session!=null) {
			//valid session
			int empId = Integer.parseInt(req.getParameter("empId"));
			String name = req.getParameter("empname");
			String password =req.getParameter("password");
			String mobileno =req.getParameter("mobile");
			String desig = req.getParameter("designation");
			String sal =req.getParameter("salary");
			String gender =req.getParameter("gender");
			String age = req.getParameter("age");
			
			EmployeeInfoBean emp = new EmployeeInfoBean();
			emp.setEmpId(empId);
			if(name != null && !name.isEmpty()) {
				emp.setEmpname(name);
			}
			if(age != null && !age.isEmpty()) {
				emp.setAge(Integer.parseInt(age));
			}
			if(sal != null && !sal.isEmpty()) {
				emp.setSalary(Double.parseDouble(sal));
			}
			if(mobileno != null && !mobileno.isEmpty()) {
				emp.setMobile(Long.parseLong(mobileno));
			}
			if(gender != null && !gender.isEmpty()) {
				emp.setGender(gender.charAt(0));
			}
			if(desig != null && !desig.isEmpty()) {
				emp.setDesignation(desig);
			}
			if(password != null && !password.isEmpty()) {
				emp.setPassword(password);
			}
					
			EmployeeDAO dao= new EmployeeDAOJpaImpl();
			boolean isAdded = dao.updateEmployee(emp);
			out.println("<html>");
			out.println("<body>");
			if(isAdded) {
				out.println("<h2>EmployeeInfo Updated Successfully...</h2>");
				
			}else {
				out.println("<h2 style='color:red'>Unable to find ID</h2>");
			}
			out.println("</body>");
			out.println("</html>");
			RequestDispatcher dispatcher=req.getRequestDispatcher("./updateEmployee.html");
			dispatcher.include(req, resp);
		}else {
			//invalid session
			out.println("<html>");
			out.println("<body>");
			out.println("<h2 style='color : red'>Please Login First</h2>");
			out.println("</body>");
			out.println("</html>");
			RequestDispatcher dispatcher=req.getRequestDispatcher("./loginForm.html");
			dispatcher.include(req, resp);
		}
	}//end dopost
}//end of class
