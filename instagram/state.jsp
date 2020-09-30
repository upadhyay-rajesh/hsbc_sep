
<%@page import="java.util.*,com.facebookweb.service.FacebookServiceInterface,com.facebookweb.utility.ServiceFactory" %>


<%--FacebookServiceInterface fs=ServiceFactory.createObject("user");
List<String> i=fs.country(); --%>

<%
String cname=request.getParameter("countryname");

List<String> i=new ArrayList<String>();

if(cname.equals("India")){
	i.add("Karnataka");
	i.add("Punjab");
}
if(cname.equals("US")){
	i.add("Sansfransisko");
	i.add("Bostan");
}


String ss="<select id=ss name=state  onchange=loadcity()>";
for(String ll:i){
	ss=ss+"<option value='"+ll+"'>"+ll+"</option>";
}
ss=ss+"</select>";

out.println(ss);
%>