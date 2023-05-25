import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class CourseCredit_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      response.setContentType("application/vnd.ms-excel");
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

      out.write("<!--\n");
      out.write("JSP page to record the course code, course name and \n");
      out.write("credits assigned to the course.\n");
      out.write("-->\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("                                                                                                                       	\n");
      out.write('\n');
 response.setHeader("Content-Disposition", "attachment; filename=\"mult-table.xls\""); 
      out.write('\n');
      out.write('\n');
      out.write(" \n");
      out.write("<table>\n");
      out.write("    <tr> \n");
      out.write("        <th>Course Code</th>\n");
      out.write("        <th>Course Name</th>\n");
      out.write("        <th>Course Credit</th>\n");
      out.write("    </tr>\n");
      out.write("    <tr>\n");
      out.write("        <td>MS101</td>\n");
      out.write("        <td>JAVA</td>\n");
      out.write("        <td>6</td>\n");
      out.write("    </tr>\n");
      out.write("    <tr>\n");
      out.write("        <td>MS102</td>\n");
      out.write("        <td>PHP</td>\n");
      out.write("        <td>6</td>\n");
      out.write("    </tr>\n");
      out.write("     <tr>\n");
      out.write("        <td>MS103</td>\n");
      out.write("        <td>.NET </td>\n");
      out.write("        <td>6</td>\n");
      out.write("    </tr>\t\n");
      out.write("</table>");
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
