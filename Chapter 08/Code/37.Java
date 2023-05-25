<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>JSP Page</title>
</head>
<body>
<h1>Application Scope Sharing</h1>

<jsp:useBean id="applicationbean" class="src.MusicBean" scope="application"/>
        This is Application scope example.
        The bean value is available between multiple requests, event after the session timeout.
<jsp:setProperty name="applicationbean" property="*"/>
<h3>
            Music Genre :<jsp:getProperty name="applicationbean" property="musicgenre"/>
<br/>
            Artist Name :<jsp:getProperty name="applicationbean" property="artistname"/><br/>
</h3>
</body>
</html>
