package com.facebookweb.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.facebook.entity.FacebookUser;
import com.facebookweb.service.FacebookwebServiceInterface;
import com.facebookweb.utility.ServiceFactory;

/**
 * Servlet implementation class FriendList
 */
public class FriendList extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		// TODO Auto-generated method stub
	
		HttpSession ss=request.getSession(true);
		String name=ss.getAttribute("userid").toString();
		
		System.out.println(name);
		
		FacebookUser u=new FacebookUser();
		u.setName(name);
		
		FacebookwebServiceInterface s= ServiceFactory.createObject("adminpath");
		List<FacebookUser> i=s.friendProfile(u);
		
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		out.println("<html><body>");
		
		if(i.size()>0)
		{
			for(FacebookUser f:i) {
				out.println(f.getName());
			}
		}
		
		else {
			out.println("no friend found");
		}
		
		out.println("</body></html>");
	}

}
