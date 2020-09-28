package com.InstaWeb.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.InstaWeb.service.InstaServiceInterface;
import com.InstaWeb.utility.InstaUser;
import com.InstaWeb.utility.ServiceFactory;

/**
 * Servlet implementation class RegisterationServlet
 */
public class RegisterationServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		String name=request.getParameter("name");
		String password=request.getParameter("password");
		String email=request.getParameter("email");
		String address=request.getParameter("address");
		
		InstaUser u=new InstaUser();
		InstaServiceInterface s=ServiceFactory.createObject("user");
		int i=-1;
		try {
			i = s.createProfileService(u);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		out.println("<html><body>");
		if(i>0) {
			
			out.println("Registration successful   <a href=login.html>Continue...</a>");
				
			out.println("Your Name is "+name);
			out.println("<br>Your Password is "+password);
			
		}
		out.println("</body></html>");
	}

}
