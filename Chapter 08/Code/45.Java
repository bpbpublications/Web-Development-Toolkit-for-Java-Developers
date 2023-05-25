<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>JSP Page</title>
</head>
<body>
<h1>Accessing implicit objects</h1>
<ul>
<li><B>Request Parameter:</B> ${param.firstname}</li>
<li><B>Host Header:</B> ${header["Host"]}</li>
<li><B>Server:</B> ${pageContext.servletContext.serverInfo} </li>
</ul>
</body>
</html>

