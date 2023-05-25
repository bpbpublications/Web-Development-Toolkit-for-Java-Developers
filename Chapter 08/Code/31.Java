<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>JSP Page</title>
</head>
<body>
<h1>Request Scope Sharing</h1>
<h2>Page 1</h2>
<jsp:useBean id="requestbean" class="src.MusicBean" scope="request"/>
        This is request scope example.
        The bean value is available for the current request between the two pages.
<jsp:setProperty name="requestbean" property="*"/>
<h3>
            Music Genre :<jsp:getProperty name="requestbean" property="musicgenre"/><br/>
            Artist Name :<jsp:getProperty name="requestbean" property="artistname"/><br/>
</h3>
<hr/>
<h2>Page 2</h2>
<jsp:include page="page2.jsp" />
</body>
</html>
