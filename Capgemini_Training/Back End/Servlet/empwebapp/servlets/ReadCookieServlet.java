package com.capgemini.empwebapp.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/readCookie")
public class ReadCookieServlet extends HttpServlet{
	
@Override
protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		Cookie[] cookies =req.getCookies();
		
		resp.setContentType("text/html");
		PrintWriter out = resp.getWriter();
		out.println("<html>");
		out.println("<body>");
		for(Cookie c : cookies) {
			out.println("Cookie name = "+c.getName());
			out.println("Cookie Value = "+c.getValue());
		}
		
		out.println("</body>");
		out.println("</html>");
	}//end of doget
}//end of class
