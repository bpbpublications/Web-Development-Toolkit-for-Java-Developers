import java.io.IOException;
import java.util.Date;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class BeanServlet extends HttpServlet {
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        Faculty f = new Faculty();
        CourseDetails c = new CourseDetails();
        TimeTable t = new TimeTable();

f.setFacultyId(request.getParameter("txtfid"));
f.setFacultyName(request.getParameter("txtfname"));

        c.setProgramName(request.getParameter("txtprg"));
        c.setSemesterNumber(request.getParameter("txtsem"));
        c.setCourseId(request.getParameter("txtcid"));
        c.setCourseName(request.getParameter("txtcname"));

        String dt = request.getParameter("txtdate");
        Date d = new Date(dt);
String[] strDays = new String[]{"Sunday", "Monday", "Tuesday", "Wednesday", 
"Thursday","Friday", "Saturday"};
t.setDateofweek(dt);
t.setDayofweek(strDays[d.getDay()]);
t.setHourofday(request.getParameter("txthour"));
t.setFaculty(f);
t.setCourse(c);

request.setAttribute("t", t);

        RequestDispatcher dispatcher = request.getRequestDispatcher("beanvalues.jsp");
        dispatcher.forward(request, response);
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
processRequest(request, response);
    }


    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
processRequest(request, response);
    }


    @Override
    public String getServletInfo() {
        return "Short description";
    }

}

