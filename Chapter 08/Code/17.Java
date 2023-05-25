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
<jsp:setProperty name="s1" property="id" param="studentid"/>
<jsp:setProperty name="s1" property="name" param="studentname"/>
<jsp:setProperty name="s1" property="program" param="studentprogram"/>
<jsp:setProperty name="s1" property="semester" param="studentsemester"/>
<jsp:setProperty name="s1" property="marks1" param="marks1"/>
<jsp:setProperty name="s1" property="marks2" param="marks2"/>
<jsp:setProperty name="s1" property="marks3" param="marks3"/>

<table>
<tr>
<td>Student ID :</td>
<td><jsp:getProperty name="s1" property="id" /><br/></td>
</tr>
<tr>
<td>Student Name :</td>
<td><jsp:getProperty name="s1" property="name" /><br/></td>
</tr>
<tr>
<td>Student Enrolled Program: </td>
<td><jsp:getProperty name="s1" property="program" /><br/></td>
</tr>

<tr>
<td>Java Marks  :</td>
<td><jsp:getProperty name="s1" property="marks1" /><br/></td>
</tr>
<tr>
<td>PHP Marks  :</td>
<td><jsp:getProperty name="s1" property="marks2" /><br/></td>
</tr>
<tr>
<td>.Net Marks  :</td>
<td><jsp:getProperty name="s1" property="marks3" /><br/></td>
</tr>
<tr>
<td>Grade  :</td>
<td><jsp:getProperty name="s1" property="grade" /><br/></td>
</tr>
</table>
</body>
</html>
