/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package src;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet(name = "ConsumeTemperature", urlPatterns = {"/ConsumeTemperature"})
public class ConsumeTemperature extends HttpServlet {
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        // Read request parameter check for null
        String temp=request.getParameter("txttemp");
        if(temp.equals(null)|| temp.equals(""))
            temp="32";
        // Get the reference to Object to access the method.    
        TempConvert tempconvert= new TempConvert();
        TempConvertSoap tempconvertsoap= tempconvert.getTempConvertSoap();
        
        try (PrintWriter out = response.getWriter()) {
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet ConsumeTemperature</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Celcisus to Fahrenheit temperature is:" 
                    + tempconvertsoap.celsiusToFahrenheit(temp) + "</h1>");
            out.println("</body>");
            out.println("</html>");
        }
    }
}