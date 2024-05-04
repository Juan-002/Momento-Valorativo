package co.edu.aplrendisaje.estudiantesalumnos.dao;

import java.sql.Time;
import java.util.Date;
import java.util.List;

public class Student {
    private int id;
    private String name;
    private String lastName;
    private int age;
    private Date createdAT;
    private Date updatedAT;
    private Date deletedAT;
    private List<Course> course;

    public Student() {
        this.id = id;
        this.name = name;
    }
   /* public List<Course> getCourse() {
        return course;
    }

    public void setCourse(List<Course> course) {
        this.course = course;
    }*/

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Date getCreateAT() {
        return createdAT;
    }

    public void setCreateAT(Date createAT) {
        this.createdAT = createAT;
    }

    public Date getUpdateAT() {
        return updatedAT;
    }

    public void setUpdateAT(Date updateAT) {
        this.updatedAT = updateAT;
    }

    public Date getDeleteAT() {
        return deletedAT;
    }

    public void setDeleteAT(Date deleteAT) {
        this.deletedAT = deleteAT;
    }
}
