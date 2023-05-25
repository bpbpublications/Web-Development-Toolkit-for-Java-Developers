e)	Resultant Servlet for DisplayDetails_1.jsp
package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class DisplayDetails_005f1_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
response.setContentType("text/html");
response.setHeader("X-Powered-By", "JSP/2.2");
      pageContext = _jspxFactory.getPageContext(this, request, response,
			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

out.write("<!DOCTYPE html>\n");
out.write("<html>\n");
out.write("    <head>\n");
out.write("        <title>Student Information</title>\n");
out.write("        <meta charset=\"UTF-8\">\n");
out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n");
out.write("    </head>\n");
out.write("    <body>\n");
out.write("        <h2>Student Details </h2>\n");
out.write("        ");
studentinformation.StudentBean s1 = null;
      synchronized (_jspx_page_context) {
        s1 = (studentinformation.StudentBean) _jspx_page_context.getAttribute("s1", PageContext.PAGE_SCOPE);
        if (s1 == null){
          s1 = new studentinformation.StudentBean();
          _jspx_page_context.setAttribute("s1", s1, PageContext.PAGE_SCOPE);
        }
      }
out.write("\n");
out.write("        ");
org.apache.jasper.runtime.JspRuntimeLibrary.handleSetProperty(_jspx_page_context.findAttribute("s1"), "id",request.getParameter("studentid"));
out.write("\n");
out.write("        ");
org.apache.jasper.runtime.JspRuntimeLibrary.handleSetProperty(_jspx_page_context.findAttribute("s1"), "name",request.getParameter("studentname"));
out.write("\n");
out.write("        ");
org.apache.jasper.runtime.JspRuntimeLibrary.handleSetProperty(_jspx_page_context.findAttribute("s1"), "program",request.getParameter("studentprogram"));
out.write("\n");
out.write("        ");

            int sem=0;
            double marks1=0, marks2=0, marks3=0;
            try {
                sem = Integer.parseInt(request.getParameter("studentsemester"));
                marks1 = Double.parseDouble(request.getParameter("marks1"));
                marks2 = Double.parseDouble(request.getParameter("marks2"));
                marks3 = Double.parseDouble(request.getParameter("marks3"));
            } catch (NumberFormatException nfe) {

            }

out.write("\n");
out.write("        ");
org.apache.jasper.runtime.JspRuntimeLibrary.handleSetProperty(_jspx_page_context.findAttribute("s1"), "semester",sem);
out.write("\n");
out.write("        ");
org.apache.jasper.runtime.JspRuntimeLibrary.handleSetProperty(_jspx_page_context.findAttribute("s1"), "marks1",marks1);
out.write("\n");
out.write("        ");
org.apache.jasper.runtime.JspRuntimeLibrary.handleSetProperty(_jspx_page_context.findAttribute("s1"), "marks2",marks2);
out.write("\n");
out.write("        ");
org.apache.jasper.runtime.JspRuntimeLibrary.handleSetProperty(_jspx_page_context.findAttribute("s1"), "marks3",marks3);
out.write("\n");
out.write("        ");
org.apache.jasper.runtime.JspRuntimeLibrary.introspecthelper(_jspx_page_context.findAttribute("s1"), "grade", "Default", null, null, false);
out.write("\n");
out.write("        \n");
out.write("        <table>\n");
out.write("            <tr><td>Student ID : </td><td> ");
out.write(org.apache.jasper.runtime.JspRuntimeLibrary.toString((((studentinformation.StudentBean)_jspx_page_context.findAttribute("s1")).getId())));
out.write(" <br/></td></tr> \n");
out.write("            <tr><td>Student Name : </td><td> ");
out.write(org.apache.jasper.runtime.JspRuntimeLibrary.toString((((studentinformation.StudentBean)_jspx_page_context.findAttribute("s1")).getName())));
out.write("<br/></td></tr> \n");
out.write("            <tr><td>Student Enrolled Program: </td><td> ");
out.write(org.apache.jasper.runtime.JspRuntimeLibrary.toString((((studentinformation.StudentBean)_jspx_page_context.findAttribute("s1")).getProgram())));
out.write("<br/></td></tr> \n");
out.write("            <tr><td>Java Marks  : </td><td>");
out.write(org.apache.jasper.runtime.JspRuntimeLibrary.toString((((studentinformation.StudentBean)_jspx_page_context.findAttribute("s1")).getMarks1())));
out.write("<br/></td></tr> \n");
out.write("            <tr><td>PHP Marks  : </td><td>");
out.write(org.apache.jasper.runtime.JspRuntimeLibrary.toString((((studentinformation.StudentBean)_jspx_page_context.findAttribute("s1")).getMarks2())));
out.write("<br/></td></tr> \n");
out.write("            <tr><td>.Net Marks  : </td><td>");
out.write(org.apache.jasper.runtime.JspRuntimeLibrary.toString((((studentinformation.StudentBean)_jspx_page_context.findAttribute("s1")).getMarks3())));
out.write("<br/></td></tr> \n");
out.write("            <tr><td>Grade  : </td><td>");
out.write(org.apache.jasper.runtime.JspRuntimeLibrary.toString((((studentinformation.StudentBean)_jspx_page_context.findAttribute("s1")).getGrade())));
out.write("<br/></td></tr> \n");
out.write("        </table>\n");
out.write("    </body>\n");
out.write("</html>\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
