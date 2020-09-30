<%@page import="com.facebookweb.entity.FacebookUser,com.facebookweb.Service.FacebookServiceInterface,com.facebookweb.utility.FacebookServiceFactory" %>

<%
		String name=request.getParameter("name");
		String password=request.getParameter("password");
		String email=request.getParameter("email");
		String address=request.getParameter("address");
		
		FacebookUser fe=new FacebookUser();
		fe.setName(name);
		fe.setAddress(address);
		fe.setEmail(email);
		fe.setPassword(password);
		
		FacebookServiceInterface fs=FacebookServiceFactory.createObject();
		int i=fs.createProfile(fe);
		
		
		if(i>0) {
			
%>	
			Registration successful   <a href=login.html>Continue...</a>			
			Your Name is <%= name %>
			<br>Your Password is <%= password %>
			
<%
	} 
%>
		