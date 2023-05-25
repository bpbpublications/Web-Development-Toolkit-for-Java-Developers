import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.HashMap;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet(name = "ScopedVariables", urlPatterns = {"/ScopedVariables"})
public class ScopedVariables extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

request.setAttribute("requestscopevariable", "Hello from Request Scope"); 
		
                HttpSession session = request.getSession(); 
session.setAttribute("sessionscopevariable", "Hello from Session Scope"); 
		
                ServletContext application = getServletContext(); 	
application.setAttribute("applicationscopevariable", "Hello from Application 
Scope"); 
		
request.setAttribute("commonscopevariable", "Request Scope"); 	
session.setAttribute("commonscopevariable", "Session Scope"); 	
application.setAttribute("commonscopevariable", "Application Scope");    

                RequestDispatcher dispatcher = request.getRequestDispatcher("scopedvars.jsp");
                dispatcher.forward(request, response);
        }
    }
