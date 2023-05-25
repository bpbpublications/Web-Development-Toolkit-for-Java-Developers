<!DOCTYPE html>
<html>
<head>
<title> Expression Language </title>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
</head>
<body>
<h1> Time Table Entry Form </h1>
<form action="BeanServlet" method="post">
<table>
<tr>
<th>Date :</th>
<td><input type="text" name="txtdate" /></td>
</tr>
<tr>
<th>Time :</th>
<td><input type="text" name="txthour"/></td>
</tr>
<tr>
<th> Program Name :</th>
<td><input type="text" name="txtprg"/></td>
</tr>
<tr>
<th>Semester :</th>
<td><input type="text" name="txtsem"/></td>
</tr>
<tr>
<th> Course ID :</th>
<td><input type="text" name="txtcid"/></td>
</tr>
<tr>
<th> Course Name :</th>
<td><input type="text" name="txtcname" size="50"/></td>
</tr>

<tr>
<th> Faculty ID :</th>
<td><input type="text" name="txtfid"/></td>
</tr>
<tr>
<th> Faculty Name: </th>
<td><input type="text" name="txtfname"/></td>
</tr>
<tr>
<td colspan="2" align="center" ><input type="submit" value="Submit"/></td>
</tr>
</table>
</form>
</body>
</html>
