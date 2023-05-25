//ShowParameters.java
public class ShowParameters extends HttpServlet
 {
  public void doGet( HttpServletRequest request,  HttpServletResponse response )
  {
    response.setContentType("text/html");
    PrintWriter out = response.getWriter();
    	out.println(“ <!DOCTYPE  html> “ 
                          + " <HTML> \n "  
                          + " <HEAD> <TITLE> Parameters </TITLE> </HEAD> \n " 
                          +" <BODY > \n " 
                          +" <H1> Parameters  </H1> " ) ;
                Enumeration paramNames = request.getParameterNames();
 	    while( paramNames.hasMoreElements() )
                  {
                                 String paramName = (String)paramNames.nextElement();
                                 out.print(paramName);
                                 String paramValue = request.getParameter(paramName);
                                 out.println(paramValue);  
                      }
               } 
    }
