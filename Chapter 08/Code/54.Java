<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>JSP Page</title>
</head>
<body>
<h1> Operators in expression language </h1>
<table border="1">
<tr>
<th> Expressions </th>
<th> Results </th>
</tr>
<tr>
<td> \${10 mod 3)} </td>
<td> ${10 mod 3} </td>
</tr>
<tr>
<td> \${6.0 >= 3} </td>
<td> ${6.0 >= 3} </td>
</tr>
<tr>
<td> \${7 > 3} </td>
<td> ${7 > 3} </td>
</tr>
<tr>
<td> \${'a' < 'b'} </td>
<td> ${'a' < 'b'} </td>
</tr>
<tr>
<td> \${7 > (3 / 2)} </td>
<td> ${7 > (3 / 2)} </td>
</tr>
<tr>
<td> \${10.0 == 10} </td>
<td> ${10.0 == 10} </td>
</tr>
<tr>
<td> \${(16*10) ne 300} </td>
<td> ${(16*10) ne 300} </td>
</tr>
<tr>
<td> \${'abc' gt 'aef'} </td>
<td> ${'abc' gt 'aef'} </td>
</tr>
<tr>
<td> \${1.6E4 + 1.2} </td>
<td> ${1.6E4 + 1.2} </td>
</tr>
<tr>
<td> \${10 div 7} </td>
<td> ${10 div 7} </td>
</tr>
<tr>
<td> \${10 mod 7} </td>
<td> ${10 mod 7} </td>
</tr>
<tr>
<td> \${!empty param.firstname} </td>
<td> ${!empty param.firstname} </td>
</tr>
</table>
</body>
</html>
