<h2>Student Marks Input Form </h2>
<form>
    <table>
        <tr>
		<td>Student ID : </td>
		<td><%=request.getParameter("studentid")%> <br/></td>
	     </tr> 
      <tr>
		<td>Student Name : </td>
		<td><%=request.getParameter("studentname")%> <br/></td>
      </tr>
    <%
    	Double m1=Double.parseDouble(request.getParameter("marks1"));
		Double m2=Double.parseDouble(request.getParameter("marks2"));
		Double m3=Double.parseDouble(request.getParameter("marks3"));
		Double per=(m1+m2+m3)/3;
		String grade="";
		 if (m1<=35 || m2<=35 || m3<=35)
		        grade="FF";
    	else if(per>=80)
        		grade="AA";
    	else if(per>=70)
        		grade="BB";
    	else if(per>=60)
        		grade="CC";
    	else 
        		grade="DD";
    %>
   <tr>
		<td>Java Marks  : </td><td><%=m1%><br/></td>
  </tr> 
	 <tr>
		<td>PHP Marks  : </td><td><%=m2%><br/></td>
  </tr> 
   <tr>
		<td>.Net Marks  : </td><td><%=m3%><br/></td>
  </tr> 
   <tr>
		<td>Grade  : </td><td><%=grade%><br/></td>
  </tr> 
</form>
