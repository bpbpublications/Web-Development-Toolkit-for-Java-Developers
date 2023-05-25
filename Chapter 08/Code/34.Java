<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>JSP Page</title>
</head>
<body>
<h1>Session Scope Sharing</h1>

<jsp:useBean id="sessionbean" class="src.MusicBean" scope="session"/>
        This is session scope example.
        The bean value is available between multiple requests.
<jsp:setProperty name="sessionbean" property="*"/>
<h3>
            Music Genre :<jsp:getProperty name="sessionbean" property="musicgenre"/><br/>
            Artist Name :<jsp:getProperty name="sessionbean" property="artistname"/><br/>
</h3>

</body>
</html>

