package com.facebookweb.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.facebookweb.Service.FacebookServiceInterface;
import com.facebookweb.entity.FacebookUser;
import com.facebookweb.utility.FacebookServiceFactory;

/**
 * Servlet implementation class RegServlet
 */
public class RegServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String name = request.getParameter("name");
		String password = request.getParameter("password");
		String email = request.getParameter("email");
		String address = request.getParameter("address");
		
		FacebookUser fUser = new FacebookUser();
		fUser.setName(name);
		fUser.setPassword(password);
		fUser.setEmail(email);
		fUser.setAddress(address);
		
		FacebookServiceInterface f = FacebookServiceFactory.createObject();

		int	i =f.createProfile(fUser);

		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		out.println("<html><body>");
		if(i>0) {
			
			out.println("Registration successful   <a href=login.html>Contunue...</a>");
				
			out.println("Your Name is "+name);
			out.println("<br>Your Password is "+password);
			
		}
		out.println("</body></html>");
	}

}
