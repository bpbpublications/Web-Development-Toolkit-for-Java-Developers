<h2>Student Marks Input Form </h2>
<form action="DisplayMarks.jsp">
  <fieldset> 
    <legend> Student Marks out of 100</legend>
       <table>
        <tr>
		<td>Student ID : </td>
		<td><input type="text" name="studentid"/> <br/></td>
	      </tr> 
        <tr>
		<td>Student Name : </td>
		<td><input type="text" name="studentname"/><br/></td>
	      </tr> 
       <tr>
		<td> Java Marks  :</td> 
		<td><input type="text" name="marks1"/><br/></td>
	     </tr> 
       <tr>
		<td>PHP Marks  : </td>
           	<td><input type="text" name="marks2"/><br/></td>
	     </tr> 
      <tr>
		<td>.Net Marks  :</td>
		 <td><input type="text" name="marks3"/><br/></td>
	    </tr> 
      <tr>
		<td><input type="submit" value="Calculate Grade"/></td>
	    </tr>
        </table>
  </fieldset>
  </form>
