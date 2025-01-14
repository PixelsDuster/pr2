package de.bht.pr2.lab04;

import java.io.Serializable;

public class Subscription implements Serializable{
    private static final long serialVersionUID = 1L;
    private Student student;
    private Course course;

    public Subscription(Student student, Course course){
        this.student = student;
        this.course = course;
    }

    public Student getStudent(){
        return this.student;
    }

    public Course getCourse(){
        return this.course;
    }

    public String toString(){
        return "Student: " + this.student.getName() + " belegt " + this.course.getName();
    }
}
