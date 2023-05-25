import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.HashMap;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(name = "Collections", urlPatterns = {"/Collections"})

public class Collections extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

String[] artistnames = {"Michael Jackson", "Rihanna", "Abbey Lincoln","Little Richard"};

            ArrayList musicgenre = new ArrayList();
musicgenre.add("Pop Music");
musicgenre.add("Rhythm and Blues");
            musicgenre.add("Jazz");
            musicgenre.add("Rock");

            HashMap origin = new HashMap();
origin.put("Pop Music", "United States and United Kingdom");
origin.put("Rhythm and Blues", "African American communities");
origin.put("Jazz", " African-American ");
origin.put("Rock", " United States ");

request.setAttribute("artist", artistnames);
request.setAttribute("genre", musicgenre);
request.setAttribute("origin", origin);

            RequestDispatcher dispatcher = request.getRequestDispatcher("collections.jsp");
            dispatcher.forward(request, response);
        }

    }
