public class ShowParameters extends HttpServlet 
	{
	  public void doGet(HttpServletRequest request,   HttpServletResponse response)
	 {
	    response.setContentType("text/html");
	    PrintWriter out = response.getWriter();
                String title=" Request Headers ";
    	    String docType =   "<!DOCTYPE  html>\n";
	    out.println(docType +"<HTML>\n" +"<HEAD><TITLE>" + title + "</TITLE> 	  
                </HEAD>\n" +"<BODY >\n" +"<H1>" + title + "</H1>" );
              out.println("Accept-Encoding : "+request.getHeader("Accept-Encoding"));
              out.println("Accept-Language : "+request.getHeader("Accept-Language"));
              out.println("Host : "+request.getHeader("Host"));
              out.println("Referer : "+request.getHeader("Referer"));
              out.println("User-Agent : "+request.getHeader("User-Agent"));
          } 
}