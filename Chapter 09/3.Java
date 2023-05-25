•	Servlet
synchronized(this)
{ 
ValueObject value = new ValueObject(...); 
getServletContext().setAttribute("key", value);
RequestDispatcher dispatcher = 
request.getRequestDispatcher("/WEB-INF/SomePage.jsp"); dispatcher.forward(request, response); 
}
•	JSP Page
<jsp:useBeanid="key" type="Package.ValueObject" scope="application"/>
<jsp:getProperty name="key" property="someProperty" />
