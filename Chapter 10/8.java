<sql:transaction [dataSource="DataSource"]
     	  [isolation="read_committed|read_uncommitted|repeatable_read|serializable"] >
  JSP body 
</sql:transaction>

Attribute:

dataSource : The DataSource for the database to be accessed.
isolation : Isolation level for the transaction. This can be read_committed, read_uncommitted, repeatable_read, or serializable :  This is an optional attribute and defaults to the DataSource isolation level.


Example:
<sql:transaction>
  <sql:update sql="update bookstore set price = price+? where isbn_no = ?">
    <sql:param value="${price_increase}"/>
    <sql:param value="${id}"/>
  </sql:update>
  <sql:update sql="update bookstore set price = price-? where isbn_no = ?">
    <sql:param value="${price_reduction}"/>
    <sql:param value="${id}"/>
  </sql:update>
</sql:transaction>

