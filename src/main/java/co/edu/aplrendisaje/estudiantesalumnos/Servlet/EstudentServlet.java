package co.edu.aplrendisaje.estudiantesalumnos.Servlet;

import co.edu.aplrendisaje.estudiantesalumnos.database.ConexionMySql;
import co.edu.aplrendisaje.estudiantesalumnos.dao.Student;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;
import java.util.ArrayList;

@WebServlet(name = "estudentServlet", value = "/Student")
public class EstudentServlet extends HttpServlet {
    private ConexionMySql cnn;
    private GsonBuilder gsonBuilder;
    private Gson gson;
    public void init() {
        cnn = new ConexionMySql();
        gsonBuilder = new GsonBuilder();
        gson = gsonBuilder.create();
    }

    @Override
    protected void doPut(HttpServletRequest req, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html");

        // Hello
        PrintWriter out = response.getWriter();
        out.println("<html><body>");
        out.println("<h1>PUT</h1>");
        out.println("</body></html>");
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html");

        // Hello
        PrintWriter out = response.getWriter();
        out.println("<html><body>");
        out.println("<h1>POST</h1>");
        out.println("</body></html>");
    }

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        /*response.setContentType("application/json");
        try {
            if(request.getParameter("id") == null) {
                ArrayList<Student> listStudents = (ArrayList<Student>) cnn.getStudent();
                PrintWriter out = response.getWriter();
                out.print(gson.toJson(listStudents));
                out.flush();
            }else{

            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }*/

        response.setContentType("text/html");

        // Hello
        PrintWriter out = response.getWriter();
        out.println("<html><body>");
        out.println("<h1>" + "Este es un texto*******" + "</h1>");
        out.println("</body></html>");

    }

    public void destroy() {
    }
}