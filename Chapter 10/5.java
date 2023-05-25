<sql:update [var="variable name"]
  [scope="page|request|session|application"]
  [sql="SQL update statement"]
  [dataSource="DataSource"]>
  JSP body 
</sql:update>

Attribute(s):
var : This specifies the variable that contains the result of the SQL update statement
scope : Scope of the variable specified in the var attribute. This can be page, request, session, or application.
sql : The SQL update statement to execute.
dataSource : The DataSource for the database to be accessed.

Example:
<sql:update>
  UPDATE orders SET deliver_date = ?
  WHERE order_id = ?
  <sql:param value="${param.deliver_date}" />
  <sql:param value="${param.order_id}" />
</sql:update>
