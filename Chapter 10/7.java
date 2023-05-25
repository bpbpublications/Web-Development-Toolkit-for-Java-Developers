<sql:dateParam value="date type value"
[type="date|time|timestamp"] />

Attribute:
value : The parameter value for the SQL statement. This can be a date, time, or timestamp.
type : The type of parameter. This can be date, time, or timestamp.

Example:
<sql:query sql="select * from employee where join_date > ?">
<sql:dateParam value="${cutoff_date}" type="date"/>
</sql:query>
