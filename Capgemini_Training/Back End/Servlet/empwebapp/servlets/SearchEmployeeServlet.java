package com.capgemini.empwebapp.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.capgemini.empwebapp.beans.EmployeeInfoBean;
import com.capgemini.empwebapp.dao.EmployeeDAO;
import com.capgemini.empwebapp.dao.EmployeeDAOJpaImpl;

@WebServlet("/searchEmployee")
public class SearchEmployeeServlet extends HttpServlet{
@Override
protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

	String empIdVal = req.getParameter("empId");
	int id = Integer.parseInt(empIdVal);
	
	EmployeeDAO dao = new EmployeeDAOJpaImpl();
	EmployeeInfoBean employee = dao.getEmployee(id);
	
	resp.setContentType("text/html");
	PrintWriter out = resp.getWriter();
	
	out.println("<html>");
	out.println("<body>");
	
	if (employee != null) {
		//display record
		out.println("<h2> Employee ID" +id + " Found-</h2>");
		out.println("Employee Name : " +employee.getEmpId());
		out.println("<br>Age : " +employee.getAge());
		out.println("<br>Mobile : " +employee.getMobile());
		out.println("<br>Gender : " +employee.getGender());
		out.println("<br>Salary : " +employee.getSalary());
		out.println("<br>Designation : " +employee.getDesignation());
		out.println("<br>Password : " +employee.getPassword());
	}else {
		//error
		out.println("<h3 style='color :red'>Employee ID " +id +" Not Found!!!</h3>");
	}
	out.println("</body>");
	out.println("</html>");
	


}//end of 
	
}//end of class
