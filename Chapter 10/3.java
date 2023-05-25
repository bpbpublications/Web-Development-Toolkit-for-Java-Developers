<sql:setDataSource [var="variable name"]
  [scope="page|request|session|application"]
  [driver="JDBC driver"]
  [url="JDBC URL for database"]
  [user="Username to connect to the database"]
  [password="Password to connect to the database"]
  [dataSource="DataSource"]/>

Attribute:
var : This specifies the variable that contains the specified DataSource.
scope	: Scope of the variable specified in the var attribute. This can be page, request, session, or application.
driver	 : JDBC driver class name.
url :	JDBC URL for database.
user :	Username to connect to the database.
password :	Password to connect to the database.
dataSource : The DataSource for the database to be accessed.

Example:
<sql:setDataSource 
  var="dataSource" 
  driver="org.acme.sql.driver"
  url="jdbc:msql://localhost/tempDB" 
  user="Dan" 
  password="pwd"/>
