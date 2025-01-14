package de.bht.pr2.lab04;

import java.util.*;
import java.io.Serializable;

public class Certificate implements Serializable{
    private static final long serialVersionUID = 1L;
    private Student student;
    private List<Grade> grades;

    public Certificate(Student student){
        this.student = student;
        this.grades = new ArrayList<>();
    }

    public Student getStudent(){
        return this.student;
    }

    public List<Grade> getGrades(){
        if(this.grades.isEmpty()) return null;
        return this.grades;
    }

    public void addGrade(Grade grade){
        this.grades.add(grade);
    }

    public String toString(){
        return this.student + "'s grades: " + this.grades; 
    }
}
