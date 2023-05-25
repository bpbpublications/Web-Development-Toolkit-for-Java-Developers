//PlainTextServlet.java
import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
public class PlainTextServlet extends HttpServlet {
  public void doGet(HttpServletRequest request,HttpServletResponse response)
                                                                 throws ServletException, IOException 
      {
               PrintWriter out = response.getWriter();
                out.println("Hello M.Sc.(IT) semester III students");
      }
}