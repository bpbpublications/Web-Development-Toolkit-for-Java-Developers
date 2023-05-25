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
Accessing Collections using Expression Language
</center>
</h1>
<br/>
<table border="3" width="500">
<tr>
<th> Artist Name </th>
<th> Music Genre </th>
<th> Origin of Music </th>
</tr>
<tr>
<td>${artist[0]}</td>
<td>${genre[0]}</td>
<td>${origin["Pop Music"]}</td>
</tr>
<tr>
<td>${artist[1]}</td>
<td>${genre[1]}</td>
<td>${origin["Rhythm and Blues"]}</td>
</tr>
<tr>
<td>${artist[2]}</td>
<td>${genre[2]}</td>
<td>${origin["Jazz"]}</td>
</tr>
<tr>
<td>${artist[3]}</td>
<td>${genre[3]}</td>
<td>${origin["Rock"]}</td>
</tr>
</table>
</body>
</html>

