
<%@page import="java.util.*,com.facebookweb.service.FacebookServiceInterface,com.facebookweb.utility.ServiceFactory" %>


<%--FacebookServiceInterface fs=ServiceFactory.createObject("user");
List<String> i=fs.country(); --%>

<%
List<String> i=new ArrayList<String>();
i.add("India");
i.add("US");
String ss="<select id=cc name=country   onchange=loadstate()>";
for(String ll:i){
	ss=ss+"<option value='"+ll+"'>"+ll+"</option>";
}
ss=ss+"</select>";

out.println(ss);
%>