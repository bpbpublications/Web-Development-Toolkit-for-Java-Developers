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
<jsp:setProperty  name="s1" property="id"  
                                    value='<%=request.getParameter("studentid")%>'/>
<jsp:setProperty  name="s1" property="name"       
                                    value='<%=request.getParameter("studentname")%>'/>
<jsp:setProperty  name="s1" property="program"  
                                    value='<%=request.getParameter("studentprogram")%>'/>

<%
            int sem=0;
            double marks1=0, marks2=0, marks3=0;
            try {
                sem = Integer.parseInt(request.getParameter("studentsemester"));
                marks1 = Double.parseDouble(request.getParameter("marks1"));
                marks2 = Double.parseDouble(request.getParameter("marks2"));
                marks3 = Double.parseDouble(request.getParameter("marks3"));
            } catch (NumberFormatException nfe) {

            }
        %>
<jsp:setProperty name="s1" property="semester" value='<%=sem%>'/>
<jsp:setProperty name="s1" property="marks1" value='<%=marks1%>'/>
<jsp:setProperty name="s1" property="marks2" value='<%=marks2%>'/>
<jsp:setProperty name="s1" property="marks3" value='<%=marks3%>'/>
<jsp:setProperty name="s1" property="grade" value="Default" />

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
