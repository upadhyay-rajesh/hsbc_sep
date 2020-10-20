

<%

	String n=request.getParameter("name");

	if(n.equals("rajesh")){ %>
		<font color=red>INVALID USER</font>
	<%}
	else{ %>
		<font color=green>VALID USER</font>
	<%}

%>