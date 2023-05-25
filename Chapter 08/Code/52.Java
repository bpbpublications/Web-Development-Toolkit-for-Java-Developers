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
Accessing Bean Values using Expression Language 
</center>
</h1>

<br/>

<h2><center> Time Table </center></h2>

<table border="1">
<tr>
<th>Date </th>
<th>Day  </th>
<th>Hour </th>
<th>Program </th>
<th>Semester </th>
<th>Faculty ID </th>
<th>Faculty Name </th>
<th>Course ID  </th>
<th>Course Name </th>
</tr>
<tr>
<td> ${t.dateofweek} </td>
<td> ${t.dayofweek}  </td>
<td>  ${t.hourofday}   </td>
<td> ${t.course.programName}  </td>
<td>  ${t.course.semesterNumber}  </td>
<td>  ${t.faculty.facultyId}             </td>
<td>  ${t.faculty.facultyName}       </td>
<td>  ${t.course.courseId}               </td>
<td> ${t.course.courseName}         </td>
</tr>
</table>
</body>
</html>
