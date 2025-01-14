package de.bht.pr2.lab04;

import java.io.Serializable;

public class Student implements Serializable{
    private static final long serialVersionUID = 1L;
    private String name;
    private int registrationNumber;

    public Student(String name, int registrationNumber){
        this.name = name;
        this.registrationNumber = registrationNumber;
    }

    public String getName(){
        return this.name;
    }

    public int getRegistrationNumber(){
        return this.registrationNumber;
    }

    public String toString(){
        return "Student: " + this.name + ", RegistrationNb: " + this.registrationNumber;
    }
}
