<!DOCTYPE html>
<html>
<head>
<title>Student Information</title>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
</head>
<body>
<h2>Student Details </h2>
<jsp:useBean id="s1" class="studentinformation.StudentBean"/>
<jsp:setProperty name="s1" property="id" />
<jsp:setProperty name="s1" property="name" />
<jsp:setProperty name="s1" property="program" />
<jsp:setProperty name="s1" property="semester" />
<jsp:setProperty name="s1" property="marks1" />
<jsp:setProperty name="s1" property="marks2" />
<jsp:setProperty name="s1" property="marks3" />


<table>
<tr>
<td>Student ID :</td>
<td><input type="text" name="id" required/><br/></td>
</tr>
<tr>
<td>Student Name :</td>
<td><input type="text" name="name" required/><br/></td>
</tr>
<tr>
<td>Student Enrolled Programm :</td>
<td><input type="text" name="program" required/><br/></td>
</tr>
<tr>
<td>Student Semester :</td>
<td><input type="text" name="semester" required/><br/></td>
</tr>
<tr>
<td> Java Marks out of 100 :</td>
<td><input type="text" name="marks1" required/><br/></td>
</tr>
<tr>
<td>PHP Marks  out of 100: </td>
<td><input type="text" name="marks2" required/><br/></td>
</tr>
<tr>
<td>.Net Marks  out of 100:</td>
<td><input type="text" name="marks3" required/><br/></td>
</tr>
<tr>
<td><input type="submit" value="Calculate Grade"/></td>
</tr>
</table>
</form>
</body>
</html>
