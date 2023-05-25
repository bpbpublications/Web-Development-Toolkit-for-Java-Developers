<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>JSP Page</title>
</head>
<body>
<h1>Page Scope Sharing</h1>
<jsp:useBean id="pagebean" class="src.MusicBean" scope="page"/>
        This is page scope example.
        The bean value is available for the current request.

<jsp:setProperty name="pagebean" property="*"/>

<h3>
            Music Genre :<jsp:getProperty name="pagebean" property="musicgenre"/><br/>
            Artist Name :<jsp:getProperty name="pagebean" property="artistname"/><br/>
</h3>
</body>
</html>
