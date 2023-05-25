<!DOCTYPE html>
<html>
<head>
<title>Student Information</title>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
</head>
<body>
<h2>Student Details </h2>
<%
studentinformation.StudentBean s1 = new studentinformation.StudentBean();
s1.setId(request.getParameter("studentid"));
            s1.setName(request.getParameter("studentname"));
            s1.setProgram(request.getParameter("studentprogram"));

            try {
s1.setSemester(Integer.parseInt(request.getParameter("studentsemester")));
                s1.setMarks1(Double.parseDouble(request.getParameter("marks1")));
                s1.setMarks2(Double.parseDouble(request.getParameter("marks2")));
                s1.setMarks3(Double.parseDouble(request.getParameter("marks3")));
                s1.setGrade();
               } catch (NumberFormatException nfe) {

            }
        %>
<table>
<tr>
<td>Student ID :</td>
<td><%=s1.getId()%><br/></td>
</tr>
<tr>
<td>Student Name :</td>
<td><%=s1.getName()%><br/></td>
</tr>
<tr>
<td>Student Enrolled Program: </td>
<td><%=s1.getProgram()%><br/></td>
</tr>
<tr>
<td>Java Marks  :</td>
<td><%=s1.getMarks1()%><br/></td>
</tr>
<tr>
<td>PHP Marks  :</td>
<td><%=s1.getMarks2()%><br/></td>
</tr>
<tr>
<td>.Net Marks  :</td>
<td><%=s1.getMarks3()%><br/></td>
</tr>
<tr><td>Grade  :</td>
<td><%=s1.getGrade()%><br/></td>
</tr>
</table>
</body>
</html>
