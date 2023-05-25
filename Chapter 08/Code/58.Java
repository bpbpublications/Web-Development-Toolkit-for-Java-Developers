<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Student Result</title>
<style>
.fail{
                color: red;
                font-weight: bold;
            }
.pass{
                color: forestgreen;
                font-weight: bold;
            }
.gradeaa{
                color: blueviolet;
                font-weight: bold;
            }
.gradebb{
                color: aqua;
                font-weight: bold;
            }
.gradecc{
                color: deeppink;
                font-weight: bold;
            }
.gradedd{
                color: rosybrown;
                font-weight: bold;
            }
.gradeff{
                color: tomato;
                font-weight: bold;
            }
</style>
</head>
<body>
<h1>Student Marksheet</h1>
<table>
<tr>
<td>Student ID :</td>
<td> ${s.studentid}</td>
</tr>
<tr>
<td>Student Name :</td>
<td> ${s.studentname}</td>
</tr>
<tr>
<td>Java :</td>

<td class="${(s.marks1<35)?"fail":"pass"}"> ${s.marks1}</td>
</tr>
<tr>
<td> Php :</td>
<td class="${(s.marks2<35)?"fail":"pass"}"> ${s.marks2}</td>
</tr>
<tr>
<td>.Net :</td>
<td class="${(s.marks3<35)?"fail":"pass"}">${s.marks3}</td>
</tr>
<tr>
<td> Grade:</td>
<td class="${ (s.grade=='AA') ? "gradeaa" : (s.grade=='BB') ? "gradebb" :
(s.grade=='CC') ? "gradecc" : (s.grade=='DD') ? "gradedd" : "gradeff"}">
                    ${s.grade}</td>
</tr>
</table>
</body>
</html>
