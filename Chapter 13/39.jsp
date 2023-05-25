<%@  taglib  prefix="form"  uri="http://www.springframework.org/tags/form"  %>    
<html>    
<head>    
<style>    
.error{color:red}    
</style>    
</head>    
<body>    
<form:form  action="helloagain"  modelAttribute="emp">    
Username:  <form:input  path="name"/>  <br><br>    
Password(*):  <form:password  path="pass"/>        
<form:errors  path="pass"  cssClass="error"/><br><br>    
<input  type="submit"  value="submit">    
</form:form>    
</body>    
</html>    
final.jsp
<html>    
<body>    
Username:  ${emp.name}  <br><br>    
Password:  ${emp.pass}    
</body>    
</html>    
