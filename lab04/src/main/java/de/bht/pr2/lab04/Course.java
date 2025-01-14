package de.bht.pr2.lab04;

import java.io.Serializable;

public class Course implements Serializable{
    private static final long serialVersionUID = 1L;
    private String name;
    private String studyCourse;

    public Course(String name, String studyCourse){
        this.name = name;
        this.studyCourse = studyCourse;
    }

    public String getName(){
        return this.name;
    }

    public String getStudyCourse(){
        return this.studyCourse;
    }

    public String toString(){
        return "Course: " + this.name + ", StudyCourse: " + this.studyCourse;
    }
}
