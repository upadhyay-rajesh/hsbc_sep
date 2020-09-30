
<%@page import="java.util.*,com.facebookweb.service.FacebookServiceInterface,com.facebookweb.utility.ServiceFactory" %>


<%--FacebookServiceInterface fs=ServiceFactory.createObject("user");
List<String> i=fs.country(); --%>

<%
String cname=request.getParameter("statename");

List<String> i=new ArrayList<String>();

if(cname.equals("Karnataka")){
	i.add("Bangalore");
	i.add("Mysuru");
}
if(cname.equals("Punjab")){
	i.add("Amritsar");
	i.add("Chandigarh");
}
if(cname.equals("Sansfransisko")){
	i.add("aa");
	i.add("bb");
}
if(cname.equals("Bostan")){
	i.add("cc");
	i.add("dd");
}



String ss="<select id=cc name=city  >";
for(String ll:i){
	ss=ss+"<option value='"+ll+"'>"+ll+"</option>";
}
ss=ss+"</select>";

out.println(ss);
%>