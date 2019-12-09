package com.capgemini.empwebapp.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/forward")
public class ForwardServlet extends HttpServlet {
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		//String url ="./currentDate"; // dynamic 
				String url ="./searchEmployeeForm.html";  //static
		PrintWriter out =resp.getWriter();
		out.println("<html>");
		out.println("<body>");
		out.println("<h3> Hello User</h3>");
		
		
		RequestDispatcher dispatcher = req.getRequestDispatcher(url);
		dispatcher.forward(req, resp);
		out.println("<h2>Thanks for Visiting</h2>");
		out.println("</body>");
		out.println("</html>");
	}
	

}
