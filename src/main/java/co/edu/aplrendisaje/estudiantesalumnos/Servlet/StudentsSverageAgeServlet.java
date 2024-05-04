package co.edu.aplrendisaje.estudiantesalumnos.Servlet;

import co.edu.aplrendisaje.estudiantesalumnos.dao.Student;
import co.edu.aplrendisaje.estudiantesalumnos.database.ConexionMySql;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

@WebServlet(name = "StudentsAverageAge", value = "/students-average-age")
public class StudentsSverageAgeServlet extends HttpServlet {
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
                ArrayList<Student> listStudentsAverageAge=new ArrayList<Student>();
                float averageAge=0;
                for (int i = 0; i < listStudents.size(); i++) {
                    averageAge+=listStudents.get(i).getAge();
                }
                averageAge=averageAge/listStudents.size();
                for (int i = 0; i < listStudents.size(); i++) {
                    if(listStudents.get(i).getAge()>averageAge){
                        listStudentsAverageAge.add(listStudents.get(i));
                    }
                }
                PrintWriter out = response.getWriter();
                out.print(gson.toJson(listStudentsAverageAge));
                out.flush();

            }else{

            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public void destroy() {
    }
}