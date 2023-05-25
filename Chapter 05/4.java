//StudentServlet.java
package src;
import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class StudentServlet extends HttpServlet
{

    @Override
    public void doGet( HttpServletRequest request, HttpServletResponse response)
                                                         throws ServletException,IOException
    	{

	System.out.println("Inside get method ");
	PrintWriter out=response.getWriter();
	String id, name, prg;

	id = request.getParameter("studentid");
            name = request.getParameter("studentname");
            prg = request.getParameter("progsem");

            out.println(" <HTML> "
                              +  " <HEAD> "
                              + " <TITLE> HTML SERVLET </TITLE> "
                              + " </HEAD> "
                              + " <BODY> "
                              + " <H1> "
                              + " Student Details "
                              + " </H1> "
                              +" <h3> <span style = color:blue > 
                                               Student ID :
                                           </span>
                                           <span style = color:maroon> " + id + " 
                                            </span> <br/> "
                                      + " <span style = color:blue >
                                            Student Name : 
                                            </span>
                                           <span style = color:maroon > "
                                           + name + " 
                                           </span> <br/> "
                                           + " <span style = color:blue >
                                           Student Programme and Semester : 
                                          </span>
                                         <span style = color:maroon > " + prg + " 
                                         </span> <br/> "
                            + " </BODY> "
                            + " </HTML> ");
    }