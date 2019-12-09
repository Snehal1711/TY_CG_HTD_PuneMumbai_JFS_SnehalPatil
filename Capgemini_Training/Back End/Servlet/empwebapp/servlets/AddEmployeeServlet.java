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

@WebServlet("/addEmployee")
public class AddEmployeeServlet extends HttpServlet{

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		PrintWriter out = resp.getWriter();
		HttpSession session =req.getSession();
		if(session != null) {
			//valid session
			//get the data
			int empId = Integer.parseInt(req.getParameter("empId"));
			String name =req.getParameter("empname");
			String password =req.getParameter("password");
			long mobile =Long.parseLong(req.getParameter("mobile"));
			String desig = req.getParameter("designation");
			double sal =Double.parseDouble(req.getParameter("salary"));
			String gender =req.getParameter("gender");
			
			EmployeeInfoBean emp = new EmployeeInfoBean();
			emp.setEmpId(empId);
			emp.setEmpname(name);
			emp.setSalary(sal);
			emp.setDesignation(desig);
			emp.setPassword(password);
			emp.setMobile(mobile);
			
			EmployeeDAO dao= new EmployeeDAOJpaImpl();
			boolean isAdded = dao.addEmployee(emp);
			out.println("<html>");
			out.println("<body>");
			if(isAdded) {
				out.println("<h2>Employee Added Successfully...</h2>");
				
			}else {
				out.println("<h2 style='color:red'>Unable to add Employee Record..</h2>");
			}
			out.println("</body>");
			out.println("</html>");
			
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
	}//end of dopost
}//end of class
