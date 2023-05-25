package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class DisplayDetails_jsp extends org.apache.jasper.runtime.HttpJspBase
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
out.write("  <head>\n");
out.write("  <title>Student Information</title>\n");
out.write("  <meta charset=\"UTF-8\">\n");
out.write("   <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n");
out.write("    </head>\n");
out.write("    <body>\n");
out.write("        <h2>Student Details </h2>\n");
out.write("        ");

studentinformation.StudentBean s1 = new studentinformation.StudentBean();
            s1.setId(request.getParameter("studentid"));
            s1.setName(request.getParameter("studentname"));
            s1.setProgram(request.getParameter("studentprogram"));

            try {
                s1.setSemester(Integer.parseInt(request.getParameter("studentsemester")));
                s1.setMarks1(Double.parseDouble(request.getParameter("marks1")));
                s1.setMarks2(Double.parseDouble(request.getParameter("marks2")));
                s1.setMarks3(Double.parseDouble(request.getParameter("marks3")));
                s1.setGrade();
            } catch (NumberFormatException nfe) {

            }

out.write("\n");
out.write("        <table>\n");
out.write("            <tr><td>Student ID : </td><td> ");
      out.print(s1.getId());
out.write("<br/></td></tr> \n");
out.write("            <tr><td>Student Name : </td><td> ");
      out.print(s1.getName());
out.write("<br/></td></tr> \n");
out.write("            <tr><td>Student Enrolled Program: </td><td> ");
      out.print(s1.getProgram());
out.write("<br/></td></tr> \n");
out.write("            <tr><td>Java Marks  : </td><td>");
      out.print(s1.getMarks1());
out.write("<br/></td></tr> \n");
out.write("            <tr><td>PHP Marks  : </td><td>");
      out.print(s1.getMarks2());
out.write("<br/></td></tr> \n");
out.write("            <tr><td>.Net Marks  : </td><td>");
      out.print(s1.getMarks3());
out.write("<br/></td></tr> \n");
out.write("            <tr><td>Grade  : </td><td>");
      out.print(s1.getGrade());
out.write("<br/></td></tr> \n");
out.write("\n");
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
