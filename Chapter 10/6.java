<sql:param [value="parameter value"]>
JSP body 
</sql:param>

Attribute:
value	: No	The parameter value for the SQL statement.
Example:

<sql:query sql="select * from bookstore  where price > ?">
   <sql:param value="${lowPrice}"/>
</sql:query>
