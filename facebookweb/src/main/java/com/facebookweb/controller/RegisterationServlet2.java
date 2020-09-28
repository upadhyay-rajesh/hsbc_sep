package com.facebookweb.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.facebook.entity.FacebookUser;
import com.facebookweb.service.FacebookwebServiceInterface;
import com.facebookweb.utility.ServiceFactory;

/**
 * Servlet implementation class RegisterationServlet2
 */
public class RegisterationServlet2 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public RegisterationServlet2() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub

		String name=request.getParameter("name");
		String password=request.getParameter("password");
		String email=request.getParameter("email");
		String address=request.getParameter("address");
		
		FacebookwebServiceInterface s= ServiceFactory.createObject("adminpath");
		
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		FacebookUser f=new FacebookUser();
		f.setAddress(address);
		f.setEmail(email);
		f.setName(name);
		f.setPassword(password);
		
		int i=0;
		try {
			 i= s.createProfileService(f);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		out.println("<html><body>");
		if(i>0) {
			out.println("Registration successful <a href=login.html> ");
			out.println("<br> Your name is : "+ name);
			out.println("<br> Your password is : "+password);
			
		}
		out.println("</body></html>");
	
	}

}
