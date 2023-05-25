<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>JSP Page</title>
</head>
<body>
<h1>
<center>
                Accessing Scoped Variables using Expression Language
</center>
</h1>
<br/>
        Accessing three different variables from different scopes
<ul>
<li>${requestscopevariable}</li>
<li>${sessionscopevariable}</li>
<li>${applicationscopevariable}</li>
</ul>

        Accessing same variable from different scopes
<ul>
<li>${commonscopevariable}</li>
</ul>
</body>
</html>
