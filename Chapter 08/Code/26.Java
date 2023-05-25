<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>JSP Page</title>
</head>
<body>
<h1>Hello from page 3.</h1>
<h3>
<jsp:useBean id="c" class="src.PageAccessCount" scope="application">
<jsp:setProperty name="c" property="pagename" 
value='<%=request.getParameter("fp")%>'/>
</jsp:useBean>

The <jsp:getProperty name="c" property="pagename"/> page is accessed first. All the pages have been accessed <jsp:getProperty name="c" property="count"/> times.
<jsp:setProperty name="c" property="count" value="1"/>
</h3>
</body>
</html>
