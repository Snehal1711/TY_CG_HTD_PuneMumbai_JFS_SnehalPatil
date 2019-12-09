package com.capgemini.empwebapp.servlets;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class DateServlet extends HttpServlet{
	
	public DateServlet() {
		System.out.println("its Instatiation Phase");
	}
	
	@Override
	public void init() throws ServletException {
		System.out.println("Its Initialization Phase");
	}
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("Its Service Phase");
		
		
		Date date = new Date();
		//resp.setHeader("refresh" , "1");
		
		resp.setContentType("text/html");
		ServletContext context =getServletContext();
		String companyNameVal = context.getInitParameter("companyName");
		
		PrintWriter out =resp.getWriter();
		out.println("<html>");
		//out.println("<head>");
		//out.println("<meta http-equiv='refresh' content='1'>");
		//out.println("<meta http-equiv=\"refresh\" content=\"1\">"); //we can this line also
		//out.println("</head>");
		out.println("<body>");
		out.println("<h1>Current System date and Time<br>");
		out.println("<h2>Context param value is :"+companyNameVal+ "</h2>");
		out.println(date + "</h1>");
		out.println("</body>");
		out.println("</html>");
		
	}//end of doGet()

	 @Override
	public void destroy() {
		 System.out.println(" Its Destroy Phase");
	 }
}//end of class

