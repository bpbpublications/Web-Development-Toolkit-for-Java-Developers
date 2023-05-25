// HTMLServlet.java
	import java.io.*;          
	import javax.servlet.*;      
	import javax.servlet.http.*;
	
public class HTMLServlet extends HttpServlet {
	  public void doGet(HttpServletRequest request, HttpServletResponse response)
    	  throws ServletException, IOException 
      	 {
      	   response.setContentType("text/html");
      	   PrintWriter out = response.getWriter();
      	   String docType = "<!DOCTYPE  html">\n";
      	   out.println(docType +"<HTML>\n" +
                                           "<HEAD><TITLE>Hello</TITLE> </HEAD>\n“ +                        
                                           "<BODY>\n" +
                                           "<H1>Hello M.Sc.(IT)  III students</H1>\n" +
                                           "</BODY></HTML>");
  	}
}
