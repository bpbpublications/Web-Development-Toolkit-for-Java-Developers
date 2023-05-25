The syntax is as follows:
<sql:query var="variable name"
  [scope="page|request|session|application"]
  [sql="SQL query statement"]
  [startRow="starting row"]
  [maxRows="maximum number of rows"]
  [dataSource="DataSource"]>

  JSP body (Instead of using the sql attribute, the SQL query statement can be entered here)

</sql:query>

Attribute:
var :	This specifies the variable that contains the result of the SQL query statement.
scope : Scope of the variable specified in the var attribute. This can be page, request, session, or application.
sql : The SQL query statement to execute.
startRow :  The starting row for the returned results.
maxRows : The maximum number of rows to return. The default is no maximum limit.
dataSource : The dataSource attribute is used to reference a DataSource that was configured by using the </sql:setDataSource> action.

Example:

 <sql:query var="sqlresult" sql="select * from bookstore  where price < ?"
     dataSource="jdbc:mysql://localhost:3306/customerdb, com.mysql.jdbc.Driver, root, root">
   <sql:param value="${fromPrice}" />
 </sql:query>
