package co.edu.aplrendisaje.estudiantesalumnos.Servlet;

import co.edu.aplrendisaje.estudiantesalumnos.dao.Student;
import co.edu.aplrendisaje.estudiantesalumnos.database.ConexionMySql;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.*;
import java.sql.SQLException;
import java.util.ArrayList;

import javax.servlet.http.*;
import javax.servlet.annotation.*;

@WebServlet(name = "estudentServlet", value = "/Students")
public class EstudentServlet extends HttpServlet {
    private ConexionMySql cnn;
    private GsonBuilder gsonBuilder;
    private Gson gson;

    public void init() {
        cnn = new ConexionMySql();
        gsonBuilder = new GsonBuilder();
        gson = gsonBuilder.create();
    }

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        response.setContentType("application/json");
        try {
            if(request.getParameter("id") == null) {
                ArrayList<Student> listStudents = (ArrayList<Student>) cnn.getStudent();
                PrintWriter out = response.getWriter();
                out.print(gson.toJson(listStudents));
                out.flush();
                // Hello

            }else{

            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public void destroy() {
    }
}