•	Servlet
ValueObject value = new ValueObject(...); 
HttpSession session = request.getSession();
session.setAttribute("key", value);
RequestDispatcher dispatcher = request.getRequestDispatcher("/WEB-			INF/SomePage.jsp"); 
dispatcher.forward(request, response); 
•	JSP Page
<jsp:useBeanid="key“ type="somePackage.ValueObject“   scope="session" />
<jsp:getProperty name="key" property="someProperty" />
