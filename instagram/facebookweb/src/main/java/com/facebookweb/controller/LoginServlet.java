package com.facebookweb.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.facebookweb.Service.FacebookServiceInterface;
import com.facebookweb.entity.FacebookUser;
import com.facebookweb.utility.FacebookServiceFactory;

/**
 * Servlet implementation class LoginServlet
 */
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String name=request.getParameter("name");
		String password=request.getParameter("password");
		
		FacebookUser fUser = new FacebookUser();
		fUser.setName(name);
		fUser.setPassword(password);
		
		
		FacebookServiceInterface f = FacebookServiceFactory.createObject();
		boolean i=f.loginProfile(fUser);
		
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		out.println("<html><body>");
		if(i) {
			
			HttpSession ss=request.getSession(true);
			ss.setAttribute("userid", name);
			ss.setAttribute("pass", password);
			
			out.println("welcome "+name+"   <a href=TimeLine>timeline</a>   <a href=FriendList>friendlist</a>");
	
		}
		else {
			out.println("Invalid id and password");
			RequestDispatcher rd=getServletContext().getRequestDispatcher("/login.html");
			rd.include(request, response);
			//use response.setRedirect(""); for sending between containers.
		}
		out.println("</body></html>");
	}

}
