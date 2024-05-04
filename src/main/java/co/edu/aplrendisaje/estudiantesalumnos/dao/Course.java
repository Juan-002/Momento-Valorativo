package co.edu.aplrendisaje.estudiantesalumnos.dao;

import java.sql.Time;
import java.util.Date;
public class Course {
    private int id;
    private String name_course;
    private String teacher;
    private String description;
    private Date createdAT;
    private Date updatedAT;
    private Date deletedAT;

    public Course() {

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName_course() {
        return name_course;
    }

    public void setName_course(String name_course) {
        this.name_course = name_course;
    }

    public String getTeacher() {
        return teacher;
    }

    public void setTeacher(String teacher) {
        this.teacher = teacher;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Date getCreatedAT() {
        return createdAT;
    }

    public void setCreatedAT(Date createdAT) {
        this.createdAT = createdAT;
    }

    public Date getUpdatedAT() {
        return updatedAT;
    }

    public void setUpdatedAT(Date updatedAT) {
        this.updatedAT = updatedAT;
    }

    public Date getDeletedAT() {
        return deletedAT;
    }

    public void setDeletedAT(Date deletedAT) {
        this.deletedAT = deletedAT;
    }
}

