<%@page import="com.facebookweb.entity.FacebookUser,com.facebookweb.Service.FacebookServiceInterface,com.facebookweb.utility.FacebookServiceFactory" %>



<% 

String email=request.getParameter("email");
FacebookUser fUser=new FacebookUser();
fUser.setEmail(email);

FacebookServiceInterface fs=FacebookServiceFactory.createObject();
boolean userAlreadyExists = fs.doesUserExist(fUser);

if(userAlreadyExists){
	out.println("<font color=red>Email already exists</font>");
}
else {
	out.println("<font color=green>Email does not exist</font>");
}
%>
