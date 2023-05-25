package src;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(name = "StudentMarks", urlPatterns = {"/StudentMarks"})
public class StudentMarks extends HttpServlet {
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        Student s=new Student();
        Double m1=0.0,m2=0.0,m3=0.0,total=0.0,per=0.0;
        String grade;
s.setStudentid(request.getParameter("txtid"));
s.setStudentname(request.getParameter("txtname"));

        try
        {
          m1=Double.parseDouble(request.getParameter("txtmarks1"));
          m2=Double.parseDouble(request.getParameter("txtmarks2"));
          m3=Double.parseDouble(request.getParameter("txtmarks3"));
        }
catch(NumberFormatException nfe)
        {
    System.out.println(nfe);
        }
s.setMarks1(m1);
s.setMarks2(m2);
s.setMarks3(m3);

        total=s.getMarks1()+s.getMarks2()+s.getMarks3();
        per=total/3;

        if ( s.getMarks1()<35 || s.getMarks2()<35 || s.getMarks3()<35 )
            grade="FF";
        else if ( per>= 80 )
            grade="AA";
        else if (per >= 70)
            grade="BB";
        else if (per >= 60)
            grade="CC";
        else if ( per>= 50)
            grade="DD";
        else
            grade="FF";
        System.out.println("grade : "+grade);
s.setGrade(grade);

request.setAttribute("s",s);

        RequestDispatcher dispatcher = request.getRequestDispatcher("studentresult.jsp");
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
        return "Student Marks Handler";
    }
}
