package de.bht.pr2.lab04;

import java.io.Serializable;

public class Grade implements Serializable {
    private static final long serialVersionUID = 1L;
    private Subscription subscription;
    private double grade;

    public Grade(Subscription subsription ,double grade){
        this.subscription = subsription;
        this.grade = grade;
    }

    public double getGrade(){
        return this.grade;
    }

    public Subscription getSubscription(){
        return this.subscription;
    }

    public String toString(){
        return this.subscription + " has the Grade: " + this.grade;
    }
}
