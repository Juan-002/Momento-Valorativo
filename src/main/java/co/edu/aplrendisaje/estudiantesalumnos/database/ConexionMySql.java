package co.edu.aplrendisaje.estudiantesalumnos.database;


import co.edu.aplrendisaje.estudiantesalumnos.dao.Course;
import co.edu.aplrendisaje.estudiantesalumnos.dao.Student;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class ConexionMySql {

    private String user;
    private String password;
    private int port;
    private String host;
    private String nameDatabase;
    private Connection cnn;

    public ConexionMySql() {
        user = "root";
        password = "";
        port = 3306;
        host = "localhost";
        nameDatabase = "momentovalorativo";
    }

    private void createConexion() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            cnn = DriverManager.getConnection(
                    "jdbc:mysql://" + host + ":" + port + "/" + nameDatabase, user, password
            );
            System.out.println("Successful connection");
        } catch (ClassNotFoundException | SQLException e) {
            System.out.println("An error occurred during the connection");
            throw new RuntimeException(e);
        }
    }

    public List<Student> getStudent() throws SQLException {
        List<Student> students = new ArrayList<Student>(); // de un interfaz no se puede eredar una instancia
        String sql = "SELECT * FROM students";
        try {
            createConexion();
            Statement stmt = cnn.createStatement();
            ResultSet result = stmt.executeQuery(sql);
            while (result.next()) {
                Student student = new Student();
                student.setId(result.getInt("id"));
                student.setName(result.getString("name"));
                student.setLastName(result.getString("lastName"));
                student.setAge(result.getInt("age"));
                student.setCreateAT(result.getDate("createdAT"));
                student.setUpdateAT(result.getDate("updatedAT"));
                student.setDeleteAT(result.getDate("deletedAT"));
               // student.setCourse(this.getCourse(student.getId()));
                students.add(student);
            }

            stmt.close();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally {
            cnn.close();
        }
        return students;
    }


    public List<Course> getCourse(int idStudent) throws SQLException {
        List<Course> courses = new ArrayList<Course>(); // de un interfaz no se puede eredar una instancia
        String sql = "SELECT c.* FROM courses as c INNER JOIN detalcoursesstudents as d on c.id = d.isCourse WHERE d.idStudent = " + idStudent;
        try {
            createConexion();
            Statement stmt = cnn.createStatement();
            ResultSet result = stmt.executeQuery(sql);
            while (result.next()) {
                Course course = new Course();
                course.setId(result.getInt("id"));
                course.setName_course(result.getString("name_course"));
                course.setTeacher(result.getString("teacher"));
                course.setDescription(result.getString("description"));
                course.setCreatedAT(result.getDate("createdAT"));
                course.setUpdatedAT(result.getDate("updatedAT"));
                course.setDeletedAT(result.getDate("deletedAT"));
                courses.add(course);
            }
            stmt.close();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally {
            cnn.close();
        }
        return courses;
    }


}
