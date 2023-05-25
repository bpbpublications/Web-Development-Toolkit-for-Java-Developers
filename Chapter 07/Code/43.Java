<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <% String address,uname,pwd;
           uname=request.getParameter("uname");
           pwd=request.getParameter("pwd");
		 if (uname.equals("admin") && pwd.equals("admin")) 
                        {
			 address = "success.jsp";
		 }
	 	else
		 { 
			address = "error.jsp";
		 }
                 request.setAttribute("u",uname);
	 %>
	 <jsp:forward page="<%= address %>" /> 

    </body>
</html>
