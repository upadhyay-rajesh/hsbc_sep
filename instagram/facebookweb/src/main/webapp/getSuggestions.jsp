<%@page import="java.util.*, com.facebookweb.entity.FacebookUser,com.facebookweb.Service.FacebookServiceInterface,com.facebookweb.utility.FacebookServiceFactory" %>



<% 

String inputtext=request.getParameter("name");

FacebookServiceInterface fs=FacebookServiceFactory.createObject();

List<String> suggestionList = fs.getSuggestions(inputtext);

out.println("<ul>");

for(String city: suggestionList){
	out.println("<li>" + city + "</li>");
}
out.println("</ul>");

%>
