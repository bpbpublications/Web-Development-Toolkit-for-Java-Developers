•	Servlet
ValueObject value = new ValueObject(...);
request.setAttribute("key", value); RequestDispatcher dispatcher = request.getRequestDispatcher("/WEB-INF/SomePage.jsp"); dispatcher.forward(request, response); 
•	JSP Page
<jsp:useBean id="key“ type="somePackage.ValueObject" scope="request" />
<jsp:getProperty name="key" property="someProperty" />
