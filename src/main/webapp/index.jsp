<%@ page import="co.edu.aplrendisaje.estudiantesalumnos.dao.Student" %>
<%@ page import="co.edu.aplrendisaje.estudiantesalumnos.database.ConexionMySql" %>
<%@ page import="java.util.List" %>

<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <title>JSP - Hello World</title>
</head>
<body>
<h1><%= "Hello World!" %>
</h1>
<br/>




<table>
    <thead>
    <tr>
        <th>DNI</th>
        <th>Nombre</th>
        <th>Apellido</th>
        <th>nombre</th>
        <th>edad</th>
    </tr>
    </thead>
    <tbody>

    <%
        ConexionMySql conexion = new ConexionMySql();
        List<Student> students = conexion.getStudent();
        for (Student student : students) {
    %>
    <tr>
        <td><%= student.getId() %></td>
        <td><%= student.getName() %></td>
        <td><%= student.getLastName() %></td>
        <td><%= student.getAge() %></td>
    </tr>
    <% } %>
    </tbody>
</table>



<a href="hello-servlet">Hello Servlet</a>
</body>
</html>